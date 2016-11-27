package src.tutor.module9.questions;



public class UserDAOImpl extends AbstractDAOImpl<User> {



    public User saveUser(User user){
        return save(user);
    }
}
