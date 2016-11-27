package src.m2basetypes.homework;

/**
 * Created by Raketa on 26.08.2016.
 */
public class DZ_2_3 {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static void withdrawBalance(String ownerName, double withdrawal) {
        double commission = withdrawal / 100 * 5;
        double balanceAfter = 0;
        for (int i = 0; i < ownerNames.length - 1; i++) {
            if (ownerNames[i] == ownerName) {
                balanceAfter = balances[i] - withdrawal - commission;
                break;
            }
        }
        if (balanceAfter >= 0) {
            System.out.println(ownerName + " " + withdrawal + " " + balanceAfter);
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {

        String ownerName = "Oww";
        double withdrawal = 100;

        withdrawBalance(ownerName, withdrawal);
        /*
        enums ownerName = "Ann";
        double withdrawal = 100;
*/
    }
}
