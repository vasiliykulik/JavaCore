package src.m9lambdasstreamsfunctions.homework;

import java.util.*;


import static src.m9lambdasstreamsfunctions.homework.Currency.UAH; // как статический
import static src.m9lambdasstreamsfunctions.homework.Currency.USD;


/**
 * Created by Стрела on 04.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();//  effective get
        List<Order> orders = new LinkedList<>();// effective add

        users.add(new User(5, "john1", "smith1", "Kiev1", 700));
        users.add(new User(4, "john2", "smith2", "Kiev2", 800));
        users.add(new User(3, "john3", "smith3", "Kiev2", 900));
        users.add(new User(2, "john4", "smith4", "Kiev4", 400));
        users.add(new User(1, "john5", "smith5", "Kiev5", 500));
        users.add(new User(6, "john6", "smith6", "Kiev5", 600));
        users.add(new User(7, "john7", "smith7", "Kiev7", 300));
        users.add(new User(8, "john8", "smith8", "Kiev7", 200));
        users.add(new User(9, "john9", "smith9", "Kiev9", 100));
        users.add(new User(10, "john10", "smith10", "Kiev9", 1000));

// вот здесь правильно ли я User подтягиваю ?
        orders.add(new Order(1, 10, UAH, "item1", "Kiev", users.get(0)));
        orders.add(new Order(2, 20, UAH, "item2", "Lviv", users.get(1)));
        orders.add(new Order(3, 30, UAH, "item3", "Kiev", users.get(2)));
        orders.add(new Order(4, 40, UAH, "item4", "Lviv", users.get(3)));
        orders.add(new Order(5, 50, USD, "item5", "Kiev", users.get(4)));
        orders.add(new Order(7, 70, UAH, "item6", "Kiev", users.get(5)));
        orders.add(new Order(7, 70, UAH, "item6", "Kiev", users.get(5)));
        orders.add(new Order(8, 80, UAH, "item8", "Kiev", users.get(7)));
        orders.add(new Order(9, 90000, UAH, "item9", "Dnipro", users.get(8)));
        orders.add(new Order(10, 100, USD, "item10", "Yalta", users.get(9)));

        orders.sort((a, b) -> Integer.compare(b.getPrice(), a.getPrice()));// заменили на лямбду// обратная сортировка
        System.out.println(orders);
        orders.sort(Comparator.comparing(Order::getPrice)
                .thenComparing(n -> n.getUser().getCity()));
        // здесь один then Comparing PriceInIncreaseAndUserCity() - по компараторов
        System.out.println(orders);
        orders.sort(Comparator.comparing(Order::getItemName) // Заменили компаратор на
                .thenComparing(Order::getShopIdentificator)
                .thenComparing(i -> i.getUser().getCity()));
        System.out.println(orders);


        System.out.println("Separate Cities " + Utils.separateCities(orders));

        Utils.separatorUsdUah(orders);
        System.out.println(Utils.deleteDuplicates(orders));


        TreeSet<Order> orders1 = new TreeSet<Order>();
        orders1.add(new Order(1, 10, UAH, "item1", "Kiev", new User(5, "john1", "smith1", "Kiev1", 700)));
        orders1.add(new Order(2, 20, UAH, "item2", "Lviv", new User(4, "john2", "smith2", "Kiev2", 800)));
        orders1.add(new Order(3, 30, UAH, "item3", "Kiev", new User(3, "john3", "Petrov", "Kiev2", 900)));
        orders1.add(new Order(4, 40, UAH, "item4", "Lviv", new User(2, "john4", "smith4", "Kiev4", 400)));
        orders1.add(new Order(5, 50, USD, "item5", "Kiev", new User(1, "john5", "smith5", "Kiev5", 500)));
        orders1.add(new Order(7, 70, UAH, "item6", "Kiev", new User(6, "john6", "smith6", "Kiev5", 600)));
        orders1.add(new Order(7, 70, UAH, "item6", "Kiev", new User(6, "john6", "smith6", "Kiev5", 600)));
        orders1.add(new Order(8, 80, UAH, "item8", "Kiev", new User(8, "john8", "smith8", "Kiev7", 200)));
        orders1.add(new Order(9, 90000, UAH, "item9", "Dnipro", new User(9, "john9", "smith9", "Kiev9", 100)));
        orders1.add(new Order(10, 100, USD, "item10", "Yalta", new User(10, "john10", "smith10", "Kiev9", 1000)));

        System.out.println(Utils.isContains(orders1, "Petrov"));
        /*Utils.deleteUsdOrders(orders1);*/


        Utils.orderWithLargerPrice(orders);


        System.out.println("orders");
        orders.forEach(System.out::println);
        System.out.println("deleteUSD");
        Utils.deleteUsdOrders(orders1, UAH);
        System.out.println("orders");
        orders1.forEach(System.out::println); // в main передал уже обработанный - X.
        // Есть объект,
        // у него есть ссылка  - b мы передали методу ссылку на объект

        /*System.out.println("--------------");
        Utils.deleteItemsWithPriceLessThan1500(orders).forEach(System.out::println);*/


    }


}

