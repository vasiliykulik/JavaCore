package src.m4polymorphism.selfedu4.abstractinterfaceinterfaceinheritancekostin.classa;

/**
 * Created by Стрела on 04.09.2016.
 */
abstract class A {
    int p1;
    A() {
        p1 = 1;
    }
    void print() {
        System.out.println(p1);
    }
}
class B extends A {
}
