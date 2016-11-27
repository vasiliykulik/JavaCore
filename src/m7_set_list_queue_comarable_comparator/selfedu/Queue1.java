package src.m7_set_list_queue_comarable_comparator.selfedu;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Стрела on 04.10.2016.
 */
public class Queue1 {



    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(11);
        queue.add(-11);
        queue.add(0);
        int a = queue.element();
        System.out.println(a);
    }



}
