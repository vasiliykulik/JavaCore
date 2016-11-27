package src.m7setlist.homework7.homework7_4_from_module_5_refactoring_fr_array_to_list;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Стрела on 13.09.2016.
 */
public class GoogleAPI implements API {

    private List<Room> rooms;

    public GoogleAPI() {
        rooms = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.NOVEMBER, 22, 7, 30);
        rooms.add(new Room(6, 150, 2, calendar.getTime(), "Redisson", "Vegas"));
        calendar.set(2016, Calendar.NOVEMBER, 22, 9, 30);
        rooms.add(new Room(7, 250, 2, calendar.getTime(), "Redisson", "Vegas"));
        calendar.set(2016, Calendar.NOVEMBER, 22, 10, 30);
        rooms.add(new Room(8, 350, 2, calendar.getTime(), "Redisson", "Vegas"));
        calendar.set(2016, Calendar.NOVEMBER, 22, 11, 30);
        rooms.add(new Room(9, 450, 2, calendar.getTime(), "Redisson", "Vegas"));
        calendar.set(2016, Calendar.NOVEMBER, 22, 11, 30);
        rooms.add(new Room(10, 550, 2, calendar.getTime(), "Redisson", "Vegas"));
    }

    @Override
    public List findRooms(Room searchrequest) {

        List<Room> result = new ArrayList<>();
        for (Room room:rooms){
                if (room.equals(searchrequest)){
                    result.add(room);
                }
            }
            return result;
        }


    @Override
    public List getAll() {
        return rooms;
    }

}
