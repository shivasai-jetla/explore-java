package patterns;

public class NumberPattern2 {
    public static void main(String[] args) {
        int rows = 10;

        int sum = 0;

        for(int i = 1; i <= rows; i++)
        {
            for (int j = 1;j <= i; j++)
            {
                sum = sum + 1;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
