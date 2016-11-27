package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.homework;

/**
 * Created by Raketa on 13.09.2016.
 */
public class Controller {
    public API[] apis = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;
        GoogleAPI googleAPI = new GoogleAPI();
        apis[1] = googleAPI;
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apis[2] = tripAdvisorAPI;
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        DAOImpl dao = new DAOImpl();
        int roomscount = 0;
        for (int i = 0; i < apis.length; i++) {             // посчитать количество комнат в каждом объекте API - так как в него мы записали результат метода findrooms
            roomscount += apis[i].findRooms(price, persons, city, hotel).length;
        }
        Room[] requestresult = new Room[roomscount];        //создали массив для объектов отобранных для нас API
        // и теперь в requestresult заносим отобранные объекты room
        int j = 0;                                          //для каждой ячейки результирующего массива
        for (API api : apis) {                              // для каждого api в apis
            for (Room room : api.findRooms(price, persons, city, hotel)) {          // для каждого room в api
                requestresult[j] = room;                                            // заносим каждый  room в requestresult
                dao.save(room);
                j++;                                                                // готовим следующий элемент массива
            }
        }
        return requestresult;
    }

    /*
    передаю методу два api с параметрами - это массивы элементов типа Room  - и надо проверить сколько одинаковых комнат возвращают два разных api(how many the same rooms)
    "Ключевая задача проверить на совпадения два массива"
    каждую из комнат api1 сравнить из каждой комнат api2
     */

    Room[] check(API api1, API api2) {
        int price = 100;
        int persons = 2;
        String city = "Kiev";
        String hotel = "Holiday";

        int count = 0;
        for(Room room1:api1.findRooms(price,persons,city,hotel)){
            for(Room room2: api2.findRooms(price,persons,city,hotel)){
                if (room1.equals(room2)){
                    count++;                // количество совпадений
                }
            }
        }
        Room[] out = new Room[count];
        if(count>0){
            int j=0;
            for(Room room1:api1.findRooms(price,persons,city,hotel)){
                for(Room room2: api2.findRooms(price,persons,city,hotel)){
                    if (room1.equals(room2)){
                        out[j] = room2;                                                 // каждое совпадение заносим в наш массив
                        j++;
                    }
                }
            }

        }
        return out;
    }
}




/*
    Room[] check(API api1, API api2) {
        // api1.findRooms(0, 0, null, null); option 1

        /*int price = 100;
        int persons = 2;
        String city = "Kiev";
        String hotel = "Holiday";

        Room[] res1 = api1.findRooms(price, persons, city, hotel);
        Room[] res2 = api2.findRooms(price, persons, city, hotel);

//api1.getAll();
//api2.getAll();


//logic (!!!) KEY moment

return null;
        }
 */
