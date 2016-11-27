package src.m9lambdasstreamsfunctions.homework;

import java.util.Comparator;

/**
 * Created by Raketa on 05.10.2016.
 */
public class ComparatorPriceInIncreaseAndUserCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        int result = Integer.compare(o1.getPrice(), o2.getPrice());
        if (result != 0) {
            return result;
        }
        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }
}
