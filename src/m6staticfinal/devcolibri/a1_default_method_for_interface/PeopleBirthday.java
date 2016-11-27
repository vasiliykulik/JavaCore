package src.m6staticfinal.devcolibri.a1_default_method_for_interface;

/**
 * Created by Стрела on 26.09.2016.
 */
public interface PeopleBirthday {

    String getFullName(String firstName, String lastName);

    default int getAge(int yearBirthday){
        return 2014 - yearBirthday;
    }

}