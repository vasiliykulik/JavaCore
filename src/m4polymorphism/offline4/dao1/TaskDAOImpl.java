package src.m4polymorphism.offline4.dao1;

/**
 * Created by Стрела on 05.09.2016.
 * Что бы обойти одинаковые строки - можем сделать абстрактный класс
 * В реальной жизни
 */
public class TaskDAOImpl implements DAO    {
    @Override
    public Object save(Object task) {
        Task task1 = (Task) task;
        System.out.println(task.toString()+"saved");
        return task1;
    }

    @Override
    public Object update(Object task) {
        Task task1 = (Task) task;
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
}
