package src.m7setlist.practice;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Стрела on 03.10.2016.
 */
public class WarmUpTask4 {// comparable реализован в классе User
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();
        users.add(new User("Andrey",14));
        users.add(new User("Andrey",141));
        users.add(new User("Andrey1",11));
        users.add(new User("Andrey2",12));
        System.out.println(users);

    }

}
