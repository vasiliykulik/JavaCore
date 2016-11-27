package src.m9lambdasstreamsfunctions.questions;


public class UserDAOImpl extends AbstractDAOImpl<User> {



    public User saveUser(User user){
        return save(user);
    }
}
