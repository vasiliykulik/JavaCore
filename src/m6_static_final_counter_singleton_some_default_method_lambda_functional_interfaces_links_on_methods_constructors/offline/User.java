package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.offline;

/**
 * Created by Стрела on 19.09.2016.
 */
public class User{
private static int counter =0;
    public User() {
        // init some fields
        counter = counter + 1;
    }
    public static int getCounter() {
        return counter;
    }
}
