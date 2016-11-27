package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.practice.Zadacha2_2;

/**
 * Created by Стрела on 12.09.2016.
 * Так на production логика не проверяется - для этого есть тесты
 * как бы нам порефакторить - написать метод с параметрами true false
 * Мартин каже
 * В мобайле болше принято - более понятный код, или минимум логики boolean
 * для BE - не страшно якщо сервер
 * добавляем final - не вписано
 */
public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.show();
        triangle.hide();
        triangle.isShowing();
        /*
        Square square = new Square();
        square.show();
        square.show();
        square.hide();
        square.hide();
        */
        View square = new Square();
        square.show();
        square.show();
        square.hide();
        square.hide();


    }
}
