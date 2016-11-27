package src.m10exception;

/**
 * Created by Стрела on 23.10.2016.
 */
public class Test extends Exception {
    public static void main(String[] args) {
        try {
            throw new Test();
        } catch (Test t) {
            System.out.println("Got the Exception");
        } finally {
            System.out.println("Inside finally block");
        }
    }
}