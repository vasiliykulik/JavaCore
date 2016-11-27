package src.m7_set_list_queue_comarable_comparator.selfedu;
import java.util.*;
/**
 * Created by Стрела on 29.09.2016.
 * public class FindDups
 */
public class A2_Set_Using_the_foreach_Construct {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}
