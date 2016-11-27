package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.object;

/**
 * Created by Raketa on 09.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        Object o = new Employee(); // Так можно - но не сильно хорошо, так делать с интерфейсом. - и еще теряются наши методы.        Object нельзя ставить при создании объекта - плохая практика - детальнее в Generic


        e1.toString();
        e1.hashCode();
        e1.hashCode();

        System.out.println(e1.toString());
    }
}
