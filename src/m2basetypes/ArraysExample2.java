package src.m2basetypes;

/**
 * Created by Стрела on 21.08.2016.
 */
public class ArraysExample2 {

    static int calculateBalance(int[] receivedBalance){
        int sum = 0;
        for (int balance:receivedBalance){
            if(balance>1000 && balance<5000){
                sum += balance;
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        int [] balances = {23,456,54645,45646,2342,98089,43345,477};
        int [] balances1 = {2344,4564,76867,90898,5644,2342,234};

        int sum = calculateBalance(balances);
        int sum1 = calculateBalance(balances1);

        System.out.println(sum);
        System.out.println(sum1);
    }
}
