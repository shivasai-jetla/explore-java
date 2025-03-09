package training;

class Thread2 extends Thread{

    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i+" "+ Thread.currentThread().getName());
            Thread.yield();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MultiThreadingTest3 {

    public static void main(String[] args) throws InterruptedException {

        Thread2 t1 = new Thread2();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
