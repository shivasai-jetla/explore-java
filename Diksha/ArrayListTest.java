package Diksha;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(30);
        list.add(1,40);
        list.addFirst(5);
        list.addLast(70);
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.isEmpty());

        Iterator<Integer> i = list.iterator();
        while(i.hasNext())
        {
            Object o = i.next();
            System.out.println(o);
        }
    }

}
