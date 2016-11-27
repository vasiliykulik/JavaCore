package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.questionanswer.task4.task4;

/**
 * Created by Raketa on 29.08.2016.
 */
public class Main {
    public static void main(String[] args) {


        String[] phones = {"IPhone", "Android", "Samsung"};//создали массив
        //напрямую не проходили, поле массив не отличается  - только другой тип
        User user = new User();
        user.setPhones(phones);

    }
}
