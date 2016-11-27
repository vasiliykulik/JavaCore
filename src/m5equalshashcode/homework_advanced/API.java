package src.m5equalshashcode.homework_advanced;

/**
 * Created by Raketa on 13.09.2016.
 */
public interface API {
    Room[] findRooms(int price, int persons, String сity, String hotel);

    Room[] getAll();
}
