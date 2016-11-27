package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.practice.Zadacha2;

/**
 * Created by Стрела on 12.09.2016.
 */
public class Triangle extends View {
    private boolean isShowing = false;
    @Override
    public void show() {
        if(isShowing){
            System.out.println("Sorry, this triangle is showing");
            // або з return або з else
        } else {
            System.out.println("showing triangle");
            isShowing = true;
        }
    }

    @Override
    public void hide() {
        if (!isShowing){
            System.out.println("Sorry, this triangle is not showing now");
        }else {
            System.out.println("hiding triangle");
            isShowing = false;
        }
    }
    public boolean isShowing(){
        return isShowing;
    }
}