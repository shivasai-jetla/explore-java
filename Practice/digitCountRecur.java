package Practice;

public class digitCountRecur {

    public static int digitCount(int num,int count)
    {
        if(num == 0)
        {
            return count;
        }
        return digitCount(num / 10,count + 1);
    }

    public static void main(String[] args) {

        int result = digitCount(23453,0);

        System.out.println("No.of digits: "+result);
    }
}
