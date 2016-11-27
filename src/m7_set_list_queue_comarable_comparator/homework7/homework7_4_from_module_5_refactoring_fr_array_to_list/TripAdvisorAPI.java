package src.m7_set_list_queue_comarable_comparator.homework7.homework7_4_from_module_5_refactoring_fr_array_to_list;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Стрела on 13.09.2016.
 */
public class TripAdvisorAPI implements API {

    private List<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        rooms.add(new Room(1, 100, 2, new Date("02/11/2016 07:30"), "Hilton", "Washington"));
        rooms.add(new Room(2, 200, 2, new Date("02/11/2016 09:30"), "Hilton", "Washington"));
        rooms.add(new Room(3, 300, 2, new Date("02/11/2016 10:30"), "Hilton", "Washington"));
        rooms.add(new Room(4, 400, 2, new Date("02/11/2016 11:30"), "Hilton", "Washington"));
        rooms.add(new Room(5, 500, 2, new Date("02/11/2016 11:30"), "Hilton", "Washington"));
    }

    @Override
    public List findRooms(Room searchrequest) {

        List<Room> roomsout = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).equals(searchrequest)) {
                roomsout.add(rooms.get(i));
            }
        }
        return roomsout;
    }

    @Override
    public List getAll() {
        return rooms;
    }

}

