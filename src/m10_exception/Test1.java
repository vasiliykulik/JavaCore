package src.m10_exception;

/**
 * Created by Стрела on 23.10.2016.
 */

public class Test1 {
    public static void main(String[] args) {
        try {
            int a[] = {1, 2, 3};
            System.out.println(a[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Got the Exception");
        } catch (Exception e) {
            System.out.println("Got the Exception");
        }

    }
}
