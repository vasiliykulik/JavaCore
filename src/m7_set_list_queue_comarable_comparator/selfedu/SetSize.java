package src.m7_set_list_queue_comarable_comparator.selfedu;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Стрела on 04.10.2016.
 */
public class SetSize {

        public static void main(String[] args) {
            Set<String> set = new HashSet<String>();
            set.add("test");
            set.add("test1");
            set.add("test");
            System.out.println(set.size());
        }

}
