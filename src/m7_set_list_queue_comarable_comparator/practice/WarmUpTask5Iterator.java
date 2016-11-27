package src.m7_set_list_queue_comarable_comparator.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Стрела on 03.10.2016.
 */
public class WarmUpTask5Iterator {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();
        users.add(new User("Andrey",44));
        users.add(new User("Sergey",25));
        users.add(new User("Vasiliy",33));
        users.add(new User("Antoniy",12));
        System.out.println(users);

        Iterator<User> iterator = users.iterator(); //  у итератора есть очень мало
        // итератор нужен там где стандартными средствами не сделать
        while(iterator.hasNext()){ // пока есть
            if(iterator.next().getAge()>25) iterator.remove();// если больше 25, удалить
        }
        // Итератор - объект, пробегая по всем элементам - есть ли следующий, ( пробегает один раз, в одну сторону  -
        // нужен новый итератор, как правило пробегается один - два раза)
        // E Set нет метода get - без Итератора
        System.out.println(users);

        for(User user:users){
            System.out.println(user);
        }


    }
}
