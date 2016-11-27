package src.m4polymorphism.offline4.dao2;

/**
 * Created by Стрела on 05.09.2016.
 * Проекстендили абстрактный класс
 *
 * Преимущество что если заюзаем Main
 */
public class TaskDAOImpl extends AbstractDAO implements DAO {

    /*

     */


    @Override// Переписанный
    public Object save(Object task) {
        System.out.println(task.toString()+"saved");
        return super.save(task);
    }

    @Override
    public Object update(Object task) {
        System.out.println(task.toString()+"updated");
        return task;
    }

    @Override
    public boolean delete(Object task) {
        System.out.println(task.toString()+"deleted");
        return true;
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
