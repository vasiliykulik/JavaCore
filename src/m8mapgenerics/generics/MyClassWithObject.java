package src.m8mapgenerics.generics;

public class MyClassWithObject {

    Object doSomething(Object t) {
        System.out.println("doSomething method is invoked");
        return t;
    }

    Object test(Object b) {
        System.out.println("test method is invoked");
        return b;
    }
}
