package CollectionFramework;

import java.util.Stack;

//LIFO (Last In First Out)
public class StackDemo1 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);
        System.out.println("Top: "+stack.peek());
        System.out.println("Reversed Stack: "+stack.reversed());
        System.out.println(stack.get(1));
        System.out.println("Capacity: "+stack.capacity());
        stack.pop();
        System.out.println(stack);

    }
}
