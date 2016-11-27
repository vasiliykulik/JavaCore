package src.m4polymorphism.selfedu4.enumrunchify;

/**
 * Created by Стрела on 04.09.2016.
 */
import java.util.Scanner;

/**
 * @author Crunchify.com
 * In mathematical terms, the sequence Fn of Fibonacci numbers
 * is defined by the recurrence relation

F_n = F_{n-1} + F_{n-2},

with seed values
F_0 = 0, F_1 = 1.

Here is a simplest Java Program to generate Fibonacci Series.
 */
public class CrunchifyFibonacci {

    @SuppressWarnings("resource")
    public static void main(String args[]) {

        //input to print Fibonacci series upto how many numbers
        System.out.print("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("\n\nFibonacci series upto " + number +" numbers : ");
        //printing Fibonacci series upto number
        for(int i=1; i<=number; i++){
            System.out.print(fibonacciRecusion(i) +" ");
        }
    }

    // Java program for Fibonacci number using recursion.
    public static int fibonacciRecusion(int number){
        if(number == 1 || number == 2){
            return 1;
        }

        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); //tail recursion
    }

    // Java program for Fibonacci number using Loop.
    public static int fibonacciLoop(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; //Fibonacci number
    }
}
