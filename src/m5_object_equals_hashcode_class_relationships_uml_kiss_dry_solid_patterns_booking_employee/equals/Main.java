package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.equals;

import src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.object.Employee;

/**
 * Created by Raketa on 09.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b =5;

        //System.out.println(a==b);
        // equals is used to compare objects


        Employee test = null;

        Employee e1 = new Employee();
        e1.setId(101);
        Employee e2 = new Employee();
        e2.setId(102);

        System.out.println(e1.equals(new Integer(100)));
    }
}
