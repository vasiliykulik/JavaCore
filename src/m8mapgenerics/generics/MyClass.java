package src.m8mapgenerics.generics;

//import java.lang.T;

public class MyClass <T, B> {

    T doSomething(T t) {
        System.out.println("doSomething method is invoked");
        return t;
    }

    B test(B b) {
        System.out.println("test method is invoked");
        return b;
    }
}
