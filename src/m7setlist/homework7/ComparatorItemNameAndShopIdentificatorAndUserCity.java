package src.m7setlist.homework7;

import java.util.Comparator;

/**
 * Created by Raketa on 05.10.2016.
 */
public class ComparatorItemNameAndShopIdentificatorAndUserCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        int result = o1.getItemName().compareTo(o2.getItemName());
        if (result!=0){
            return result;
        }
        result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());// r следующему сравнению если условие равно
        if (result!=0){
            return result;
        }
        return o1.getUser().getCity().compareTo(o2.getUser().getCity());

        /*if (!o1.getItemName().equals(o2.getItemName())) {
            return o1.getItemName().compareTo(o2.getItemName());
        } else {
            return o1.getShopIdentificator() != o2.getShopIdentificator()
                    ? o1.getShopIdentificator().compareTo(o2.getShopIdentificator())
                    : o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }*/
    }
}
