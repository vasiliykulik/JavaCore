package src.m7setlist.homework7.homework7_4_from_module_5_refactoring_fr_array_to_list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raketa on 13.09.2016.
 */
public class Controller {
    public List<API> apis;

    public Controller() {
        apis = new ArrayList<>();
        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
    }

    List<Room> requestRooms(Room searchrequest) {
        List<Room> requestresult = new ArrayList<>();
        //создали массив для объектов отобранных для нас API
        for (API api : apis) {
            List<Room> rooms = api.findRooms(searchrequest);
            requestresult.addAll(rooms);
        }
        return requestresult;
    }

    List<Room> check(API api1, API api2) {
        List<Room> result = new ArrayList<>();
        List<Room> api1Rooms = api1.getAll();
        List<Room> api2Rooms = api2.getAll();
        for (Room room1 : api1Rooms) {
            for (Room room2 : api2Rooms) {
                if (room1.equals(room2)) {
                    result.add(room2);
                }
            }
        }
        return result;
    }
}
