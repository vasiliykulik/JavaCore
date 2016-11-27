package src.m8mapgenerics.homework8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Стрела on 11.10.2016.
 */
public class AbstractDAOImpl<T> implements AbstractDAO<T>{
    List<T> db = new ArrayList<>();

    @Override
    public T save(T t) {
        db.add(t);
        return null;
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void deleteAll(Collection<T> t) {

    }

    @Override
    public void saveAll(Collection<T> t) {

    }

    @Override
    public List<T> getList() {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public T get(long id) {
        return null;
    }
}
