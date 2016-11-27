package src.m2basetypes;

/**
 * Created by Стрела on 21.08.2016.
 */
public class ArraysExample1 {

    static int calculateBalance(int [] receivedBalance){
        int sum = 0;
        for (int balance:receivedBalance){
            if (balance>1000 && balance<5000){
                sum+=balance;
            }
        }
        return sum;
       }

    public static void main(String[] args) {


        int[] balances = {1546, 254645, 34564, 4453, 5678, 6333, 7222, 855, 966, 10};
        int[] balances1 = {10, 9, 8334, 7556, 6432, 5778, 4445, 3, 2333, 1};

        int sum = calculateBalance(balances);
        int sum1 = calculateBalance(balances1);

        System.out.println("По первому массиву = " + sum);
        System.out.println("По второму массиву = " + sum1);

    }
}
