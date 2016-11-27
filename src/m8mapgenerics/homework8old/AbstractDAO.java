package src.m8mapgenerics.homework8old;

import java.util.Collection;

/**
 * Created by Стрела on 11.10.2016.
 */
public interface AbstractDAO<T>  {

     void save(T t);
     void delete(T t);
     void deleteAll(Collection<T> t);
     void saveAll(Collection<T> t);
     Collection<T> getList(Collection<T> t);

     void get(long id);
     void deleteById(long id);
}
