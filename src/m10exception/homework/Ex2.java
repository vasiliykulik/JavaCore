package src.m10exception.homework;

/* Create your own exception class using the extends keyword. Write a
* constructor for this class that takes a String argument and stores it inside
* the object with a String reference. Write a method that displays the stored
* String. Create a try-catch clause to exercise your new exception.
*/
class Exception2 extends Exception {
    private String msg;
    Exception2(String msg) {
        super(msg);
        System.out.println("Exception2()");
        this.msg = msg;
    }
    protected void showS() {
        System.out.println("Message from Exception2: " + msg);
    }
}
public class Ex2 {
    public static void f() throws Exception2 {
        System.out.println("f()");
        throw new Exception2("Ouch from f()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception2 e) {
            System.err.println("Caught Exception2");
            e.printStackTrace();
            e.showS();
        }
    }
}
