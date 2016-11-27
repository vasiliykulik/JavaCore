package src.m10exception.homework_e;

/* * Create three new types of exceptions. Write a
 * class with a method that throws all three. In
 * main(), call the method but only use a single
 * catch clause that will catch all three types
 * of exceptions.*/
class ExBase extends Exception {
}

class Ex1 extends ExBase {
}

class Ex2 extends ExBase {
}

class Ex3 extends ExBase {
}

class Thrower {
    void f() throws Ex1, Ex2, Ex3 {
        throw new Ex1();
        // We aren't forced to throw all the
        // exceptions in the specification.
    }
}

public class E05_CatchAll {
    public static void main(String[] args) {
        Thrower t = new Thrower();
        try {
            t.f();
        } catch (ExBase e) {
            System.out.println("caught " + e);
        } catch (Exception e) {
            System.out.println("caught " + e);
        }
    }
}    /*We create a common base class for all three exceptions, then catch the common
        base exception. Alternatively, we can just catch Exception, from which all
        exceptions inherit.*/
