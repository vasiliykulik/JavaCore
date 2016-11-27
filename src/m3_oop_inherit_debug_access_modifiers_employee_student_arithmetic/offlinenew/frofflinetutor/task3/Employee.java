package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.offlinenew.frofflinetutor.task3;

/**
 * Created by zetokz on 31.08.16.
 */
public class Employee extends Person {

    private String address;
    private int salary;

    public Employee(String firstName, String lastName, boolean gender, int age, String address, int salary) {
        super(firstName, lastName, gender, age);
        this.salary = salary;
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public String getAllInfos() {
        return new String(address + salary);
    }
}
