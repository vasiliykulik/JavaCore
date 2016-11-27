package src.m10exception.homework_e.banki;

/**
 * Created by Стрела on 06.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Bank usBank = new USBank(1, "US", Currency.USD, 100, 3500, 1, 13000000);
        Bank euBank = new EUBank(1, "EU", Currency.EUR, 200, 4000, 1, 800000000);
        Bank chBank = new ChinaBank(1, "RC", Currency.USD, 300, 1200, 1, 1000000000);

        User usera = new User();
        usera.setBalance(10000);
        usera.setSalary(2500);
        usera.setBank(usBank);
        User userb = new User();
        userb.setBalance(20000);
        userb.setSalary(2700);
        userb.setBank(usBank);
        User userc = new User();
        userc.setBalance(3000);
        userc.setSalary(4500);
        userc.setBank(euBank);
        User userd = new User();
        userd.setBalance(4000);
        userd.setSalary(4700);
        userd.setBank(euBank);
        User usere = new User();
        usere.setBalance(500);
        usere.setSalary(200);
        usere.setBank(chBank);
        User userf = new User();
        userf.setBalance(600);
        userf.setSalary(400);
        userf.setBank(chBank);

        BankSystem bankSystem = new BankSystemImpl();

        bankSystem.fundUser(usera, 1000);
        bankSystem.paySalary(userb);
        bankSystem.transferMoney(usera, userc, 60);
        bankSystem.withdrawOfUser(userd, 50);
        System.out.println(usera);
        System.out.println();
        System.out.println(userb);
        System.out.println();
        System.out.println(userc);
        System.out.println();
        System.out.println(userd);
    }
}
