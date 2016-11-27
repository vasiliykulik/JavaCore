package src.tutor.module4.practice.dao;

public class UserDAO implements DAO {
    @Override
    public Object save(Object user) {
        System.out.println(user.toString() + "saved");
        return user;
    }

    @Override
    public Object update(Object user) {
        System.out.println(user.toString() + "updated");
        return user;
    }

    @Override
    public boolean delete(Object user) {
        System.out.println(user.toString() + "deleted");
        return true;
    }

    @Override
    public Object find(long id) {
        User user = new User("Roma");
        user.setId(id);
        System.out.println(user.toString() + "found");
        return user;
    }
}
