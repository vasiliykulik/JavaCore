package src.m9lambdasstreamsfunctions.homework;

import java.util.Comparator;

/**
 * Created by Стрела on 15.10.2016.
 */
public class ComparatorPriceForStream implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }

}
