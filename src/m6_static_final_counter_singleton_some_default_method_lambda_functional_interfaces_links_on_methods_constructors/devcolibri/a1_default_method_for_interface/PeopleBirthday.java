package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.devcolibri.a1_default_method_for_interface;

/**
 * Created by Стрела on 26.09.2016.
 */
public interface PeopleBirthday {

    String getFullName(String firstName, String lastName);

    default int getAge(int yearBirthday){
        return 2014 - yearBirthday;
    }

}