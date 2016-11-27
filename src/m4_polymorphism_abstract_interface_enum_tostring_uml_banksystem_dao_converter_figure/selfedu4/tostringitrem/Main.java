package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.selfedu4.tostringitrem;

/**
 * Created by Стрела on 04.09.2016.
 * Самое главное знать, что метод toString() есть у всех объектов и все объекты используют этот метод при работе со строками. По-умолчанию он состоит из двух составляющих разделенных собачкой. Эти составляющие: имя_класса_объекта и хэш_кода. Пример: java.lang.Integer;@24d200d8. Теперь посмотрим как это работает.

 Для начала, давайте поиграемся с обычными переменными объектного типа и с массивами на их основе.
 */
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Test 1
        Integer a = 1;

        // Test 2, Test 3, Test 4
        Integer [] b = new Integer [3];
        b[0] = 1;   b[1] = 1;   b[2] = 1;

        // Test 5, Test 6
        Integer [][] c = new Integer [2][3];
        c[0][0] = 1;    c[0][1] = 2;    c[0][2] = 3;
        c[1][0] = 4;    c[1][1] = 5;    c[1][2] = 6;

        // Test 7
        String [][] d = new String [2][3];
        d[0][0] = "1";  d[0][1] = "2";  d[0][2] = "3";
        d[1][0] = "4";  d[1][1] = "5";  d[1][2] = "6";

        // Test 8
        String[][] e = { {"X", "O", "O"},
                {"O", "X", "X"},
                {"X", "O", "X"}};

        System.out.println("Test 1 | a");
        System.out.println(a);

        System.out.println("\nTest 2 | b[]");
        System.out.println(b);

        System.out.println("\nTest 3 | b[].toString");
        System.out.println(b.toString());

        System.out.println("\nTest 4 | Arrays.deepToString(b[])");
        System.out.println(Arrays.deepToString(b));

        System.out.println("\nTest 5 | c[][]");
        System.out.println(c);

        System.out.println("\nTest 6 | Arrays.deepTostring(c[][])");
        System.out.println(Arrays.deepToString(c));

        System.out.println("\nTest 7 | Arrays.deepTostring(d[][])");
        System.out.println(Arrays.deepToString(d));

        System.out.println("\nTest 8 | Arrays.deepTostring(e[][])");
        System.out.println(Arrays.deepToString(e));

    }

}
/*

Test 1 | a
1

Test 2 | b[]
[Ljava.lang.Integer;@24d200d8

Test 3 | b[].toString
[Ljava.lang.Integer;@24d200d8

Test 4 | Arrays.deepToString(b[])
[1, 1, 1]

Test 5 | c[][]
[[Ljava.lang.Integer;@573577ca

Test 6 | Arrays.deepTostring(c[][])
[[1, 2, 3], [4, 5, 6]]

Test 7 | Arrays.deepTostring(d[][])
[[1, 2, 3], [4, 5, 6]]

Test 8 | Arrays.deepTostring(e[][])
[[X, O, O], [O, X, X], [X, O, X]]
Давайте теперь разберем, что же тут происходит.

Тест 1: Видим что все объектные типы прекрасно сами конвертируются в строку.
Тест 2: Пробуем вывести массив. Видим что выводится тип-объекта и его хеш-код.
Тест 3: Пробуем вызвать toString() самостоятельно. Видим что получаем тот же результат, что в тесте 2. А как же распечатать массив?
Тест 4: Пробуем использовать метод deepToString(Object[] a) класса Arrays.  Массив печатается.
Тест 5: Пробуем воспользоваться методом toString для двумерного массива. Результат тот же - тип-объекта и хеш-код.
Тест 6: Пробуем использовать метод deepToString(Object[] a) класса Arrays.  Двумерный массив печатается.
Тест 7: Пробуем использовать метод deepToString(Object[] a) класса Arrays для двумерного массива строк.  Массив печатается.
Тест 8: Пробуем использовать метод deepToString(Object[] a) класса Arrays для массива объявленого и сразу проинициализированного.  Массив печатается.
Делаем выводы: чтобы распечатать массив, нужно использовать метод класса Arrays.deepToString.
 */