package src.m3oop.offlinenew.frofflinetutor.oflline_2;

/**
 * Created by zetokz on 31.08.16.
 */
public class TimedEmployee extends BaseEmployee {

    private static final int MULTIPLYER = 20;
    private static final int HOURS = 8;

    private final int hourlyRate;

    public TimedEmployee(final String name, final int hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public int getAverageSalary() {
        return MULTIPLYER * HOURS * hourlyRate;
    }

    @Override
    public String toString() {
        return "Name: " + name + " MonthlyRate: " + getAverageSalary();
    }
}
