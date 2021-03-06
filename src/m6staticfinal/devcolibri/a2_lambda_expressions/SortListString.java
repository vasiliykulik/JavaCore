package src.m6staticfinal.devcolibri.a2_lambda_expressions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Стрела on 26.09.2016.
 */
public class SortListString {

    public static List<String> sort(List<String> st){
        Collections.sort(st, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        return st;
    }

}