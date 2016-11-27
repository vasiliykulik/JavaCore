package src.m7setlist.homework7.homework7_4_from_module_5_refactoring_fr_array_to_list;

import java.util.Calendar;

/**
 * Created by Raketa on 13.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        //получаем requestresult в виде массива типа Room

        Room searchrequest = new Room(0, 370, 2, Calendar.getInstance().getTime(), "Redisson", "Vegas");
        Room searchrequest0 = new Room(0, 30, 2, Calendar.getInstance().getTime(), "Номера", "Киев");
        Room searchrequest1 = new Room(0, 300, 2, Calendar.getInstance().getTime(), "Hilton", "Washington");


        System.out.println(controller.requestRooms(searchrequest));
        System.out.println(controller.requestRooms(searchrequest0));
        System.out.println(controller.requestRooms(searchrequest1));


        API bookingComAPI = new BookingComAPI();
        API googleAPI = new GoogleAPI();
        API tripAdvisorAPI = new TripAdvisorAPI();

        for (Room room : controller.check(bookingComAPI, tripAdvisorAPI)) {
            System.out.println(room);
        }
        for (Room room : controller.check(googleAPI, tripAdvisorAPI)) {
            System.out.println(room);
        }
        for (Room room : controller.check(bookingComAPI, googleAPI)) {
            System.out.println(room);

        }
    }
}

