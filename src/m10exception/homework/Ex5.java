package src.m10exception.homework;

/**
 * Created by Стрела on 25.10.2016.
 */

/*Create three new types of exceptions. Write a class with a method that
 throws all three. In main( ), call the method but only use a single catch
 clause that will catch all three types of exceptions.*/
class ExceptionOne extends Exception {
    ExceptionOne(String msg) {
        super(msg);
    }
}

class ExceptionTwo extends Exception {
    public ExceptionTwo(String message) { // конструктор на message
        super(message);
    }
}

class ExceptionThree extends Exception {
    ExceptionThree(String msg) {
        super(msg);
    }
}

public class Ex5 {
    public static void f(int x) throws ExceptionOne, ExceptionTwo, ExceptionThree{
        if(x<0) throw new ExceptionOne("x<0");
        if(x==0) throw new ExceptionTwo("x==0");
        if(x>0) throw new ExceptionThree("x>0");
    }

    public static void main(String[] args) {
        try{
            f(0);
            f(1);
            f(-1);
            // will catch any Exception type
        }catch (Exception e){
            System.err.println("Caught Exception");
            e.printStackTrace();
        }
    }
}
