package src.m7_set_list_queue_comarable_comparator.homework7.homework7_4_from_module_5_refactoring_fr_array_to_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * Created by Raketa on 13.09.2016.
 */
public class Controller {
    public List<API> apis = new ArrayList<>();

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis.add(bookingComAPI);
        GoogleAPI googleAPI = new GoogleAPI();
        apis.add(googleAPI);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apis.add(tripAdvisorAPI);
    }

    List<Room> requestRooms(Room searchrequest) {
        DAOImpl dao = new DAOImpl();
        List<Room> requestresult = new ArrayList<>();
        //создали массив для объектов отобранных для нас API
        for (API api : apis) {                              // для каждого api в apis
            for (Room room : api.findRooms(searchrequest)) {          // для каждого room в api
                requestresult.add(room);                                            // заносим каждый  room в requestresult
                dao.save(room);
            }
        }
        return requestresult;
    }

    List<Room> check(API api1, API api2) {
        Room searchrequest = new Room(0, 100, 2, new Date(), "Holiday", "Kiev");

        List<Room> out = new ArrayList<>();

        for (Room room1 : api1.findRooms(searchrequest)) {
            for (Room room2 : api2.findRooms(searchrequest)) {
                if (room1.equals(room2)) {
                    out.add(room2);                                                 // каждое совпадение заносим в наш массив
                }
            }
        }
        return out;
    }
}
