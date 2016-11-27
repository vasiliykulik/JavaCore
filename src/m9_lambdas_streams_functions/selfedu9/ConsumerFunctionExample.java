package src.m9_lambdas_streams_functions.selfedu9;

/**
 * Created by Raketa on 19.10.2016.
 */
/*
Usage of accept() method of Consumer:
To understand the accept() method lets take a look at the example below where I take a list
 of integers and print them using a method printList(). The printList() method takes 2
  inputs- an instance of Consumer interface which contains the printing logic and the list
   which is to be printed.
 Lets have a look at the code now, post which I will explain in detail how this code works-


 Explanation of above example’s Code & Output:

ConsumerFunctionExample is my class with 2 methods – main() & printList().
In main() method first an instance of Consumer<Integer> is defined(named consumer) using a lambda expression which takes input as an object of type Integer and contains logic to print the value of that Integer.
Next the main() method defines a new list of integers and passes it to the printList() method along with the consumer object defined earlier which contains the printing logic.
The printList() method iterates through the list of integers and invokes the accept() method of the consumer object for every integer in the list.
The accept() method which works as per the lambda definition assigned to the consumer interface, i.e. i-> System.out.print(” “+i) , prints out the value of each integer with
a single space character prepended to it. Thus giving the output 1 10 200 101 -10 0 .
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionExample {
    public static void main(String args[]) {
        Consumer<Integer> consumer = i -> System.out.print(" " + i);
        List<Integer> integerList = Arrays.asList(new Integer(1), new Integer(10), new Integer(200), new Integer(101), new Integer(-10), new Integer(0));
        printList(integerList, consumer);
    }

    public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer) {
        for (Integer integer : listOfIntegers) {
            consumer.accept(integer);
        }
    }
}
