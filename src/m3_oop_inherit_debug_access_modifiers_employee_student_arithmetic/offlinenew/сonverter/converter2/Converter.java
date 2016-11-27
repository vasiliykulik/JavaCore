package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.offlinenew.сonverter.converter2;

/**
 * Created by Стрела on 31.08.2016.
 */
public class Converter {
    private final double rate;// инит в конструктори - те далее


    public Converter(double rate) {// Конструктор
        this.rate = rate; // и передали

    }

    public double convertGRN(double grn) {  // метод публ як для використ

        return grn / rate;

    }
}
