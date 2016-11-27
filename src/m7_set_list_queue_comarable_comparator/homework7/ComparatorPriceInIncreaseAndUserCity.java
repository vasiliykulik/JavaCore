package src.m7_set_list_queue_comarable_comparator.homework7;

import java.util.Comparator;

/**
 * Created by Raketa on 05.10.2016.
 */
public class ComparatorPriceInIncreaseAndUserCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getPrice() != (o2.getPrice())
                ? o1.getPrice() - o2.getPrice()
                : o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }
}
