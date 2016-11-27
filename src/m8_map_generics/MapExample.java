package src.m8_map_generics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Стрела on 07.10.2016.
 */
public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        /*Принимает любой тип, кроме примитивных
        {Feb=28, Jan=31, Mar=30}*/
        map.put("Jan",31);
        map.put("Feb",28);
        map.put("Mar",30);
        System.out.println(map);
        map.get("Feb");
        System.out.println(map.keySet());/*
        Значения могут быть одинаковыми, ключи должны быть одинаковыми
        Можно map добавить в map - merge
                */
        map.remove("Mar");
        map.values(); //как с keySet только для значений
        /*
        TreeMap - сортирует значение ключа по Comparable
        в hashTable - никак не сортируется
         */

        Map<String, Integer> map1 = new TreeMap<>();
        map.put("Jan",31);
        map.put("Feb",28);
        map.put("Mar",30);
        map.put("Apr",30);/*
        могу дать любой тип User, тип
        merge, size
        то что мы посмотрели покрывает 90% кейсов
        */
        System.out.println(map1);
        /*
        Исп когда - для связи двух объекта разных типов
        Например в соцсети у User - List его друзья
        List - наших друзей - жесткая - добавили в класс, когда связь не
        такая жесткая - используются Map
         */
    }
}
