package training;

class Thread4 implements Runnable
{

    @Override
    public void run() {
        System.out.println("Executing Runnable Interface...");
    }
}


public class MultiThreadingTest4 {

    public static void main(String[] args) {
        Thread4 task = new Thread4();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);


        t1.start();
        t2.start();
    }
}
