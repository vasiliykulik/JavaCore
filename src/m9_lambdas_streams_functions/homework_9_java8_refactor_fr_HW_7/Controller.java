package src.m9_lambdas_streams_functions.homework_9_java8_refactor_fr_HW_7;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Raketa on 05.10.2016.
 */
public class Controller {
    public List deleteDuplicates(List<Order> l) {
        List<Order> out = l
                .parallelStream().distinct().collect(Collectors.toList());

        return out;
    }

    public List deleteItemsWithPriceLesser1500(List<Order> result) {
        List<Order> out = new ArrayList<>();
        result.stream()
                .filter(s -> s.getPrice() >= 1500)
                .forEach(c -> out.add(c));
        return out;
    }

    public void separatorUsdUah(List<Order> orders) {
        List<Order> listusd = new LinkedList<>();
        List<Order> listuah = new LinkedList<>();
        orders.stream()
                .filter(c -> c.getCurrency().equals(Currency.USD))
                .forEach(listusd::add);
        orders.parallelStream()
                .filter(c -> c.getCurrency().equals(Currency.UAH))
                .forEach(s -> listuah.add(s));
        System.out.println("USD Orders " + listusd);
        System.out.println("UAH Orders " + listuah);
    }

    /*Хотел сделать лист String с названиями городов - подтягивая их с Userов,
    и используя for насоздавать листов с именами городов типа List<Order> order.getUser().getCity() = new ArrayList<>(); - но не сработало
    Так что:
     - пробегая по ордерам добавляю город в лист String если его там нет , и в таком случае создаю новый List, пробегаю по ордерам во втором for
     , набивая соответствующими ордерами - и делаю sout.
    и в  начало



    public void separateCities1(List<Order> orders) {
        List<String> cities = new ArrayList<String>();
        for (Order order : orders) {
            if (!cities.contains(order.getUser().getCity())) {
                cities.add(order.getUser().getCity());
                List<Order> list = new ArrayList<>();
                orders.stream()
                        .filter(s -> !cities.contains(s.getUser().getCity()))
                        .forEach(list::add);
                System.out.println(order.getUser().getCity() + " has next orders " + list);
            }
        }
    }
*/
    // а вот пример с Вебинара - перепишусам
    /*public static List<List<Order>> separateCities(List<Order> orders) {
        Set<Order> set = new HashSet<>(orders);

        Function<Order, List<Order>> f = new Function<Order, List<Order>>() {
            @Override
            public List<Order> apply(Order order) {
                return set.stream()
                        .filter(o -> o.getUser().getCity().equals(order.getUser().getCity()))
                        .collect(Collectors.toList());
            }
        };

        List<List<Order>> res = orders.stream()
                .map(f)
                .collect(Collectors.toList());
        return res;
    }*/

    public static List<List<Order>> separateCities(List<Order> orders) {
        Set<Order> set = new HashSet<>(orders);

        Function<Order, List<Order>> f = new Function<Order, List<Order>>() {
            @Override
            public List<Order> apply(Order order) {       //	apply(T t) - Applies this function to the given argument.
                return set.stream()
                        .filter(o -> o.getUser().getCity().equals(order.getUser().getCity()))
                        .collect(Collectors.toList());
            }
        };
        List<List<Order>> res = orders.stream()
                .map(f)                                      // An object that maps keys to values.
                .collect(Collectors.toList());
        return res;
    }


    public boolean isPetrovInTheSet(Set<Order> ordersset) {
        boolean isPetrov;
        isPetrov = ordersset.stream()
                .anyMatch(e -> "Petrov".equals(e.getUser().getLastName()));
        return isPetrov;
    }

    // Здесь прописываем компаратор через тернарный оператор
    public void orderWithLargerPrice(Set<Order> orderset) {
        System.out.println("Max Order Price: " + orderset.stream()
                .max((o1, o2) -> ((o1.getPrice() < o2.getPrice()) ? -1 : ((o1.getPrice() == o2.getPrice()) ? 0 : 1)))
                .get().getPrice());
    }

    // Здесь фильтруем в новый SET
    public Set deleteUsdOrders(Set<Order> orderset) {
        TreeSet<Order> out = new TreeSet<>();
        orderset.stream()
                .filter(s -> !s.getCurrency().equals(Currency.USD))
                .forEach(r -> out.add(r));
        return out;
    }


}

