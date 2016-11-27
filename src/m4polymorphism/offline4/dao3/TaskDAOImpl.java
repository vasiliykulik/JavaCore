package src.m4polymorphism.offline4.dao3;

/**Задача 4
 * Created by Стрела on 05.09.2016.
 * Проекстендили абстрактный класс
 *
 * Преимущество что если заюзаем Main
 * Написали две реализации
 *
 *
 */
public class TaskDAOImpl extends AbstractDAO implements DAO {

    @Override// Переписанный
    public Object update(Object task) {
        return super.update(task);
    }

    @Override
    public boolean delete(Object task) {
        return super.delete(task);
    }

    @Override
    public Object find(long id) {
        Task task = new Task("Calculate min/max...");
        task.setId(id);
        return task;
    }

    void test(){

    }
}
