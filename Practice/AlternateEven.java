package Practice;
import java.util.*;

public class AlternateEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Minimum number: ");
        int min = sc.nextInt();

        System.out.println("Enter Maximum number: ");
        int max = sc.nextInt();

        for(int i = min; i <= max; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
                i = i+2;
            }
        }
    }
}
