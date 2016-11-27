package src.m5equalshashcode.homework;

import java.util.Date;

/**
 * Created by Стрела on 13.09.2016.
 */
public class TripAdvisorAPI implements API {

    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        Room rooma = new Room(1, 100, 2, new Date("02/11/2016 07:30"), "Hilton", "Washington");
        rooms[0] = rooma;
        Room roomb = new Room(2, 200, 2, new Date("02/11/2016 09:30"), "Hilton", "Washington");
        rooms[1] = roomb;
        Room roomc = new Room(3, 300, 2, new Date("02/11/2016 10:30"), "Hilton", "Washington");
        rooms[2] = roomc;
        Room roomd = new Room(4, 400, 2, new Date("02/11/2016 11:30"), "Hilton", "Washington");
        rooms[3] = roomd;
        Room roome = new Room(5, 500, 2, new Date("02/11/2016 11:30"), "Hilton", "Washington");
        rooms[4] = roome;
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

}

