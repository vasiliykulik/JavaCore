package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.offline4.triangle2;

/**
 * Created by Стрела on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(0,0);
        Point pointB = new Point(1,1);
        Point pointC = new Point(0,0);

        Triangle triangle = new Triangle (pointA,pointB,pointC);
        triangle.print();
        System.out.println(triangle);
    }
}
