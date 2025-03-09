package training;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String args[])
    {

        Set<String> set = new HashSet<String>();
        set.add("Hello");
        set.add("Hey");
        set.add("Hello");

        System.out.println(set);
    }

}
