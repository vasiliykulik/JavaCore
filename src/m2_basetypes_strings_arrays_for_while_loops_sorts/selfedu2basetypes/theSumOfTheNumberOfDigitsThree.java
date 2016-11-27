package src.m2_basetypes_strings_arrays_for_while_loops_sorts.selfedu2basetypes;

/**
 * Created by Стрела on 21.08.2016.
 */
public class theSumOfTheNumberOfDigitsThree {
    public static void main(String[] args) {
        int n = 34532;
        int x = n;
        int s = 0;
        do {
            s += n % 10;
            n = n / 10;
        }
        while (n != 0);
        System.out.println("сумма цифр " + x + " = " + s);
    }
}
