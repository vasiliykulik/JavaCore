package src.m8_map_generics.selfedu;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Стрела on 13.10.2016.
 */
public class SecondMoreMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "a");
        map.put("1", "2");
        for( Map.Entry<String, String> entry : map.entrySet() ){
            System.out.println( entry.getKey() + " " + entry.getValue() );
        }
    }
}
