package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.homework;

import java.util.Date;

/**
 * Created by Стрела on 13.09.2016.
 */
public class GoogleAPI implements API {

    private Room[]rooms = new Room[5];

    public GoogleAPI() {
        Room roomf = new Room(6, 150, 2, new Date("02/11/2016 07:30"), "Redisson", "Vegas");
        rooms[0]=roomf;
        Room roomg = new Room(7, 250, 2, new Date("02/11/2016 09:30"), "Redisson", "Vegas");
        rooms[1]=roomg;
        Room roomh = new Room(8, 350, 2, new Date("02/11/2016 10:30"), "Redisson", "Vegas");
        rooms[2]=roomh;
        Room roomj = new Room(9, 450, 2, new Date("02/11/2016 11:30"), "Redisson", "Vegas");
        rooms[3]=roomj;
        Room roomk = new Room(10, 550, 2, new Date("02/11/2016 11:30"), "Redisson", "Vegas");
        rooms[4]=roomk;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int k=0;
        for (int i = 0;i<rooms.length;i++) {
            if(rooms[i].getPrice()<=price && rooms[i].getPersons()>=persons && (rooms[i].getCityName()==city)&& (rooms[i].getHotelName()==hotel))
            {
                k++;
            }
        }
        Room[]roomsout = new Room[k];
        for (int i = 0;i<rooms.length;i++) {
            if(rooms[i].getPrice()<=price && rooms[i].getPersons()>=persons && (rooms[i].getCityName()==city)&& (rooms[i].getHotelName()==hotel))
            {
                roomsout[i]=rooms[i];
            }
        }
        return roomsout;
    }
    @Override
    public Room[] getAll() {
        return new Room[0];
    }

}
