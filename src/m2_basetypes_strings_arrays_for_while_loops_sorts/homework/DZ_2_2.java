package src.m2_basetypes_strings_arrays_for_while_loops_sorts.homework;

/**
 * Created by Raketa on 26.08.2016.
 */
public class DZ_2_2 {
    static void withdrawBalance(double balance, double withdrawal,int commission) {

        double balanceAfter = balance - withdrawal-(withdrawal/100 *commission);

        if (balanceAfter >= 0) {
            System.out.println("OK " + commission+" " + balanceAfter);
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 50;
        int commission = 5;

        //
        withdrawBalance(balance,withdrawal,commission);

    }
}
