package src.m7setlist.homework7.homework7_4_from_module_5_refactoring_fr_array_to_list;

/**
 * Created by Raketa on 13.09.2016.
 */
public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);


}
