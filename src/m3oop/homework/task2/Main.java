package src.m3oop.homework.task2;

/**
 * Created by Andrey on 8/26/16.
 */
public class Main {
    private Integer a;
    private Integer b;

    public static void main(String[] args) {

        Adder result = new Adder();

        System.out.println(result.add(3, 6));
        System.out.println(result.check(3, 6));
    }
}
