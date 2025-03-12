package Diksha;

public class ExceptionHandlingTest1 {

    public static void main(String[] args) {

        int a = 30;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        }

        catch (ArithmeticException ae)
        {
            System.out.println(ae);
        }

    }
}
