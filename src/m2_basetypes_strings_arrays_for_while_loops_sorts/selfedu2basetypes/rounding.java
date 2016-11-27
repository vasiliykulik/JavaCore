package src.m2_basetypes_strings_arrays_for_while_loops_sorts.selfedu2basetypes;

/**
 * Created by Стрела on 21.08.2016.
 */
public class rounding {
    public static void main(String[] args){

        double x = 3.500000;
        int a = (int) x;
        double b = x-a;
        double c= b*2;
        int d= a+(int) c;

        System.out.println(d+" "+b);
    }
}
