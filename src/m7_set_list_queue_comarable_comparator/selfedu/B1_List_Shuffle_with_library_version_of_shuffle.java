package src.m7_set_list_queue_comarable_comparator.selfedu;
import java.util.*;
/**
 * Created by Стрела on 29.09.2016.
 * Taking advantage of Arrays.asList and calling the library version of shuffle, which uses a default source of randomness, you get the following tiny program whose behavior is identical to the previous program.
 *
 */
public class B1_List_Shuffle_with_library_version_of_shuffle {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
