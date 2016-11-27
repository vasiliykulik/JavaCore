package src.m7setlist.homework7.homework7_4_from_module_5_refactoring_fr_array_to_list;

import java.util.List;

/**
 * Created by Raketa on 13.09.2016.
 */
public interface API {
    List<Room> findRooms(Room searchrequest);

    List<Room> getAll();
}
