package src.m7setlist.selfedu;

/**
 * Created by Стрела on 29.09.2016.
 * The following program uses this algorithm to print the words in its argument list in random order.
 */
import java.util.*;

public class B1_List_Shuffle {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (String a : args)
            list.add(a);
        Collections.shuffle(list, new Random());
        System.out.println(list);
    }
}
