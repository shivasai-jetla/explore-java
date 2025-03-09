package training;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest1 {
    public static void main(String[] args)
    {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext())
        {
            int element = iterator.next();
            System.out.println(element);
        }
    }
}
