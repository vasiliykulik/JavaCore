package src.m4polymorphism.webinar4.Employeeabstractclassandmethods;

/**
 * Created by Стрела on 02.09.2016.
 * если объявить этот класс абстрактным - и ничего не реализовывать
 *  - то это крайность - неудобно - нечитаемо - неудобно
 */
public class HREmployee extends Employee {
    @Override
    void paySalary(){
        double k =1.1;
        balance+=salary*k;
    }
}
