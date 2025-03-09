package Concept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submit 5 tasks to the thread pool
        for (int i = 1; i <= 5; i++) {
            int taskNumber = i; // Task number to identify the task
            executorService.submit(() -> {
                System.out.println("Task " + taskNumber + " is running by " + Thread.currentThread().getName());
                try {
                    // Simulate work by sleeping
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore interrupted status
                    System.out.println("Task " + taskNumber + " was interrupted.");
                }
                System.out.println("Task " + taskNumber + " finished by " + Thread.currentThread().getName());
            });
        }

        // Shut down the executor service
        executorService.shutdown();
    }
}
