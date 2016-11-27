package src.m2basetypes.selfedu2basetypes;

/**
 * Created by Стрела on 21.08.2016.
 */
public class TheSumOfTheNumberOfDigits {
    public static void main(String[] args) {
        int n = 98;
        int a = n/10;
        int b = n%10;

        int sumOfNum = a+b;
        System.out.println(a+" + "+b+" = "+sumOfNum);

    }
}
