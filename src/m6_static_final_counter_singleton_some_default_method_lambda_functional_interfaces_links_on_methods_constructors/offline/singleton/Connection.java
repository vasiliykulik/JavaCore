package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.offline.singleton;

/**
 * Created by Стрела on 19.09.2016.
 */
public class Connection {
    private static Connection INSTANCE;

    static {
        INSTANCE = new Connection();
    }

    private Connection() {
    }

    public static Connection getInstance(){
        return INSTANCE;
    }
}
