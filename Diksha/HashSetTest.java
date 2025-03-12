package Diksha;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet hs = new HashSet<>(Arrays.asList("Hello", 42, 3.14, true, "World"));


        Iterator i = hs.iterator();
        while(i.hasNext())
        {
            Object o = i.next();
            System.out.println(o+" "+o.getClass().getSimpleName());
        }

//        if(hs.contains(42))
//        {
//            System.out.println("42 is present");
//        }

        System.out.println(hs.contains(42)? "42 is present":"not found");

        hs.remove("World");
        System.out.println(hs);
    }
}
