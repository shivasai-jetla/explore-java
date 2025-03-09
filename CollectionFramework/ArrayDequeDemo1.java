package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

//We can add and remove from both ends
public class ArrayDequeDemo1 {

    public static void main(String[] args) {

        Deque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(10);
        arrayDeque.add(30);
        arrayDeque.add(40);
        arrayDeque.add(20);
        arrayDeque.add(50);

        System.out.println(arrayDeque);

        arrayDeque.addFirst(60);
        arrayDeque.addLast(25);

        System.out.println("After Adding First and Last: "+arrayDeque);
        arrayDeque.removeFirst();
        arrayDeque.removeLast();

        System.out.println("After removing First and Last: "+arrayDeque);

        System.out.println("Reversed deque: "+arrayDeque.reversed());
        System.out.println("First Element: "+arrayDeque.getFirst());
        System.out.println("Last Element: "+arrayDeque.getLast());

    }
}
