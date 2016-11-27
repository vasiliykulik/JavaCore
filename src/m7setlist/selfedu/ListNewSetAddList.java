package src.m7setlist.selfedu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Стрела on 04.10.2016.
 */
public class ListNewSetAddList {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");
        set.add("aaa");
        set.remove("ccc");

        List<String> list = new ArrayList<>(set);
        list.add("bbb");

        System.out.println(list);
    }
}
