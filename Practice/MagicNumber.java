package Practice;

//sum all the digits of given number and add the sum equal to 1 is a magic number
//Example: 1234 => 1+2+3+4 = 10 => 1+0 = 1 => Magic Number
public class MagicNumber {


    public static void main(String[] args) {
        int num = 1234;
        int rem;
        int sum = 0;
        int digitSum = 0;

        while(num > 0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;

        }

        while(sum > 0)
        {
            int rem1 = sum % 10;
            digitSum = digitSum + rem1;
            sum = sum / 10;

        }


        if(digitSum == 1)
        {
            System.out.println("Magic Number");
        }
        else{
            System.out.println("Not a Magic Number");
        }


    }
}

