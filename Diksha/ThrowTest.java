package Diksha;

public class ThrowTest {
    static void meth()
    {
        System.out.println("welcome to meth");
        throw new ArithmeticException("demo");
    }

    public static void main(String[] args)
    {
        try {
            meth();
            System.out.println("hello");
        }

        catch (ArithmeticException ae)
        {
            System.out.println(ae);
        }


    }
}
