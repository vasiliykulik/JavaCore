package src.m8mapgenerics.hw8_getid;

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
/*В интерфейсе объявляем абстрактные
 методы для обеспечения их имплементации*/
     T get(long id);
     void deleteById(long id);
}
