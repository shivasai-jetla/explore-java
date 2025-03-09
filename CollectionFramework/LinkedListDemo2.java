package CollectionFramework;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        //We can implement LinkedList with Deque
        Deque<Integer> list1 = new LinkedList<>();

        //We can implement LinkedList with List
        List<Integer> list2 = new ArrayList<>();


        list1.add(100);
        list1.add(101);

        list2.add(200);
        list2.add(201);

        System.out.println(list1);
        System.out.println(list2);
    }
}
