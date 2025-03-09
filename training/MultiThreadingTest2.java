package training;

class Thread1 extends Thread
{

    public Thread1(String name)
    {
        super(name);
        System.out.println(name);
    }
    public void run()
    {
        System.out.println("I'm Executing....");
    }
}


public class MultiThreadingTest2 {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Hey");
        t1.start();
    }
}
