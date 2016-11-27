package src.m8mapgenerics.hw8_getid;

/**
 * Created by Стрела on 11.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        UserDAOImpl userDAOImpl = new UserDAOImpl();
        AbstractDAOImpl abstractDAOImpl = new AbstractDAOImpl();
        userDAOImpl.users.add(new User(5, "john1"));
        userDAOImpl.users.add(new User(4, "john2"));
        userDAOImpl.users.add(new User(3, "john3"));
        userDAOImpl.users.add(new User(2, "john4"));
        userDAOImpl.users.add(new User(1, "john5"));
        userDAOImpl.users.add(new User(6, "john6"));
        userDAOImpl.users.add(new User(7, "john7"));
        userDAOImpl.users.add(new User(8, "john8"));
        userDAOImpl.users.add(new User(9, "john9"));
        abstractDAOImpl.db.addAll(userDAOImpl.users);

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
        System.out.println(userDAOImpl.users.get(0));
        userDAOImpl.save(new User(44,"Mari"));
        System.out.println(abstractDAOImpl.get(4));
        abstractDAOImpl.deleteById(4);
        System.out.println(abstractDAOImpl.get(4));
        System.out.println(abstractDAOImpl.db);
    }
}