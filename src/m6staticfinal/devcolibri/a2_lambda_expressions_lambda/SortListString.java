package src.m6staticfinal.devcolibri.a2_lambda_expressions_lambda;

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