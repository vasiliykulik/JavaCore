package src.socialnetwork;

import java.util.List;

public interface DAO {
    User save(User user);

    List<User> getAll();
}
