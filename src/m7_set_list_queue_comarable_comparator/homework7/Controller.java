package src.m7_set_list_queue_comarable_comparator.homework7;

import java.util.*;

/**
 * Created by Raketa on 05.10.2016.
 */
public class Controller {
    public List deleteDuplicates(List<Order> l) {

        for (int end = l.size() - 1; end >= 0; end--)
            for (int i = 0; i < end; i++) {
                if (l.get(i).equals(l.get(end))) {
                    l.remove(end);
                    break;
                }
            }
        List<Order> result = l;
        return result;
    }

    public List deleteItemsWithPriceLesser1500(List<Order> result) {
        for (int i = result.size() - 1; i >= 0; i--) {
            if (result.get(i).getPrice() < 1500) {
                result.remove(i);
            }
        }
        return result;
    }

    public void separatorUsdUah(List<Order> orders) {
        List<Order> listusd = new LinkedList<>();
        List<Order> listuah = new LinkedList<>();
        for (Order order : orders) {
            if (order.getCurrency().equals(Currency.UAH)) {
                listuah.add(order);
            } else {
                listusd.add(order);
            }
        }
        System.out.println("USD Orders " + listusd);
        System.out.println("UAH Orders " + listuah);
    }
/*Хотел сделать лист String с названиями городов - подтягивая их с Userов,
и используя for насоздавать листов с именами городов типа List<Order> order.getUser().getCity() = new ArrayList<>(); - но не сработало
Так что:
 - пробегая по ордерам добавляю город в лист String если его там нет , и в таком случае создаю новый List, пробегаю по ордерам во втором for
 , набивая соответствующими ордерами - и делаю sout.
и в  начало

  */

    public void separateCities(List<Order> orders) {
        List<String> cities = new ArrayList<String>();
        for (Order order : orders) {
            if (!cities.contains(order.getUser().getCity())) {
                cities.add(order.getUser().getCity());
                List<Order> list = new ArrayList<>();
                for (Order order1 : orders) {
                    if (order.getUser().getCity().equals(order1.getUser().getCity())) {

                        list.add(order1);
                    }
                }
                System.out.println(order.getUser().getCity() + " has next orders " + list);
            }
        }


    }

    public boolean isPetrovInTheSet(Set<Order> ordersset) {
        boolean isPetrov = false;
        for (Order order : ordersset) {
            if ("Petrov".equals(order.getUser().getLastName())) {
                isPetrov = true;
                break;
            }

        }
        return isPetrov;
    }

    // через итератор так как у Set нет метода Get
    public void orderWithLargerPrice(Set<Order> orderset) {
        Iterator<Order> iterator = orderset.iterator();
        Order largestOrder = iterator.next();
        while (iterator.hasNext()) {
            if (iterator.next().getPrice() > largestOrder.getPrice()) {
                largestOrder = iterator.next();
            }
        }
        System.out.println(largestOrder);
    }

    public Set deleteUsdOrders(Set<Order> orderset) {
        Iterator<Order> iterator = orderset.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency() == Currency.USD) {
                iterator.remove();
            }
        }
        return orderset;
    }


}

