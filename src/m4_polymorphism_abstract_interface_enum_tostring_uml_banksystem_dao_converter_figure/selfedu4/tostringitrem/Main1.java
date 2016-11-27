package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.selfedu4.tostringitrem;

/**
 * Created by Стрела on 04.09.2016.
 */

import java.util.Calendar;
import java.util.TimeZone;
import java.util.Locale;
import java.util.Date;

public class Main1 {
    public static void main(String[] args) {
        User user = new User("Эдуард", "Пупырышкин", 1990);
        System.out.println(user);
    }
}

class User {
    private String name;
    private String surname;
    private int birthYear;
    User(String name, String surname, int birthYear)
    {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
    /*


   Результат работы такой программы будет:

       User@4d24bd93
       Разумеется, нам это не подходит. А мы бы хотели получить что-то вроде:

       Эдуард Пупырышкин, 22 года
       Добиться подобного результата не сложно, достаточно переопределить метод toString() в нашем классе User. Раз это не сложно, давайте сделаем это
           */
    @Override
    public String toString()
    {
        return this.name+" "+this.surname+", "+getAge()+" года";
    }

    private int getAge()
    {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.setTime(new Date());
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - birthYear;
    }
}
/*
Вопросы для собеседования:

Что будет выведено на экран:
Integer d = 1;
System.out.println(d);
Будет выведено:
1

Что будет выведено на экран:
Integer[] c = {1};
System.out.println(c);
Будет выведено:
java.lang.Integer;@2260e277
а именно: класс-объекта@хэш-код-объекта

Что будет выведено на экран:
String[] b = {"H","e","l","l","o"};
System.out.println(b);
Будет выведено:
java.lang.String;@5502abdb
а именно: класс-объекта@хэш-код-объекта

Что будет выведено на экран:
Integer[] a = {'H'+'e','l'+'l','o'+' ','w'+'o','r'+'l'+'d'};
System.out.println(Arrays.deepToString(a));
Будет выведено:
[173, 216, 143, 230, 322]
Неожиданно? А как по мне вполне ожидаемо, char автоматически преобразовался в int,
а потом в Integer, на этапе инициализации массива.

Каким методом можно получить значения массива из вопроса 3, в виде String
Можно использовать метод deepToString(Array) класса Arrays

Вопрос
Есть такой класс:
class ArrayOfInteger
{
    private Integer[][] arrayOfInt= {{1,2},{3,4}};
}
Ответ
Я переопределю  в классе, метод toString(), внутри метода напишу
 return Arrays.deepToString(arrayOfInt);Вот такой получится класс:
 class ArrayOfInteger
{
    private Integer[][] arrayOfInt= {{1,2},{3,4}};
    @Override
    public String toString() {
        return Arrays.deepToString(arrayOfInt);
    }
}
и получим такой результат:
[[1, 2], [3, 4]]

 */