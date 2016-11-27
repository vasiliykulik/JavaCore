package src.m8mapgenerics.homework8_dao_generic;

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


    /*
    как в Generic методе взять id объекта User, метод getId из класса (объекта ) User не вызывается.
     С Comparable и Comparator - также ошибки типов. Даже если мы equals переопределяем только к id,
     а в самом методе создаем объект с этого Id и сравниваем equals -
     тоже не получается результат (потому что equals из User не юзается)
     */
    @Override
    public T get(long id) {
        User searhUser = new User(id, "SearchUserById");
        for (T user : db) {
            if (user.equals(searhUser)) {
                return user;
            }
        }
        return null;
        //через метод get класса user не берется id у объектов -
        //переопределить equals только к ID? создавать объект - здесь в методе и сравнивать ?

    }

    @Override
    public void deleteById(long id) {

        //через метод get класса user не берется id у объектов -
        //переопределить equals только к ID? создавать объект - здесь в методе и сравнивать ?
    }


}