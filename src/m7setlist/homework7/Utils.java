package src.m7setlist.homework7;

import java.util.*;

/**
 * Created by Raketa on 05.10.2016.
 */
public class Utils {
    public static List deleteDuplicates(List<Order> result) {

        for (int end = result.size() - 1; end >= 0; end--)
            for (int i = 0; i < end; i++) {
                if (result.get(i).equals(result.get(end))) {
                    result.remove(end);
                    break;
                }
            }
        //List<Order> result = l;// сразу отдаем результирующий - те обработанный List
        return result;
    }

    public static List deleteItemsWithPriceLesser1500(List<Order> result) {
        for (int i = result.size() - 1; i >= 0; i--) {
            if (result.get(i).getPrice() < 1500) {
                result.remove(i);
            }
        }
        return result;
    }

    // List<List<Order>>
    // Map<Currency,List<Order>> - d идеале Map - все отсепарированные
    public static Map<Enum, List<Order>> separatorUsdUah(List<Order> orders) {
        Map<Enum, List<Order>> result = new HashMap<>();
        for (Order order : orders) {
            Enum currency = order.getCurrency();
            if (result.containsKey(currency)) {
                result.get(currency).add(order);
            } else {
                List<Order> newOrders = new ArrayList<>();
                newOrders.add(order);
                result.put(currency, newOrders);
            }
        }
        return result;
    }


    public static Map<String, List<Order>> separateCities(List<Order> orders) {
        Map<String, List<Order>> result = new HashMap<>();
        for (Order order : orders) {
            String city = order.getUser().getCity();
            if (result.containsKey(city)) {
                result.get(city).add(order);
            } else {
                List<Order> newOrders = new ArrayList<>();
                newOrders.add(order);
                result.put(city, newOrders);
            }
        }
        return result;
    }

    public static boolean isContains(Set<Order> orders, String lastName) {
        for (Order order : orders) {
            if (lastName.equals(order.getUser().getLastName())) {// возвращаем сразу как нашли,
                return true;
            }
        }
        return false;
    }

    // через итератор так как у Set нет метода Get
    public static Order getOrderWithLargestPrice(Set<Order> orderset) {
        Iterator<Order> iterator = orderset.iterator();
        Order largestOrder = iterator.next();
        while (iterator.hasNext()) {
            if (iterator.next().getPrice() > largestOrder.getPrice()) {
                largestOrder = iterator.next();
            }
        }
        return largestOrder;
    }

    public static void deleteOrdersByCurrency(Set<Order> orders,Currency currency) { // мы ничего не вернем,, в памяти останется обработанный set
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency() == currency) {
                iterator.remove();
            }
        }
    }


}

