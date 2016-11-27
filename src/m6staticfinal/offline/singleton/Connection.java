package src.m6staticfinal.offline.singleton;

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
