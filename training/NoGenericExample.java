package training;

import java.util.ArrayList;

class NoGenericsExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // A list that can hold anything
        list.add("Hello"); // Add a String
        list.add(123);     // Add an Integer

        // Later, you have to CAST the object back to its type
        String str = (String) list.get(0); // Works fine
        Integer num = (Integer) list.get(1); // Works fine

        System.out.println(str);

        // But if you're careless, it could crash at runtime!
        // For example, this will throw a ClassCastException:
        // String invalid = (String) list.get(1);
    }
}