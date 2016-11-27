package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.homework.task4;

/**
 * Created by Raketa on 29.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        User vasiliy = new User("Vasiliy", 1000, 2, "GoIT", 400, "USD");

        vasiliy.paySalary(2500);
        System.out.println(vasiliy.getBalance());
        vasiliy.withdraw(400);
        vasiliy.companyNameLength("GoIT");
        System.out.println(vasiliy.getBalance());
        vasiliy.monthIncreaser(4);
        System.out.println(vasiliy.getMonthsOfEmployment());

    }
}
