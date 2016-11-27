package src.m8_map_generics.test_questions;

import java.util.HashMap;

/**
 * Created by Стрела on 11.10.2016.
 */
public class Map {
    public static void main(String[] args) {

        java.util.Map<String,String> map = new HashMap<>();
        map.put("key", "value");
        map.put("key", "value");
        map.put("key1", "value");
        String res = map.get("key");
        System.out.println(map.keySet().size());
    }
}
