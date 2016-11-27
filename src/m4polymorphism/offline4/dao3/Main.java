package src.m4polymorphism.offline4.dao3;

/**
 * Created by Стрела on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        AbstractDAO dao = new TaskDAOImpl();
        dao.find(123);          // b можем дергать уже методы
    }

}
