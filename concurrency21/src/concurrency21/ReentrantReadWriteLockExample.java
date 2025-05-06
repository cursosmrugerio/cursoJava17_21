package concurrency21;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ReentrantReadWriteLockExample {

    // El recurso compartido que protegeremos con el lock.
    private static String sharedResource = "Valor Inicial";

    // Instancia del ReentrantReadWriteLock.
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true); // true para política "fair" (justa)
    private static final ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
    private static final ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

    // Método para simular una lectura del recurso.
    public static String readResource(String threadName) {
        readLock.lock(); // Adquiere el candado de lectura.
        try {
            System.out.println(threadName + " [Leyendo] - Lock adquirido. Valor actual: " + sharedResource);
            // Simula tiempo de lectura.
            try {
                Thread.sleep((long) (Math.random() * 500) + 100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return sharedResource;
        } finally {
            System.out.println(threadName + " [Leyendo] - Liberando lock.");
            readLock.unlock(); // Libera el candado de lectura.
        }
    }

    // Método para simular una escritura en el recurso.
    public static void writeResource(String threadName, String newValue) {
        writeLock.lock(); // Adquiere el candado de escritura (exclusivo).
        try {
            System.out.println(threadName + " [Escribiendo] - Lock adquirido. Cambiando valor...");
            sharedResource = newValue;
            // Simula tiempo de escritura.
            try {
                Thread.sleep((long) (Math.random() * 1000) + 500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(threadName + " [Escribiendo] - Valor cambiado a: " + sharedResource);
        } finally {
            System.out.println(threadName + " [Escribiendo] - Liberando lock.");
            writeLock.unlock(); // Libera el candado de escritura.
        }
    }

    public static void main(String[] args) {
        System.out.println("Iniciando simulación con 3 hilos...");

        // Usamos un ExecutorService para manejar los hilos.
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Hilo 1: Realiza lecturas y una escritura.
        executor.submit(() -> {
            String threadName = "Hilo-LectorEscritor-1";
            readResource(threadName);
            readResource(threadName);
            writeResource(threadName, "Valor cambiado por Hilo 1");
            readResource(threadName);
        });

        // Hilo 2: Realiza principalmente lecturas.
        executor.submit(() -> {
            String threadName = "Hilo-Lector-2";
            readResource(threadName);
            readResource(threadName);
            try { Thread.sleep(100); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            readResource(threadName);
            readResource(threadName);
        });

        // Hilo 3: Realiza una escritura y luego lecturas.
        executor.submit(() -> {
            String threadName = "Hilo-EscritorLector-3";
            // Espera un poco para no competir inmediatamente por la primera escritura.
            try { Thread.sleep(200); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            writeResource(threadName, "Valor final por Hilo 3");
            readResource(threadName);
            readResource(threadName);
        });

        // Espera a que los hilos terminen.
        executor.shutdown();
        try {
            if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                System.err.println("Los hilos no terminaron a tiempo, forzando cierre.");
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("\nSimulación finalizada. Valor final del recurso: " + sharedResource);
    }
}

