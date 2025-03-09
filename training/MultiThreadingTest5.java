package training;

public class MultiThreadingTest5 {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Thread is running: " + Thread.currentThread().getName());
        Thread thread = new Thread(task);
        thread.start();
    }
}
