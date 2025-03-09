package training;

import java.util.ArrayList;

public class GenericExample3 {
public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(); // A list that ONLY holds Strings
    list.add("Hello"); // Add a String
    // list.add(123);   // ERROR! You can’t add a number to a String list

    String str = list.get(0); // No casting needed, it's already a String!
    System.out.println(str);
}
}
