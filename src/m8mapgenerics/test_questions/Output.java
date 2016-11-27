package src.m8mapgenerics.test_questions;

/**
 * Created by Стрела on 11.10.2016.
 */
public class Output {
    public static void main(String[] args) {
        genericstack<String> gs = new genericstack<String>();
        gs.push("Hello");
        System.out.println(gs.pop() + "");
        genericstack<Integer> gs1 = new genericstack<Integer>();
        gs1.push(36);
        System.out.println(gs1.pop());
    }
}
