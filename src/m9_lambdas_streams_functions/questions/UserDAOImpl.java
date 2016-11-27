package src.m9_lambdas_streams_functions.questions;


public class UserDAOImpl extends AbstractDAOImpl<User> {



    public User saveUser(User user){
        return save(user);
    }
}
