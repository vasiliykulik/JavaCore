package src.m3oop.offlinenew.frofflinetutor.offline_now;

/**
 * Created by zetokz on 31.08.16.
 */
public class Cat extends Animal {

    private String name;

    public Cat(int age, int height) {
        super(age, height);

    }

    public void eat() {
        doSomething();
    }

    public static void main(String[] args) {
        new Cat(9, 200).eat();
    }
}
