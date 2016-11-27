package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.devcolibri.a2_lambda_expressions_lambda;

import java.util.Collections;
import java.util.List;

/**
 * Created by Стрела on 26.09.2016.
 */
public class SortListString {

    public static List<String> sort(List<String> st){
        Collections.sort(st, (a, b) -> a.compareTo(b));

        return st;
    }

}