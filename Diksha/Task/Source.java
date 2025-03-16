package Diksha;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Source {

    public static void main(String[] args) {

        ArrayList<Restaurent> re = new ArrayList<>();

        Restaurent r1 =new Restaurent("NH8","Indiranagar","Indian","4");
        Restaurent r2  =new Restaurent("Agigas","Indiranagar","Indian","4");

        DAO d = new DAO();

        System.out.println("Enter 1 0r 2: ");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        if(choice == 1)
        {
            d.addRestaurent(re);
        } else if (choice == 2) {
            System.out.println("Restarent List:");
            d.addRestaurent(re);
            System.out.println("Search Result: ");
            System.out.println(d.searchRestaurent(re,"Adigas"));
        }



    }
}
