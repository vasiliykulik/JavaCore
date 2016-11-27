package src.m2basetypes.practice;

/**
 * Created by Стрела on 20.08.2016.
 */
public class T05Snyat_100_15bred {
    // Если денег на балансе хватает  - то дать снять - если нет то не, но еще есть коммисия 1.5грн
    // (кто может пишите сразу - комиссия будет плавающей)
    // - на счету 100
    // n денег снять, k баланс
    // Баланс = баланс - снятие - комиссия
    // Когда у меня денег не достаточно на счету вернуть -1 - как ошибка или минусовой баланс

    static double withdraw(double balance,double withdrawal){
        double commission = 1.5;
        return balance - withdrawal - commission;
    }

    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 30.5;

        double balanceAfter = withdraw(balance, withdrawal);

        if(withdraw(balance, withdrawal)==0){
            System.out.println("ok");
            System.out.println(balanceAfter);
        }
        else{
            System.out.println("no");
        }

    }
}
// плюс этого решения - добавить кусок новой логики и минимум переписывать