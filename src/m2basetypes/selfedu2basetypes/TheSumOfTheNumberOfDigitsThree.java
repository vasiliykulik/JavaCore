package src.m2basetypes.selfedu2basetypes;

/**
 * Created by Стрела on 21.08.2016.
 */
public class TheSumOfTheNumberOfDigitsThree {
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
