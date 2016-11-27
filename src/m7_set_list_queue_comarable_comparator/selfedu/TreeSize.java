package src.m7_set_list_queue_comarable_comparator.selfedu;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Стрела on 04.10.2016.
 */
public class TreeSize {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        Set<Integer> set1 = new TreeSet<>();

        set1.add(11);
        set1.add(9);
        set1.add(15);

        System.out.println(set + " " + set1);
    }
}
