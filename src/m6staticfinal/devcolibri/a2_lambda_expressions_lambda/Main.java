package src.m6staticfinal.devcolibri.a2_lambda_expressions_lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Стрела on 26.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\n-- Lambda Expressions: Sort List --");
        List<String> st = Arrays.asList("Steve", "Alex", "Jim", "Bob");
        System.out.println("Before sort: " + st);
        System.out.println("After sort: " + SortListString.sort(st));
    }
}
