package training;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;

        int rem,i=1;

        while(num > 0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
            i++;
        }
        System.out.println("Reverse Number: "+rev);
    }
}
