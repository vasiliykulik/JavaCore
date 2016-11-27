package src.m7setlist.homework7.homework7_4_from_module_5_refactoring_fr_array_to_list;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Стрела on 13.09.2016.
 */
public class TripAdvisorAPI implements API {

    private List<Room> rooms;

    public TripAdvisorAPI() {
        rooms = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();

        calendar.set(2016, Calendar.NOVEMBER, 22, 7, 30);
        rooms.add(new Room(1, 100, 2, calendar.getTime(), "Hilton", "Washington"));
        calendar.set(2016, Calendar.NOVEMBER, 22, 9, 30);
        rooms.add(new Room(2, 200, 2, calendar.getTime(), "Hilton", "Washington"));
        calendar.set(2016, Calendar.NOVEMBER, 22, 10, 30);
        rooms.add(new Room(3, 300, 2, calendar.getTime(), "Hilton", "Washington"));
        calendar.set(2016, Calendar.NOVEMBER, 22, 11, 30);
        rooms.add(new Room(4, 400, 2, calendar.getTime(), "Hilton", "Washington"));
        calendar.set(2016, Calendar.NOVEMBER, 22, 11, 30);
        rooms.add(new Room(5, 500, 2, calendar.getTime(), "Hilton", "Washington"));
    }

    @Override
    public List findRooms(Room searchrequest) {

        List<Room> result = new ArrayList<>();
        for (Room room:rooms) {
            if (room.equals(searchrequest)) {
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

