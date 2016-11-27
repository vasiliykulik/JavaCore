package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.offline.singletonlazyinit;

/**
 * Created by Стрела on 19.09.2016.
 */
public class Connection {
    private static Connection INSTANCE;
    private static User USER;

    static {
        INSTANCE = new Connection();
    }

    private Connection() {
    }

    public static Connection getInstance(){
        if(INSTANCE==null){
            INSTANCE = new Connection();
        }
        return INSTANCE;
    }
    public  static User getUSER(){
        return USER;
    }
}
