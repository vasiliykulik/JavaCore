package src.m7setlist.homework7.homework7_4_from_module_5_refactoring_fr_array_to_list;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Стрела on 13.09.2016.
 */
public class BookingComAPI implements API {

    private List<Room> rooms;

    public BookingComAPI() {
        rooms = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.NOVEMBER, 22, 9, 30);
        rooms.add(new Room(11, 10, 2, calendar.getTime(), "Номера", "Киев"));
        calendar.set(2016, Calendar.NOVEMBER, 22, 11, 30);
        rooms.add(new Room(12, 20, 2, calendar.getTime(), "Номера", "Киев"));
        calendar.set(2016, Calendar.NOVEMBER, 22, 11, 00);
        rooms.add(new Room(13, 30, 2, calendar.getTime(), "Номера", "Киев"));
        calendar.set(2016, Calendar.NOVEMBER, 22, 11, 30);
        rooms.add(new Room(14, 40, 2, calendar.getTime(), "Номера", "Киев"));
        calendar.set(2016, Calendar.NOVEMBER, 22, 10, 30);
        rooms.add(new Room(15, 50, 2, calendar.getTime(), "Номера", "Киев"));
    }


    @Override
    public List findRooms(Room searchrequest) {

        List<Room> result = new ArrayList<>();
        for (Room room : rooms) {
            if (room.equals(searchrequest)) {
                result.add(room);
            }
        }
        /*for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).equals(searchrequest)) {
                roomsout.add(rooms.get(i));
            }
            от for перешли к foreach
        }*/
        return result;
    }

    @Override
    public List getAll() {
        return rooms;
    }

}
