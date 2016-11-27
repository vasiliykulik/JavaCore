package src.m7_set_list_queue_comarable_comparator.selfedu;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Стрела on 04.10.2016.
 */
public class HashSetSetSize {public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("aaa");
    set.add("ccc");
    set.add("bbb");
    set.add("aaa");
    set.remove("ccc");

    System.out.println(set.size());
}
}
