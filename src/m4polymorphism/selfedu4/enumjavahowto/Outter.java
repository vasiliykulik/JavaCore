package src.m4polymorphism.selfedu4.enumjavahowto;

/**
 * Created by Стрела on 04.09.2016.
 * Enum embedded inside a class. Outside the enclosing class,
 * elements are referenced as Outter.Color.RED, Outter.Color.BLUE,etc.
 */
public class Outter {
    public enum Color {
        WHITE, BLACK, RED, YELLOW, BLUE
    }
}
