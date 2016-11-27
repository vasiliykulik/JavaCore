package src.m4polymorphism.webinar4.interFaces;

import src.m4polymorphism.webinar4.Employeeabstractclassandmethods.DeveloperEmployee;

/**
 * Created by Стрела on 02.09.2016.
 * для работы с БД
 * Alt+ Insert - implements
 * Интерфейс  - чисто контракт - я создаю итерфейс и заставлюю что то делать - помощник
 * что бы если бы его не было - например Сениор - написал работу с БД
 * и он взял какойто метод взял и забыл - и потом люди на тестировании или далее
 * обнаруживают - что он нереализован - и на практике такое случалось довольно часто
 * Если вы видите что какаято функциональность должна быть 100% - 100% создавать интерфейс
 * Если мы работаем в Java - не существует множественного наследования - два раза extends
 * делать не можем
 * Но с интерфейсами такая штука катит
 * Наследовать вторым нельзя - имплементить можна
 * нельзя создать экземпляр интерфейса
 *
 * а якщо DeveloperDBService implements 2 interfaces?
 * Можно прописати DBService dbs = new DeveloperDBService()?
 *
 * ты можешь написать ту реализацию которая тебе нужна
 */
public class DeveloperDbService implements DBService,Test  {
    @Override
    public void save(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee get(long id) {
        return null;
    }

    @Override
    public void update(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee[] getallDevelopers() {
        return new DeveloperEmployee[0];
    }

    @Override
    public void test() {

    }
}
