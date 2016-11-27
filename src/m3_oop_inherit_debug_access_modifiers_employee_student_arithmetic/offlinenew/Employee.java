package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.offlinenew;

/**
 * Created by Стрела on 31.08.2016.
 */
public class Employee extends Person {
    public String adress;
    public int salary;

    public int getSalary() {
        return salary;
    }

    public Employee(boolean gender, String name, int age, String secondName, String adress, int salary) {
        super(gender, name, age, secondName);
        this.adress = adress;
        this.salary = salary;
    }
}
