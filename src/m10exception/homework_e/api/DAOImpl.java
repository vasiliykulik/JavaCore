package src.m10exception.homework_e.api;


/**
 * Created by Стрела on 13.09.2016.
 */
public class DAOImpl implements DAO {

    Room[] db = new Room[10];

    @Override
    public Room save(Room room) {           // save - adds room to array
        int i;                              // declare i to see it from sout
        for (i = 0; i < db.length; i++)
            if (db[i] == null) {
                break;                      // looking for first empty array element
            }
        db[i] = room;
        System.out.println(db[i] + " saved");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        int i;
        for (i = 0; i < db.length; i++)
            if ((db[i].equals(room))) {
                db[i] = null;
                break;
            }
        System.out.println(room + " deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        //findById(room.getId()); // метод вернул мне комнату - я могу ее принять и заапдейтить, и записать в db тоже могу
        // но только в пустую ячейку через save()
        int i;
        for (i = 0; i < db.length; i++)
            if ((db[i].getId() == room.getId())) {
                db[i] = room;
                break;
            }
        System.out.println(db[i] + " updated");
        return null;
    }

    @Override
    public Room findById(long id) {
        int i;
        for (i = 0; i < db.length; i++)
            if ((db[i].getId() == id)) {
                break;
            }
        System.out.println("Finded room by id..." + id);
        return db[i];
    }

    @Override
    public Room[] getAll() {
        int end = db.length;

        for (int i = 0; i < end; i++)
            if ((db[i] == null)) {
                int shift = i;
                for (int j = i + 1; j < end; shift++, j++) {
                    db[shift] = db[j];
                }
                end--;// уменьшаем рассматриваемый фрагмент массива до рабочей зоны (дубликаты остаются в конце)
                i--;// элементу где был null уже присвоен следующий элемент потому возвращаемся к нему и отправляем на проверку
            }

        Room[] result = new Room[end];
        for (int i = 0; i < end; i++) {
            result[i] = db[i];
        }
        return result;
    }
}
