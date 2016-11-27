package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.offlinenew.frofflinetutor.oflline_2;

/**
 * Created by zetokz on 31.08.16.
 */
public abstract class BaseEmployee implements Comparable<BaseEmployee> {

    protected final String name;

    public BaseEmployee(String name) {
        this.name = name;
    }

    public abstract int getAverageSalary();

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(final BaseEmployee o) {
        if (o.getAverageSalary() < this.getAverageSalary())
            return 1;
        if (o.getAverageSalary() > this.getAverageSalary())
            return -1;
        if (o.getAverageSalary() == this.getAverageSalary())
            return o.getName().compareTo(this.getName());
        return 0;
    }
}
