package src.m7setlist.homework7.homework7_4_from_module_5_refactoring_fr_array_to_list;

/**
 * Created by Стрела on 13.09.2016.
 */
public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room + " saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("delete false");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room + " update");
        return room;
    }

    @Override
    public Room findById(long id) {
        //Room room = new Room(id, 0, null, null);
        //System.out.println("" + );
        //return
        System.out.println("Searching room by id..." + id);
        return null;
    }


}
