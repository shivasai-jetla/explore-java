package training;

public class Palindrome {
    public static void main(String[] args) {
        long a = 33211233;
        long rev = 0;
        long b = a;
        int i = 1;
        long rem;

        while(a > 0)
        {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a /10;
        }

        if(rev == b)
        {
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Non- Palindrome Number");
        }
    }
}
