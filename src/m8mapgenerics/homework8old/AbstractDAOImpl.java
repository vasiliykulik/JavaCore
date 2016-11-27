package src.m8mapgenerics.homework8old;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Стрела on 11.10.2016.
 */
public class AbstractDAOImpl<T> implements AbstractDAO<T> {

    List<T> db = new ArrayList<>();

    @Override
    public void save(T t) {
        db.add(t);
        System.out.println(t + " saved");

    }

    @Override
    public void delete(T t) {
        db.remove(t);
        System.out.println(t + " removed");
    }

    @Override
    public void deleteAll(Collection<T> t) {
        db.removeAll(t);
        System.out.println(t + " removed");
    }

    @Override
    public void saveAll(Collection<T> t) {
        db.addAll(t);
        System.out.println(t + " saved");
    }

    @Override
    public Collection<T> getList(Collection<T> t) {
        return db;
    }

    @Override
    public void get(long id) {

    }

    @Override
    public void deleteById(long id) {

    }
}
