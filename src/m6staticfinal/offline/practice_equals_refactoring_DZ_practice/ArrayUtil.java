package src.m6staticfinal.offline.practice_equals_refactoring_DZ_practice;

/**
 * Created by Стрела on 19.09.2016.
 */
public class ArrayUtil {
    static Order[] check(Order[] ar1, Order[] ar2){
        int count=0;
        for(Order order1:ar1){
            for(Order order2:ar2){
                if (order1.equals(order2)) count++;
            }

        }
        Order[] res = new Order[count];

        int index=0;
        for(Order order1:ar1){
            for(Order order2:ar2){
                if (order1.equals(order2)){
                    res[index]=order1;
                    index++;
                }
            }

        }
        return res;
    }
    static Order[] deleteEmpty(Order[]orders){
        return null;
    }
    static Order[] getActive(Order[] orders){
        Order[] ordersActive = new Order[orders.length];              // Второй способ

        int index=0;
        for(Order order:ordersActive){
            if(order.isActive()&&order.isDone())
                ordersActive[index++] = order;
        }
        return deleteEmpty(orders);
    }
}

