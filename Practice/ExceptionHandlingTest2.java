package Practice;

public class ExceptionHandlingTest2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            if (b == 0) {
                throw new ArithmeticException("Please enter a number except zero");
            }
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae);
        }


    }
}
