package src.m9lambdasstreamsfunctions.homework;

import src.m8mapgenerics.selfedu.GenericMethodsOracle.Util;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Raketa on 05.10.2016.
 */
public class Utils {
    public static List<Order> deleteDuplicates(List<Order> l) {
        List<Order> result = l
                .stream()//creating stream from collection. collection.parallelStream() - creating parallel stream
                .distinct()// return stream without duplicates
                .collect(Collectors.toList());// ersult to collection
        // выделяю переменную - даю ссылку - и возвращаю ссылку на оригинал !!!

        return result;
    }

    public static List<Order> deleteDuplicates1(List<Order> orders) {
        return orders.parallelStream().distinct().collect(Collectors.toList()); // проверить еще раз (проверить состояние оригинала - orders )
        // если возвращать orders - это будут входные параметры, потому и используем result.
        //Коллектор возвращает новый List - формаирование нового List - !!! Возвращает обработанные результаты
    }

    public static List<Order> deleteItemsWithPriceLessThan1500(List<Order> orders) {
        return orders.stream()
                .filter(s -> s.getPrice() < 1500) // !
                .collect(Collectors.toList()); // forEach(orders::add); !!

    }

    public static Map<Currency, List<Order>> separatorUsdUah(List<Order> orders) {
        return genericListSeparator(orders, Order::getCurrency); ///
        /*Map<Currency, List<Order>> result = new HashMap<>(); // not Enum
        List<Order> usd = orders.stream()
                .filter(c -> c.getCurrency().equals(Currency.USD))
                .collect(Collectors.toList());
        List<Order> uah = orders.stream()
                .filter(c -> c.getCurrency().equals(Currency.UAH))
                .collect(Collectors.toList());
        result.put(Currency.USD, usd);
        result.put(Currency.UAH, uah);
        return result;*/
    }

    private static <T> Map<T, List<Order>> genericListSeparator(List<Order> orders, Function<Order, T> function) { // по любому ключу
        return orders.stream().collect(Collectors.groupingBy(function)); // !!!!
    }


    public static Map<String, List<Order>> separateCities(List<Order> orders) { // !!!!!!!
        // Set<Order> set = new HashSet<>(orders);
        Function<Order, String> f = order -> order.getUser().getCity();
        return orders.stream().collect(Collectors.groupingBy(f));
        // return genericListSeparator(orders, order -> order.getUser().getCity()); // d методе User сделал getCity - b тогда можно заюзать get Reference
                /*.map(f)                                      // An object that maps keys to values.
                .collect(Collectors.toList());*/

    }


    public static boolean isContains(Set<Order> orders, String lastName) {
        return orders.stream()
                .anyMatch(e -> lastName.equals(e.getUser().getLastName()));
    }

    // Здесь прописываем компаратор через тернарный оператор
    public static Order orderWithLargerPrice(List<Order> orderset) {
        //orderset.sort(Comparator.comparing(Order::getPrice).thenComparing(Order::getItemName));// !!! для List? для Set не работает
        orderset.sort(((o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice())));// inversed
        // Сокращенная запись компаратора от 11.11.2016 b не писать new Comparator
        return orderset.stream()
                .max((o1, o2) -> Integer.compare(o1.getPrice(), o2.getPrice()))
                .get();//!!!!


        //.max((o1, o2) -> ((o1.getPrice() < o2.getPrice()) ? -1 : ((o1.getPrice() == o2.getPrice()) ? 0 : 1)))

    }

    /*public static void orderWithLargerPrice(Set<Order> orderset) {
        System.out.println("Max Order Price: " + orderset.stream()
                .max((o1, o2) -> (Integer.compare(o1.getPrice(), o2.getPrice())))
                //.max((o1, o2) -> ((o1.getPrice() < o2.getPrice()) ? -1 : ((o1.getPrice() == o2.getPrice()) ? 0 : 1)))
                .get().getPrice());
    }*/

    // Здесь фильтруем в новый SET
    public static void deleteUsdOrders(Set<Order> orderset,Currency currency) {// ничего не удаляю
        orderset.removeIf(s -> s.getCurrency().equals(currency));
    }
}

