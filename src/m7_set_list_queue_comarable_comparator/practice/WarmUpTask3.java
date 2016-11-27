package src.m7_set_list_queue_comarable_comparator.practice;

import java.util.*;

/**
 * Created by Стрела on 03.10.2016.
 *
 * Если вы имплементите comparable - те вы будете имплементить натуральный порядок
 * Comparable - оно вшито внутрь класса
 */
public class WarmUpTask3 {
    public static void main(String[] args) {
        String [] array = new String[5];
        array[0] = "Kiev";
        array[1] = "Moscow";
        array[2] = "NewYork";
        array[3] = "Chicago";
        array[4] = "Washington";
        System.out.println(Arrays.deepToString(array));
        //Arrays.sort(array);// String имплементит Comparable - те natural ordering;
        // мы char тоже можем минусовать

        System.out.println(Arrays.deepToString(array));

        // apply comparator
        Comparator<String> с = new Comparator<String>(){
            @Override
            public int compare(String o1,String o2){
                return o1.compareTo(o2);
            }
        };
        Arrays.sort(array,с);
        System.out.println(Arrays.deepToString(array));
    }

}
