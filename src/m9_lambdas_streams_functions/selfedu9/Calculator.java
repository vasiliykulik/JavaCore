package src.m9_lambdas_streams_functions.selfedu9;

/**
 * Created by Raketa on 19.10.2016.
 */

/*
Note that a lambda expression looks a lot like a method declaration; you can consider
 lambda expressions
 as anonymous methods—methods without a name.

The following example, Calculator, is an example of lambda expressions that take more
 than one formal parameter
 */
public class Calculator {

    interface IntegerMath {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {

        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " +
                myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
                myApp.operateBinary(20, 10, subtraction));
    }
}
