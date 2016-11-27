package src.m7_set_list_queue_comarable_comparator.practice;

import java.util.Comparator;

/**
 * Created by Стрела on 03.10.2016.
 */
public class IncreaseOrder implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        return o1 - o2;                          // JDK всередине подкладывает -1 1 - что бы не было милиионых чисел
        // o1 - o2 - o1*1000 если ошибка то сортировки не будет сортировать - может перемешать
    }
};

