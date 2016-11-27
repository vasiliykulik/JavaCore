package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.webinar4.Employeeabstractclassandmethods;

/**
 * Created by Стрела on 02.09.2016.
 * 21:01
 * Будет поле и будет метод
 * и потом у нас будет несколько типов Employeeabstractclassandmethods (с разной реализацией
 * начисления ЗП)
 * Они хотят что бы
 * Я еще не знаю как им будет начисляться зарплата
 * Абстрактный класс - заготовка на будущее - Шаблон
 * какое ограничение у абстрактного класса?
 * Абстрактный метод - это метод - сигнатура - и нет реализации
 * - считайте - он просто у вас должен быть (как я вам сигнатуры бросал)
 * В ДЗ 2 я вам мог дать тот же абстрактные заготовки
 * Абстрактный - без реализации
 *Конструктор в абстрактном классе плохая идея
 *
 * Все должно быть приватным и getter
 * Для чего в абстрактном классе не абстрактный метод?
 * C конкретным - можно Override
 * C абстрактным - обязательно реализуй
 * Абстрактные поля класса - редко используются
 *
 * На практиче часто так делают, так как нет какого начального состояния
 * Как правило в коммерческих проектах через абстракт делают - штук 10
 * и потом внутри конкректного класса делают кончретную реализацию
 *
 * После введения в Main массива - приватим поля и делаем getterы,
 * сеттеры здесь не нужны потому что они в конструкторе
 *
 *и соответственно везде меняем .balance на getBalance()
 */
public abstract class Employee {
    String name;
    int balance;
    int salary;

    abstract void paySalary();

    void printBalance(){
        System.out.println(balance);
    }

    void greeting(){
        System.out.println("Good morning"+name);
    }

    public int getBalance() {
        return balance;
    }

    public int getSalary() {
        return salary;
    }
}
