package src.m2basetypes.selfedu2basetypes;

/**
 * Created by Стрела on 21.08.2016.
 */
public class TheSumOfTheNumberOfDigitsAny {
    public static void main(String[] args) {
        int k = 12345; int x =k;
        int s = 0;
        while (x != 0 ){
            System.out.println(s+" "+x);
            s +=x%10;
            System.out.println(s+" "+x);
            x /=10;
            System.out.println(s+" "+x);
        }
        System.out.println("Сумма цифр в числе " + k + " = " + s);
    }
}
