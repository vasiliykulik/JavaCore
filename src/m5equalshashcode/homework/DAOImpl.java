package src.m5equalshashcode.homework;

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

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
