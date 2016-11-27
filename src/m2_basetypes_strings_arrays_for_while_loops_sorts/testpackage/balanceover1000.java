package src.m2_basetypes_strings_arrays_for_while_loops_sorts.testpackage;

/**
 * Created by Raketa on 20.08.2016.
 */
public class balanceover1000 {
    public static void main(String[] args) {


        int[] balances = {1303, 1232, 900, 432, 5600, 2323, 0, 10};
        for (double balance : balances) {
            if (balance > 1000) {
                System.out.println("email was sent ... " + balance);
            }
        }
    }
}