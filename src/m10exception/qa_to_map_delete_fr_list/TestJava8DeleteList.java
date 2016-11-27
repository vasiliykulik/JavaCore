package src.m10exception.qa_to_map_delete_fr_list;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Стрела on 26.10.2016.
 */
public class TestJava8DeleteList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        int index = 5;
        while(index>0){
            list.add(UUID.randomUUID().toString());
            index--;
        }
        list.removeIf(x->x.contains("55"));
        System.out.println(list);
    }
}
