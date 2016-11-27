package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.practice.Zadacha4_1;

/**
 * Created by Стрела on 12.09.2016.
 */
public class Square extends View {
    private int counter=0;

    @Override
    public void show() {
        counter++;
        System.out.println("New square "+counter+" showing");

    }

    @Override
    public void hide() {
        if(counter<=0){
            System.out.println("Sorry there is no any square");
        }else {
            System.out.println("square " + counter + " hided");
            counter--;
        }
    }
}
