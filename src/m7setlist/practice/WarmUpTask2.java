package src.m7setlist.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Стрела on 03.10.2016.
 * ArrayList - сразу переопределен toString
 * e ArrayList  - растет создавая ячейки
 * в ArrayList ищем toString - нету - может переопределено в List - нету - может
 * переопределен в AbstractCollection - залазьте в сырцы - это самые лучшие шпоры
 */
public class WarmUpTask2 {
    //List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kiev");
        list.add("Moscow");
        list.add("NewYork");
        list.add("Chicago");
        list.add("Washington");
        System.out.println(list);

       // list.sort(new IncreaseOrderString());
        Comparator<String> c = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.compareTo(o2);
            }
        };
        list.sort(c);
        System.out.println(list);


    }
}
