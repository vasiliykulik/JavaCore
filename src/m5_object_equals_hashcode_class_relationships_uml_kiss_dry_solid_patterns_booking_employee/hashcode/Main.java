package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.hashcode;

import src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.object.Employee;

import java.util.HashSet;
import java.util.Set;

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
        e2.setId(101);

        System.out.println(e1.equals(new Integer(100)));

        Set employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        System.out.println(employees);

    }

}
