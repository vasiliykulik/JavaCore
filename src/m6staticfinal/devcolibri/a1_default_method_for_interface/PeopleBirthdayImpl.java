package src.m6staticfinal.devcolibri.a1_default_method_for_interface;

/**
 * Created by Стрела on 26.09.2016.
 */
public class PeopleBirthdayImpl implements PeopleBirthday {
    @Override
    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
