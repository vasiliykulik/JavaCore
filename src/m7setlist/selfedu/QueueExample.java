package src.m7setlist.selfedu;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(12);
        queue.add(11);
queue.add(-11);

        queue.add(0);

        int a = queue.element();
       // System.out.println(queue.element());

      //  queue.remove();

      //  System.out.println(queue.element());

        System.out.println(a);

    }
}
