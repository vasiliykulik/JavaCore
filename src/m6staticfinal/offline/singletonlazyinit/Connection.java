package src.m6staticfinal.offline.singletonlazyinit;

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
