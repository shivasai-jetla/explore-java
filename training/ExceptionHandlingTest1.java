package training;

public class ExceptionHandlingTest1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            if(b == 0)
            {
            throw new ArithmeticException("Enter number");
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }

    }

}
