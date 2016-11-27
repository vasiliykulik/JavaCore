package src.m4polymorphism.selfedu4.enumjavahowto;

/**
 * Created by Стрела on 04.09.2016.
 * Enum that overrides toString method. A semicolon after the last element is required to be able to compile it.
 * More details on overriding enum toString method can be found here.
 */
public enum Color1 {
    WHITE, BLACK, RED, YELLOW, BLUE;  //; is required here.

    @Override public String toString() {
        //only capitalize the first letter
        String s = super.toString();
        return s.substring(0, 1) + s.substring(1).toLowerCase();
    }
}
