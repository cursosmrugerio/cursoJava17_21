package com.curso.v0;

import java.util.concurrent.locks.ReentrantLock;

//PROBLEMATIC CODE - Lock is not private final
class UnsafeAccount {
	private String id;
	private double balance = 1000.0;

	// PROBLEM: Lock is public and not final!
	ReentrantLock lock = new ReentrantLock();

	public void withdraw(double amt) {
		lock.lock();
		try {
			System.out.println(
					"Thread " + Thread.currentThread().getName() + " acquired lock: " + System.identityHashCode(lock));
			if (balance >= amt) {
				balance -= amt;
				System.out.println("Withdrew " + amt + ", balance: " + balance);
			}
		} finally {
			lock.unlock();
		}
	}

	public double getBalance() {
		return balance; // Also not thread-safe!
	}
}

//CORRECT CODE - Lock is private final
class SafeAccount {
	private String id;
	private double balance = 1000.0;

	// CORRECT: Lock is private final
	private final ReentrantLock lock = new ReentrantLock();

	public void withdraw(double amt) {
		lock.lock();
		try {
			System.out.println(
					"Thread " + Thread.currentThread().getName() + " acquired lock: " + System.identityHashCode(lock));
			if (balance >= amt) {
				balance -= amt;
				System.out.println("Withdrew " + amt + ", balance: " + balance);
			}
		} finally {
			lock.unlock();
		}
	}

	public double getBalance() {
		lock.lock();
		try {
			return balance;
		} finally {
			lock.unlock();
		}
	}
}

//Demonstration of the problem
public class LockVisibilityDemo {
	public static void main(String[] args) throws InterruptedException {
		demonstrateProblem();
		System.out.println("\n" + "=".repeat(50) + "\n");
		demonstrateSolution();
	}

	static void demonstrateProblem() {
		System.out.println("DEMONSTRATING THE PROBLEM:");
		System.out.println("Lock is not private final - can be reassigned!");

		UnsafeAccount account = new UnsafeAccount();

		// Thread 1: Normal withdrawal
		Thread thread1 = new Thread(() -> {
			account.withdraw(100);
		}, "Thread-1");

		// Thread 2: Malicious thread that changes the lock!
		Thread thread2 = new Thread(() -> {
			// DISASTER: Replace the lock with a new one!
			account.lock = new ReentrantLock();
			System.out.println("Thread-2 REPLACED the lock with: " + System.identityHashCode(account.lock));
			account.withdraw(200);
		}, "Thread-2");

		// Thread 3: Another withdrawal
		Thread thread3 = new Thread(() -> {
			try {
				Thread.sleep(50); // Small delay
			} catch (InterruptedException e) {
			}
			account.withdraw(300);
		}, "Thread-3");

		thread1.start();
		thread2.start();
		thread3.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
		}

		System.out.println("Final balance (unsafe): " + account.getBalance());
		System.out.println("PROBLEM: Different threads used different locks!");
	}

	static void demonstrateSolution() {
		System.out.println("DEMONSTRATING THE SOLUTION:");
		System.out.println("Lock is private final - cannot be reassigned!");

		SafeAccount account = new SafeAccount();

		// Multiple threads trying to withdraw
		Thread[] threads = new Thread[3];
		for (int i = 0; i < 3; i++) {
			final int threadNum = i + 1;
			threads[i] = new Thread(() -> {
				account.withdraw(100 * threadNum);
			}, "Thread-" + threadNum);
		}

		// Start all threads
		for (Thread t : threads) {
			t.start();
		}

		// Wait for completion
		try {
			for (Thread t : threads) {
				t.join();
			}
		} catch (InterruptedException e) {
		}

		System.out.println("Final balance (safe): " + account.getBalance());
		System.out.println("SUCCESS: All threads used the same lock!");
	}
}

////Additional example showing why final is important
//class LockReassignmentExample {
//	// BAD: Not final
//	private ReentrantLock badLock = new ReentrantLock();
//
//	// GOOD: Private and final
//	private final ReentrantLock goodLock = new ReentrantLock();
//
//	private int counter = 0;
//
//	public void demonstrateProblem() {
//		// This is possible because badLock is not final!
//		badLock = new ReentrantLock(); // Oops! Now other threads use different lock
//
//		// This would cause a compilation error (which is what we want):
//		// goodLock = new ReentrantLock(); // Cannot assign to final field
//	}
//
//	public void incrementWithBadLock() {
//		badLock.lock(); // Might be locking a different object now!
//		try {
//			counter++;
//		} finally {
//			badLock.unlock();
//		}
//	}
//
//	public void incrementWithGoodLock() {
//		goodLock.lock(); // Always the same lock object
//		try {
//			counter++;
//		} finally {
//			goodLock.unlock();
//		}
//	}
//}
//
////Example from real-world scenario
//class BankingSystem {
//	private final ReentrantLock systemLock = new ReentrantLock(); // CORRECT
//	// private ReentrantLock systemLock = new ReentrantLock(); // WRONG
//
//	private double totalSystemBalance = 0.0;
//
//	public void addToSystemBalance(double amount) {
//		systemLock.lock();
//		try {
//			totalSystemBalance += amount;
//			System.out.println("System balance updated to: " + totalSystemBalance);
//		} finally {
//			systemLock.unlock();
//		}
//	}
//
//	// If lock wasn't final, a malicious or buggy code could do:
//	// public void breakSecurity() {
//	// systemLock = new ReentrantLock(); // Would break all synchronization!
//	// }
//}
