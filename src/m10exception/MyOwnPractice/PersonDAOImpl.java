package src.m10exception.MyOwnPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Стрела on 24.10.2016.
 */
public class PersonDAOImpl implements PersonDao {
    List<Person> persons = new ArrayList<>();

    @Override
    public Person save(Person person) {
        persons.add(person);
        return person;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person person : persons) {
            if (person.getEmail().equals(email)) {
                return person;
            }
        }
        return null;
    }
}
