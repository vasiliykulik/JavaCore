package src.m4polymorphism.webinar4.Employeeabstractclassandmethods;

/**
 * Created by Стрела on 02.09.2016.
 * enum - лежит все list красиво
 * достаточно часто юзают
 * Структуры данных это уже хардкор - это намного удобнее
 * таких низкоуровневых штук я не знаю
 * enum - что бы каши не было
 * лист аррей чи енам - зависит от ситуации
 * StringBuffer - это при вычитке файлов и вычитке консолей
 */
public class ManagerEmployee extends Employee {

    public ManagerEmployee(int balance, int salary) {
        this.balance = balance;
        this.salary = salary;
    }
    @Override
    void paySalary() {
        double k = 1.1;
        balance += salary * k + 200;
    }
}
