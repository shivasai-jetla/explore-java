package Practice;

public class Demo {
    public static void main(String[] args)
    {
        int count = 0;
        for(int i = 0;i < 20; i++)
        {
            //count = 0;
            for(int j = 0;j <= i;j++)
            {
                count++;
            }
            System.out.println(count);
        }
    }
}
