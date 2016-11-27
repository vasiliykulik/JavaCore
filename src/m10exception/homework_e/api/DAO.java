package src.m10exception.homework_e.api;

/**
 * Created by Raketa on 13.09.2016.
 */
public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    Room[] getAll();
}
