package src.m2_basetypes_strings_arrays_for_while_loops_sorts;


public class ArraysExample {

    static int calculateBalanceSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) { //балансы от 1000 до 5000
                sum += balance;
            }
        }
        return sum;
    }

    public static void main(String[] args) {


        int[] balances = {1303, 1232, 900, 432, 5600, 2323, 0, 10};
        int[] balances1 = {1435, 1436, 3460, 436, 5346, 436, 4340, 150};

        int sum = calculateBalanceSum(balances);
        int sum1 = calculateBalanceSum(balances1);
        System.out.println(sum);
        System.out.println(sum1);
    }
}

