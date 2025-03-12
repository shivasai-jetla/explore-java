package Diksha;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ThrowTask {



    void throwMethod()
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = s.nextInt();
        if(num < 0)
        {
            throw new IllegalArgumentException("Negative number not allowed!");
        } else if (num == 0) {
            throw new ArithmeticException("Zero is not a valid input!");
        }
        else{
            System.out.println("Valid number entered:"+num);
        }
    }

    void stringThrow()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        if(str.equals(""))
        {
            throw new IllegalArgumentException("Input cannot be empty!");
        } else if (str.length() < 5) {
            throw  new RuntimeException("Input must be at least 5 characters long!");
        }

        else {
            System.out.println("Valid input: "+str);
        }
    }

    public static void main(String[] args) {

        ThrowTask t = new ThrowTask();

        try
        {
            t.throwMethod();

        }

        catch (IllegalArgumentException | ArithmeticException ia)
        {
            System.out.println(ia);
        }

        try{
            t.stringThrow();
        }

        catch (RuntimeException ir)
        {
            System.out.println(ir);
        }
    }
}
