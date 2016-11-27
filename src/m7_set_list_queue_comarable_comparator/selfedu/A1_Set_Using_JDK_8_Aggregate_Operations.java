package src.m7_set_list_queue_comarable_comparator.selfedu;

import java.util.*;
import java.util.stream.*;

/**
 * Created by Стрела on 29.09.2016.
 * public class FindDups
 */
public class A1_Set_Using_JDK_8_Aggregate_Operations {
    public static void main(String[] args) {
        Set<String> distinctWords = Arrays.asList(args).stream()
                .collect(Collectors.toSet());
        System.out.println(distinctWords.size()+
                " distinct words: " +
                distinctWords);
    }
}
