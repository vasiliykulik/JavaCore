package src.m8mapgenerics.homework8_dao_generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Стрела on 11.10.2016.
 */
public class UserDAO<T> extends AbstractDAOImpl<T> {
    // UserDAO that exdents AbstractDAOImpl and has the same methods
    // экстендить для конкретного User
    // иметь такие же методы, в чем нюанс, метод save примает
    // методы будут вызывать методы абстрактной DAO


    List<User> users = new ArrayList<>();


}