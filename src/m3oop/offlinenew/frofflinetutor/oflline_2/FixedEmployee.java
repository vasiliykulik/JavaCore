package src.m3oop.offlinenew.frofflinetutor.oflline_2;

/**
 * Created by zetokz on 31.08.16.
 */
public class FixedEmployee extends BaseEmployee {

    private final int monthlyRate;

    public FixedEmployee(final String name, final int monthlyRate) {
        super(name);
        this.monthlyRate = monthlyRate;
    }

    @Override
    public int getAverageSalary() {
        return monthlyRate;
    }

    @Override
    public String toString() {
        return "Name: " + name + " MonthlyRate: " + getAverageSalary();
    }
}
