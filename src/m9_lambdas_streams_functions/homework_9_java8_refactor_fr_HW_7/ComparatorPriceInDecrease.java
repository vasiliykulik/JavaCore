package src.m9_lambdas_streams_functions.homework_9_java8_refactor_fr_HW_7;

import java.util.Comparator;

/**
 * Created by Raketa on 05.10.2016.
 */
public class ComparatorPriceInDecrease implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPrice()-o1.getPrice();
    }
}