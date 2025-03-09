package CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();


        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.add(3,25);
        //list.clear();


        System.out.println(list);
        System.out.println(list.reversed());
        System.out.println("First Element: "+list.getFirst());
        System.out.println("Last Element: "+list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
