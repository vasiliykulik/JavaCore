package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.offline.Counter2;

/**
 * Created by Стрела on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("first user count "+ User.getCounter());

        new User();
        new User();
        new User();
        final User user1 = new User();
        System.out.println(User.getCounter());
        final User user2 = new User();
        System.out.println(User.getCounter());

        System.out.println("after creating users, counter = " + User.getCounter());
    }
}
