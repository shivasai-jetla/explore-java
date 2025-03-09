package Practice;


import java.util.*;

class reverseString {
    public static void main(String[] arg) {
        String Original,Temp="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        Original = sc.nextLine();
        int l = Original.length();
        for (int i = l - 1; i >= 0; i--)
        {
            Temp = Temp + Original.charAt(i);
        }
        System.out.println("Reverse String: " + Temp);
        if (Original.equals(Temp)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Non-Palindrome");
        }
    }
}
