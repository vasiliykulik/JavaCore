package src.m3oop.homework.task4old;

/**
 * Created by Raketa on 29.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        User vasiliy = new User("Vasiliy", 1000, 2, "GoIT", 400, "USD");

        vasiliy.withdraw(400);
        vasiliy.companyNameLenfht("GoIT");
        System.out.println(vasiliy.getBalance());
        vasiliy.monthIncreaser(4);
        System.out.println(vasiliy.getMonthsOfEmployment());

    }
}
