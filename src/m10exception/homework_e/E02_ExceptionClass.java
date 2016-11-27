package src.m10exception.homework_e;

/* * Create your own exception class using the
 * extends keyword. Write a constructor for this
 * class that takes a String argument and stores
 * it inside the object with a String reference.
 * Write a method that prints out the stored
 * String. Create a try-catch clause to exercise
 * your new exception.*/
class MyException extends Exception {
    String msg;

    public MyException(String msg) {
        this.msg = msg;
    }

    public void printMsg() {
        System.out.println("msg= " + msg);
    }
}

// Or taking a more clever approach,
// noting that string storage and printing are built into Exception:
class MyException2ExceptionClass extends Exception {
    public MyException2ExceptionClass(String message) {
        super(message);
    }
}

public class E02_ExceptionClass {
    public static void main(String[] args) {
        try {
            throw new MyException("MyException message");
        } catch (MyException e) {
            e.printMsg();
        }
        try {
            throw new MyException2ExceptionClass("MyException2 message");
        } catch (Exception e) {
            System.out.println("e.getMessage()  = " + e.getMessage());
        }
    }
}
