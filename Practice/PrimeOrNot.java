package Practice;

public class PrimeOrNot {
    public static void main(String[] args)
    {
        int n = 7;
        int count = 0;
        for(int i =2; i <= n/2; i++)
        {
            if (n % i == 0)
            {
                count++;
                break;
            }
        }
            if(count == 1)
            {
                System.out.println("Non - Prime Number");
            }
            else{
                System.out.println("Prime Number");
            }

    }
}
