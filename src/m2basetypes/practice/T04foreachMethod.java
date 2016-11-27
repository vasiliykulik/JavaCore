package src.m2basetypes.practice;

/**
 * Created by Стрела on 20.08.2016.
 */
public class T04foreachMethod {
    static int balancesSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] balances = {2300, 2345, 456, 346, 453354, 435, 67665, 234, 324332, 234234, 23423, 8987};
        int[] balances1 = {200, 2345, 6, 346, 45354, 435, 67665, 234, 32432, 324, 23423, 8987};

            System.out.println(balancesSum(balances));
            System.out.println(balancesSum(balances1));

        }

    }

