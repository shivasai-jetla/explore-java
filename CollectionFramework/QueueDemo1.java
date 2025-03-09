package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo1 {

    //FIFO (First In First Out)
    //In priority queues smallest number has a higher priority and in strings, based on lexically
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);
        queue.add(40);

        System.out.println(queue);

        //queue.remove();
        //queue.offer(1);
        System.out.println(queue.peek()); //peek just retrieve the head
        System.out.println(queue.poll()); //poll retrieve the head and also remove the head
        System.out.println(queue);
    }
}
