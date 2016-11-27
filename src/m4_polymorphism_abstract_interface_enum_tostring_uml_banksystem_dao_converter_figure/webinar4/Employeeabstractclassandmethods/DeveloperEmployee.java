package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.webinar4.Employeeabstractclassandmethods;

/**
 * Created by Стрела on 02.09.2016.
 * нужно оверрайдить paySalary -нужно импелементировать
 * нужно обязательно написать реализацию
 * и должен он быть реализован child
 * Alt + Insert - Заимплементить
 */
public class DeveloperEmployee extends Employee {

    public DeveloperEmployee(int balance, int salary) {
        this.balance = balance;
        this.salary = salary;
    }

    @Override
    void paySalary() {
    balance+=salary+100;
    }
}
