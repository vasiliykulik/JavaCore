package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.offlinenew.frofflinetutor.task1;

/**
 * Created by zetokz on 31.08.16.
 */
public class Converter {

    private final double rate;

    public Converter(double rate) {
        this.rate = rate;
    }

    public double convertGRNtoUSD(double grn) {
        return grn / rate;
    }

}
