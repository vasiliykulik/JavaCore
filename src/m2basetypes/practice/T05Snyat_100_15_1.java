package src.m2basetypes.practice;

/**
 * Created by Raketa on 25.08.2016.
 */
public class T05Snyat_100_15_1 {
    static double withdrawBalance(double balance,double withdrawal,double commission){

        return balance-withdrawal-commission;
    }

    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 30;
        double commission = 1.5;

        double balanceAfter = withdrawBalance(balance,withdrawal,commission);

        if (balanceAfter>=0){
            System.out.println("ok");
            System.out.println("on yours account left "+balanceAfter);
        }
        else{
            System.out.println("not enough money");
        }



    }
}
