package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.homework_advanced;

/**
 * Created by Raketa on 13.09.2016.
 */
public interface API {
    Room[] findRooms(int price, int persons, String сity, String hotel);

    Room[] getAll();
}
