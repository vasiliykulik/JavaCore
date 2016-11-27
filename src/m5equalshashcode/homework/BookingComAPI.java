package src.m5equalshashcode.homework;

import java.util.Date;

/**
 * Created by Стрела on 13.09.2016.
 */
public class BookingComAPI implements API {

    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        Room rooml = new Room(11, 10, 2, new Date("02/11/2016 07:30"), "Номера", "Киев");
        rooms[0] = rooml;
        Room roomm = new Room(12, 20, 2, new Date("02/11/2016 09:30"), "Номера", "Киев");
        rooms[1] = roomm;
        Room roomn = new Room(13, 30, 2, new Date("02/11/2016 10:30"), "Номера", "Киев");
        rooms[2] = roomn;
        Room roomo = new Room(14, 40, 2, new Date("02/11/2016 11:30"), "Номера", "Киев");
        rooms[3] = roomo;
        Room roomp = new Room(15, 50, 2, new Date("02/11/2016 11:30"), "Номера", "Киев");
        rooms[4] = roomp;
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int k = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() <= price && rooms[i].getPersons() >= persons && (rooms[i].getCityName() == city) && (rooms[i].getHotelName() == hotel)) {
                k++;
            }
        }
        Room[] roomsout = new Room[k];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() <= price && rooms[i].getPersons() >= persons && (rooms[i].getCityName() == city) && (rooms[i].getHotelName() == hotel)) {
                roomsout[i] = rooms[i];
            }
        }

        return roomsout;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }

    public Room[] getRooms() {
        return rooms;
    }

}
