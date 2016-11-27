package src.m2basetypes.homework;

/**
 * Created by Raketa on 26.08.2016.
 */
public class DZ_2_4 {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static String withdrawBalance(String ownerName, double fund) {
        int balanceAfter = 0;
        String result = "0";
        for (int i = 0; i <= ownerNames.length - 1; i++) {
            if (ownerNames[i] == ownerName) {
                balanceAfter = (int) (balances[i] + fund);
                result = ownerName + " " + balanceAfter;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String ownerName = "Jack";
        double fund = 100;
        /*
        enums ownerName = "Ann";
        double withdrawal = 100;
*/
        System.out.println(withdrawBalance(ownerName, fund));

    }
}
