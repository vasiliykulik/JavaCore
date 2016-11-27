package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.offline.practice;

/**
 * Created by Стрела on 19.09.2016.
 */
public class ArrayUtil {
    static Order [] check(Order[] ar1, Order[] ar2){
        int count=0;
        for(Order order1:ar1){
            for(Order order2:ar2){
                if (order1.getId() == order2.getId()) count++;
            }

        }
        Order[] res = new Order [count];

        int index=0;
        for(Order order1:ar1){
            for(Order order2:ar2){
                if (order1.getId() == order2.getId()){
                    res[index]=order1;
                    index++;
                }
            }

        }
        return res;
    }
}
