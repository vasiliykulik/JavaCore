package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.selfedu3.inheritance;

/**
 * Created by Стрела on 02.09.2016.
 */
public class Bicycle {
    int cadence = 0;
    int speed =0;
    int gear =0;

    void changeCadence(int newValue){
        cadence =newValue;
    }
    void changeGear (int newValue){
        gear=newValue;
    }
    void speedUp(int increment){
        speed=speed +increment;
    }
    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
