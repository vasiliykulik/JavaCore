package src.m9_lambdas_streams_functions.homework_9_java8_refactor_fr_HW_7;

import java.util.Comparator;

/**
 * Created by Raketa on 05.10.2016.
 */
public class ComparatorItemNameAndShopIdentificatorAndUserCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (!o1.getItemName().equals(o2.getItemName())) {
            return o1.getItemName().compareTo(o2.getItemName());
        } else {
            return o1.getShopIdentificator() != o2.getShopIdentificator()
                    ? o1.getShopIdentificator().compareTo(o2.getShopIdentificator())
                    : o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }
    }
}
