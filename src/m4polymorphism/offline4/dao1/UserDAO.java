package src.m4polymorphism.offline4.dao1;

/**
 * Created by Стрела on 05.09.2016.
 * Пишем реализацию
 */
public class UserDAO implements DAO {

    @Override
    public Object save(Object user) {// на вход приходит объект  - кривовато - нужно здесь этого User  привести к типу User
        /*
        Объект идет User
        явно приводим к типу
         */
        User user1 = (User) user;
        System.out.println(user.toString() + "saved");
        return user;
    }

    @Override
    public Object update(Object user) {
        System.out.println(user.toString() + "updated");
        return user;
    }

    /*
   @Override - не несет нагрузки
     */
    @Override
    public boolean delete(Object user) {
        System.out.println(user.toString() + "deleted");
        return true;
    }

    /*
    так делать нельзя - мы запрос делаем - а мы создаем и возвращаем )
     */
    @Override
    public Object find(long id) {
        User user = new User("Roma");
        user.setId(id);
        System.out.println(user.toString() + "found");
        return user;
    }
}
