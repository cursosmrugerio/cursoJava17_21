package com.sim._47;

class Writer {
	private static final int LOOPSIZE = 5;

	public synchronized void write(Data... da) {
		for (int i = 0; i < LOOPSIZE; i++) {
			while (!da[0].own(this))
				;
			while (!da[1].own(this))
				;
			da[0].write(i);
			da[1].write(i);
			da[1].release();
			da[0].release();
		}
	}
}

class Data {
	Writer writer;
	int id;

	public Data(int id) {
		this.id = id;
	}

	public synchronized boolean own(Writer w) {
		if (writer == null) {
			writer = w;
			return true;
		} else
			return false;
	}

	public synchronized void release() {
		writer = null;
	}

	public void write(int i) {
		System.out.println("data written W" + i + " D" + id);
	}
}

public class TestClass {
	public static void main(String[] args) {
		var w1 = new Writer();
		var w2 = new Writer();
		var d1 = new Data(1);
		var d2 = new Data(2);
		new Thread(() -> {
			w1.write(d1, d2);
		}).start();
		new Thread(() -> {
			w2.write(d1, d2);
		}).start();
	}
}