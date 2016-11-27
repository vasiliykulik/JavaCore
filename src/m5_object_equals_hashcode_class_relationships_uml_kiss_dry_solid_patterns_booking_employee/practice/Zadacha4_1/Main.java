package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.practice.Zadacha4_1;

import src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.practice.Zadacha2_1.Square;

/**
 * Created by Стрела on 12.09.2016.
 * Так на production логика не проверяется - для этого есть тесты
 * как бы нам порефакторить - написать метод с параметрами true false
 * Мартин каже
 * В мобайле болше принято - более понятный код, или минимум логики boolean
 * для BE - не страшно якщо сервер
 * добавляем final - не вписано
 * Суть - створили два хеши - поклали вьюху - и сравнили
 * Объект - это ссылки,
 *
 *
 * Не хватает addView
 */
public class Main {
    public static void main(String[] args) {
/*
        Square square1 = new Square();
        Square square2 = new Square();

        square1.show();
        square1.show();

        square1.hide();
        square1.hide();

        Apple apple = new Apple(100);
        Apple apple1 = new Apple(100);
        System.out.println(apple.equals(apple1));
        System.out.println(apple1==apple);// false = поривнюэ ссилки, поривнюэмо
*/
        Square square = new Square();
        square.show();
        Square square2 = new Square();
        square2.show();

        ViewHash viewHash1 = new ViewHash();
        ViewHash viewHash2 = new ViewHash();
        /*
        viewHash1.addView(square);
        viewHash2.addView(square2);
        */
        System.out.println(viewHash1.equals(viewHash2));
    }
}
