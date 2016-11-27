package src.m9_lambdas_streams_functions.homework_9_java8_refactor_fr_HW_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import static src.m9_lambdas_streams_functions.homework_9_java8_refactor_fr_HW_7.Currency.UAH;
import static src.m9_lambdas_streams_functions.homework_9_java8_refactor_fr_HW_7.Currency.USD;


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

        orders.sort(new ComparatorPriceInDecrease());
        System.out.println(orders);
        orders.sort(new ComparatorPriceInIncreaseAndUserCity());
        System.out.println(orders);
        orders.sort(new ComparatorItemNameAndShopIdentificatorAndUserCity());
        System.out.println(orders);


        Controller controller = new Controller();

        System.out.println("Separate Cities " + controller.separateCities(orders));

        controller.separatorUsdUah(orders);
        System.out.println(controller.deleteDuplicates(orders));
        System.out.println(controller.deleteItemsWithPriceLesser1500(orders));

        TreeSet<Order> ordersset = new TreeSet<Order>();
        ordersset.add(new Order(1, 10, UAH, "item1", "Kiev", new User(5, "john1", "smith1", "Kiev1", 700)));
        ordersset.add(new Order(2, 20, UAH, "item2", "Lviv", new User(4, "john2", "smith2", "Kiev2", 800)));
        ordersset.add(new Order(3, 30, UAH, "item3", "Kiev", new User(3, "john3", "Petrov", "Kiev2", 900)));
        ordersset.add(new Order(4, 40, UAH, "item4", "Lviv", new User(2, "john4", "smith4", "Kiev4", 400)));
        ordersset.add(new Order(5, 50, USD, "item5", "Kiev", new User(1, "john5", "smith5", "Kiev5", 500)));
        ordersset.add(new Order(7, 70, UAH, "item6", "Kiev", new User(6, "john6", "smith6", "Kiev5", 600)));
        ordersset.add(new Order(7, 70, UAH, "item6", "Kiev", new User(6, "john6", "smith6", "Kiev5", 600)));
        ordersset.add(new Order(8, 80, UAH, "item8", "Kiev", new User(8, "john8", "smith8", "Kiev7", 200)));
        ordersset.add(new Order(9, 90000, UAH, "item9", "Dnipro", new User(9, "john9", "smith9", "Kiev9", 100)));
        ordersset.add(new Order(10, 100, USD, "item10", "Yalta", new User(10, "john10", "smith10", "Kiev9", 1000)));

        System.out.println(controller.isPetrovInTheSet(ordersset));


        controller.orderWithLargerPrice(ordersset);
        System.out.println(controller.deleteUsdOrders(ordersset));





    }


}

