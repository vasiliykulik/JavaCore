package src.m9lambdasstreamsfunctions.selfedu9;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/**
 * Created by Raketa on 19.10.2016.
 */

/*
Explanation of blue highlighted portions of example’s Code & Output:

A new instance of Consumer interface is defined which is assigned a value of the previous consumer interface(which prints just the space pepended integer) aggregated with the new lambda (which prints (printed i) where i is replaced by the value of the integer passed as input to the lambda).
We thus have two Consumer Interface based operations aggregated – first one prints the integer value and the second one prints (print i) where i is the value of the integer passed.
The consumer interface instance representing aggregated consumer operations is passed as parameter to the printList() method.
The printList() method is still the same as previous example i.e. it simply calls the accept() method on the consumer interface passed to it while iterating through the list of integers passed to it.
While in the previous example the consumer interface passed to it contained a single operation which simply printed the integer value prepended with a single space character; this time the consumer interface does two operations which have been aggregated together for each value – printing the integer value with space prepended and then printing the string (printed i) where is is the integer passed to it. The output of this example is thus – 1(printed 1) 10(printed 10) 200(printed 200) 101(printed 101) -10(printed -10) 0(printed 0)
Summary: In this tutorial we looked at what is the Consumer<T> in-built interface defined in Java 8 and what are its advantages. We then looked at how to use the Consumer interface using its accept() method & the andThen() default method.
 */
//import statements are same as in previous example; hence skipped
public class ConsumerFunctionExample1{
    public static void main(String args[]){
        Consumer<Integer> consumer= i-> System.out.print(" "+i);
        Consumer<Integer> consumerWithAndThen= consumer.andThen( i-> System.out.print("(printed "+i+")"));
        List<Integer> integerList=Arrays.asList(new Integer(1), new Integer(10), new Integer(200), new Integer(101), new Integer(-10), new Integer(0));
        printList(integerList, consumerWithAndThen);
    }
    public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer){
        for(Integer integer:listOfIntegers){
            consumer.accept(integer);
        }
    }
}
