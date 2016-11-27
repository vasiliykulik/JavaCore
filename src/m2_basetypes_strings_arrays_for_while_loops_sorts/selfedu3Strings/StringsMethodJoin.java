package src.m2_basetypes_strings_arrays_for_while_loops_sorts.selfedu3Strings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Стрела on 21.08.2016.
 */
public class StringsMethodJoin {
    public static void main(String[] args) {
        String hello = "Hello";
        String habr = "habrahabr";
        String delimiter = ", ";

        System.out.println(String.join(delimiter, hello, habr));
// или так
        System.out.println(String.join(delimiter, new ArrayList<CharSequence>(Arrays.asList(hello, habr))));
// в обоих случаях "Hello, habrahabr"
    }
}
