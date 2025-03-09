package training;
import java.util.Scanner;

public class NotesCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount: ");
        int amount = sc.nextInt();

        int rs2000,rs1000,rs500,rs100,rs50,rs10,rs1;
        int count = 0;

        if(amount >= 2000)
        {
            rs2000 = amount/2000;
            count = count + rs2000;
            amount = amount % 2000;
            System.out.println("2000 Notes: "+rs2000);
        }

        if(amount >= 1000)
        {
            rs1000 = amount/1000;
            count = count + rs1000;
            amount = amount % 1000;
            System.out.println("1000 Notes: "+rs1000);
        }

        if(amount >= 500)
        {
            rs500 = amount/500;
            count = count + rs500;
            amount = amount % 500;
            System.out.println("500 Notes: "+rs500);
        }

        if(amount >= 100)
        {
            rs100 = amount/100;
            count = count + rs100;
            amount = amount % 100;
            System.out.println("100 Notes: "+rs100);
        }

        if(amount >= 50)
        {
            rs50 = amount/50;
            count = count + rs50;
            amount = amount % 50;
            System.out.println("50 Notes: "+rs50);
        }

        if(amount >= 10)
        {
            rs10 = amount/10;
            count = count + rs10;
            amount = amount % 10;
            System.out.println("10 Notes: "+rs10);
        }

        if(amount >= 1)
        {
            rs1 = amount/1;
            count = count + rs1;
            System.out.println("10 Notes: "+rs1);
        }

        System.out.println("Count: "+ count);


    }
}
