package Concept;

public class MyThread1 extends Thread {

    MyThread1(String name)
    {
        super(name);
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1("T1");
        MyThread1 t2 = new MyThread1("T2");

        t1.start();
        //t1.join();  // Joins allows one thread to wait for another thread task completion.
        t2.start();
    }
}

