package src.m9lambdasstreamsfunctions.homework;

import java.util.Comparator;

/**
 * Created by Raketa on 05.10.2016.
 */
public class ComparatorPriceInDecrease implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return Integer.compare(o2.getPrice(), o1.getPrice());
    }
}
