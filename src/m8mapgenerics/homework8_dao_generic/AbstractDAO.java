package src.m8mapgenerics.homework8_dao_generic;

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

     T get(long id);
     void deleteById(long id);
}
