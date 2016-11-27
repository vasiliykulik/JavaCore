package src.m6staticfinal.offline;

/**
 * Created by Стрела on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("first user count "+ User.getCounter());

        new User();
        new User();
        new User();
        new User();
        new User();

        System.out.println("after creating users, counter = " + User.getCounter());
    }
}
