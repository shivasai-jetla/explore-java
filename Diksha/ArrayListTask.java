package Diksha;

import java.util.*;

public class ArrayListTask {

    public static void main(String[] args) {

        ArrayList list = new ArrayList(Arrays.asList("Java",100,3.14,"Spring",true));

        Iterator i = list.iterator();

        while(i.hasNext())
        {
            Object o = i.next();
            System.out.println(o+"   "+o.getClass().getSimpleName());
        }

        list.remove(3);
        System.out.println(list);
    }
}
