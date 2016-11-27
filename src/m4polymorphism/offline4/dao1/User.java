package src.m4polymorphism.offline4.dao1;

/**
 * Created by Стрела on 05.09.2016.
 */
public class User {
    long id;
    String name;

    public User(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
