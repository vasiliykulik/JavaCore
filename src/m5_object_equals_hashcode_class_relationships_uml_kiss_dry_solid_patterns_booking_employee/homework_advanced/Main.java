package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.homework_advanced;

import java.util.Date;

/**
 * Created by Raketa on 13.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        //получаем requestresult в виде массива типа Room
        for (Room room : controller.requestRooms(370, 2, "Vegas", "Redisson")) {
            System.out.println(room);
        }
        for (Room room : controller.requestRooms(30, 2, "Киев", "Номера")) {
            System.out.println(room);
        }
        for (Room room : controller.requestRooms(300, 2, "Washington", "Hilton")) {
            System.out.println(room);
        }

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
        Room testroom = new Room(7, 22, 2, new Date("02/11/2016 07:30"), "Киев", "Номера");
        controller.test(testroom);

    }
}

/*
 API bookingComAPI = new BookingComAPI();
        API googleAPI = new GoogleAPI();
        API tripAdvisorAPI = new TripAdvisorAPI();

        DAO dao = new DAOImpl();

        Room[] roomsbooking = bookingComAPI.findRooms(20, 2, "Киев", "Номера");
        for (Room room : roomsbooking) {
            System.out.println(room.getCityName());
        }
        Room[] roomsgoogle = googleAPI.findRooms(300, 2, "Vegas", "Redisson");
        for (Room room : roomsgoogle) {
            System.out.println(room.getCityName());
        }
        Room[] roomstripAdvisor = tripAdvisorAPI.findRooms(300, 2,"Washington" , "Hilton");
        for (Room room : roomstripAdvisor) {
            System.out.println(room.getCityName());
        }


        dao.findById(roomstripAdvisor[0].getId());
        dao.delete(roomstripAdvisor[0]);
        dao.save(roomstripAdvisor[0]);
        dao.update(roomstripAdvisor[0]);

 */
