package training;

public class EvenOrOddWithBitwise {
    public static void main(String[] args) {
        int a=1;

        if((a & 1) == 0)
        {
            System.out.println("Even Number");
        } else if ((a & 1) == 1)
        {
            System.out.println("Odd Number");
        }
        else {
            System.out.println("Invalid Number");
        }

    }
}
