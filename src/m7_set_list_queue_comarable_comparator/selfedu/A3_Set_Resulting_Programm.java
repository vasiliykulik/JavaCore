package src.m7_set_list_queue_comarable_comparator.selfedu;
import java.util.*;
/**
 * Created by Стрела on 29.09.2016.
 * FindDups2
 */
public class A3_Set_Resulting_Programm {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        for (String a : args)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}
