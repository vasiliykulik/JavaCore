package src.m8mapgenerics.homework8_dao_generic;

/**
 * Created by Стрела on 11.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        AbstractDAOImpl abstractDAOImpl = new AbstractDAOImpl();
        userDAO.users.add(new User(5, "john1"));
        userDAO.users.add(new User(4, "john2"));
        userDAO.users.add(new User(3, "john3"));
        userDAO.users.add(new User(2, "john4"));
        userDAO.users.add(new User(1, "john5"));
        userDAO.users.add(new User(6, "john6"));
        userDAO.users.add(new User(7, "john7"));
        userDAO.users.add(new User(8, "john8"));
        userDAO.users.add(new User(9, "john9"));
        abstractDAOImpl.db.addAll(userDAO.users);

        User user1 = new User(10,"John 11");
        /*
        IDEA желтым подсвечивает
        userDAO.users.add
        userDAO.users.add
        userDAO.users.add
        userDAO.users.add
        userDAO.users.add
        userDAO.users.add
        userDAO.users.add
        userDAO.users.add
        userDAO.users.add
        abstractDAOImpl.db.addAll
         */
        System.out.println(userDAO.get(8));
        userDAO.save(new User (44,"Mari"));
    }
}