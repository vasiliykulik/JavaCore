package src.m2basetypes.selfedu2basetypes;

/**
 * Created by Стрела on 21.08.2016.
 */
public class Rounding {
    public static void main(String[] args){

        double x = 3.500000;
        int a = (int) x;
        double b = x-a;
        double c= b*2;
        int d= a+(int) c;

        System.out.println(d+" "+b);
    }
}
