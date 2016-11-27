package src.m4polymorphism.webinar4.interFaces;

import src.m4polymorphism.webinar4.Employeeabstractclassandmethods.DeveloperEmployee;

/**
 * Created by Стрела on 02.09.2016.
 * void test(); - пишем вот так - здесь нельзя реализовывать
 * Контракт - лучше к интерфейсу подходит
 *Работает с БД
 * Зеленые кружочки - две строчки - те места  где метод заимплементирован
 * и где интерфейс имплементится
 */
public interface DBService {
    //void test();
    //void method(int a, int b);
    /*
    - у интерфейса нет полей
    -можем дописать к методам abstract - но IDEA подскажет что в интерфейсе это излишнее
     */

    void save(DeveloperEmployee employee);

    DeveloperEmployee get(long id);
    void update(DeveloperEmployee employee);
    DeveloperEmployee[] getallDevelopers();

}
