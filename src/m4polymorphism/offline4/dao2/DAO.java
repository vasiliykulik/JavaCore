package src.m4polymorphism.offline4.dao2;

/**
 * Created by Стрела on 05.09.2016.
 * Напишем три реализации с наследованием
 * DAO - Data access Object - детают такую приставку для класса который работает непосредственно с БД
 * Object - общий парент - делаем грязный хак
 */
public interface DAO {
    /*
    4 стандартных метода для работы с БД - двайте будем сохранять сущность User
    возвращает User - что бы если не сохранилось - вернуло null
     */
    Object save(Object object);
    Object update(Object object);
    boolean delete(Object object); // принято делать void для простоты сделаем boolean
    Object find(long id);

}
