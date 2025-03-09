package DSA450;

public class UglyNumber {

    public  static boolean isUgly(int num)
    {
        boolean flag = false;

        if (num <= 0)
        {
            return false;
        }

        while(num % 2 == 0)
        {
            num = num / 2;
        }

        while (num % 3 == 0)
        {
            num = num / 3;
        }

        while(num % 5 == 0)
        {
            num = num / 5;
        }

        if(num == 1)
        {
            flag = true;
        }

        return flag;

    }

    public static void main(String[] args) {
        int num = 6;

        boolean result = isUgly(num);

        System.out.println(result ? "Ugly Number" : "Not Ugly Number" );
    }
}
