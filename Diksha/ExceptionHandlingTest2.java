package Diksha;

public class ExceptionHandlingTest2 {

    public static void main(String[] args) {

        try {
            int a = 30;
            int b = 0;


            int c = a / b;
            System.out.println(c);

            int[] arr = new int[1];

            arr[0] = 1;
            arr[1] = 3;

        }

        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }

        catch (ArrayIndexOutOfBoundsException ai)
        {
            System.out.println(ai);
        }


    }
}
