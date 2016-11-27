package src.m6staticfinal.offline.singleton;

/**
 * Created by Стрела on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Connection.getInstance());
        System.out.println(Connection.getInstance());
        System.out.println(Connection.getInstance());
        System.out.println(Connection.getInstance());
    }
}
