package src.m10exception.homework_e;

/* Create a class with two methods, f() and g().
 * In g(), throw an exception of a new type that
 * you define. In f(), call g(), catch its
 * exception and, in the catch clause, throw a
 * different exception (of a second type that you
 * define). Test your code in main().*/
class AnException extends Exception {
}

class AnotherException extends Exception {
}

public class E04_ChangeException {
    public void g() throws AnException {
        throw new AnException();
    }

    public void f() throws AnotherException {
        try {
            g();
        } catch (AnException e) {
            throw new AnotherException();
        }
    }

    public static void main(String[] args) {
        E04_ChangeException ce = new E04_ChangeException();
        try {
            ce.f();
        } catch (AnotherException e) {
            e.printStackTrace();
        }
    }
}
