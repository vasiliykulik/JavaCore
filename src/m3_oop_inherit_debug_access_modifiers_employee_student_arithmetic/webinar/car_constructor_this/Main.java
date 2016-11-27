package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.webinar.car_constructor_this;

/**
 * Created by Стрела on 03.09.2016.
 * класс, объект в Java - это тоже переменная, то у нас будет сложный тип
 * при вводе IDEA подсказывает...
 * Car honda; - объявлен но не инициализирован
 * new - новое ключевое слово
 * Car honda = new Car(); - создали реальный объект класса
 * Car  назвал его honda - b я его инициализировал
 * Объект - это не значение или несколько это ссылка
 *
 * Если я уже задал свой конструктор - то дефолтный не используется
 * Car honda = new Car("civik",2009); - вот у меня объект - но уже инициализированный
 * Зачем инициализировать - потому что мы сним ничего делать не можем - у него ничего по сути нет! - он null
 * null pointerException - объект бесполезный
 * что то должно вызываться у объекта
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        int a=5;

        Car honda = new Car("civik",2009);
    }

}
