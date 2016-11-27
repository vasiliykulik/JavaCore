package src.m7_set_list_queue_comarable_comparator.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Стрела on 03.10.2016.
 * ArrayList - сразу переопределен toString
 * e ArrayList  - растет создавая ячейки
 * в ArrayList ищем toString - нету - может переопределено в List - нету - может
 * переопределен в AbstractCollection - залазьте в сырцы - это самые лучшие шпоры
 */
public class WarmUpTask1 {
    //List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(20);
        System.out.println(list);


        list.sort(new IncreaseOrder());
        System.out.println(list);
    }
}
