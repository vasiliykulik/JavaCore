package src.m3oop.offlinenew.frofflinetutor.offline_now;

/**
 * Created by zetokz on 31.08.16.
 */
public class Animal {

    protected int height;
    protected int age;
    protected int weight = 0;

    public Animal(final int age, final int height) {
        this.age = age;
        this.height = height;
        System.out.println("Animal()");
    }

    protected void doSomething() {
        System.out.println("doSomething from Cat");
    }

    public void sleep() {

    }
}
