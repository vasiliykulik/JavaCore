package src.m4polymorphism.offline4.triangle;

/**
 * Created by Стрела on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(0,0);
        Point pointB = new Point(0,1);
        Point pointC = new Point(0,1);

        Triangle triangle = new Triangle (pointA,pointB,pointC);
        triangle.print();
    }
}
