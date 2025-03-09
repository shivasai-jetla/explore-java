package Concept;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        try {
            while (true) {
                int a = s.nextInt();
                arr.add(a);
                if(a == 0)
                {
                    break;
                }
            }
        }
        catch (Exception e)
        {
            e.getMessage();
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
