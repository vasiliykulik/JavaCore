package src.m8mapgenerics.selfedu;

/**
 * Created by Стрела on 12.10.2016.
 */

import java.util.HashMap;
import java.util.Map;

public class AppHashMap_not_work_in_IDEA {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "Five;");
        map.put(8, "Eight;");
        map.put(6, "Six;");
        map.put(4, "Four;");
        map.put(3, "Two;");
        String text = map.get(4);
        System.out.println(text);
        for( Map.Entry<Integer, String> entry : map.entrySet() ){
            System.out.println( entry.getKey() + " " + entry.getValue() );
            int key =  entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }

    }
}
