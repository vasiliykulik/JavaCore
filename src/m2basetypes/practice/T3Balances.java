package src.m2basetypes.practice;

/**
 * Created by Стрела on 20.08.2016.
 */
public class T3Balances {
    public static void main(String[] args) {
        int[] balances = {2300, 2345, 456, 346, 453354, 435, 67665, 234, 324332, 234234, 23423, 8987};
        int sum = 0;

        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {

                System.out.println(balance);
            }
        }

    }
}
