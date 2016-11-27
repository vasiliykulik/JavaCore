package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.offline.practice_equals_refactoring_DZ_practice;

/**
 * Created by Стрела on 19.09.2016.
 * Look with Debug
 */
public class Main {
    public static void main(String[] args) {
        Order order1 = new Order (100, "bycacle", true, false,1001);
        Order order2 = new Order (100, "phone", true, false,1001);
        Order order3 = new Order (100, "phone", true, false,1001);

        Order[] ar1 = {order1};
        Order[] ar2 = {order2,order1,order1};
        System.out.println(ArrayUtil.check(ar2,ar1).length);

    }
}
