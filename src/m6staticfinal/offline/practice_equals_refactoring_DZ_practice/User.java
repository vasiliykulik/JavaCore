package src.m6staticfinal.offline.practice_equals_refactoring_DZ_practice;

/**
 * Created by Стрела on 19.09.2016.
 */
public class User {
private static int counter =0;
    public User() {
        // init some fields
        counter = counter + 1;
    }
    public static int getCounter() {
        return counter;
    }
}
