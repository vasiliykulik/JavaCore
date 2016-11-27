package src.m4polymorphism.webinar4.Employeeabstractclassandmethods;

/**
 * Created by Стрела on 02.09.2016.
 * как в фигура но через абстрактные
 *
 * Теперь есть все три принципа ООП
 * например если бы у нас было бы 100 строчек
 *
 * Давайте посмотрим как оно упростило жизнь
 *
 * Не абстрактят до бесконечности - обычно один абстрактный класс
 *
 * Мы должны реализовывать в наследнике - если наследование дальше не идет...
 * нет не могу - в кждом классе вы должны реализовываться - заставляет реализовывать
 *
 * Конструктор в абстрактном классе плохая идея:
 * Делаем конструктор в абстрактном классе - затем переносим в класс реализацию -
 * соответственно уточняя объект
 *
 */

public class Main {
/*
так как в Main методе - то указываем static
модифицируем метод под массив
 */
    static void paySalary(Employee[] employees){
        for(Employee employee:employees)
        employee.paySalary();
    }
    public static void main(String[] args) {
        /*
        developerEmployee.paySalary(); // строки повторяются это не хороший код
        managerEmployee.paySalary();
*/
        DeveloperEmployee developerEmployee = new DeveloperEmployee(0, 1000);
        ManagerEmployee managerEmployee = new ManagerEmployee(10,500);
 /*
 сделали метод в Main - статик, еще код не идеален - все равно две строчки
 Нам надо какято - идеальная структура данных которая будет хранить столько Employee, сколько нам нужно -
 примитивную структуру данных и это массив
        paySalary(developerEmployee);
        paySalary(managerEmployee);
  */
        Employee[] employees = {developerEmployee, managerEmployee};
        /*
        в paySalary закидываем наш массив
         */
        paySalary(employees);
        /*
        Вот так достаточно хорошо - достаточно красиво - здесь у нас полиморфизм и наследование
        и наследование чуть чуть - все признаки ООП
         */

        System.out.println(developerEmployee.getBalance());
        System.out.println(managerEmployee.getBalance());


    }


}
