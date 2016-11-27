package src.m8_map_generics.question_answer;

import java.util.*;

/**
 * Created by Стрела on 11.10.2016.
 */
public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();


        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");

        ListIterator<String> iter = list.listIterator();
        String check = "test2";
        while (iter.hasNext()) {
            if (iter.next().equals(check)) {
                System.out.println(iter.previous());
            }
        }

        String check1 = "test4";
        while (iter.hasPrevious()) {
            String item = iter.previous();
            System.out.println(item);
            if (iter.next().equals(check1)) {
                System.out.println(Boolean.TRUE);
            }
        }
    }
}
