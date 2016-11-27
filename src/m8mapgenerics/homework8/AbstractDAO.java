package src.m8mapgenerics.homework8;

import java.util.Collection;
import java.util.List;

/**
 * Created by Стрела on 11.10.2016.
 */
public interface AbstractDAO<T> {

     T save(T t);
     void delete(T t);
     void deleteAll(Collection<T> t);
     void saveAll(Collection<T> t);
     List<T> getList();
     void deleteById(long id);
     T get(long id);
}
