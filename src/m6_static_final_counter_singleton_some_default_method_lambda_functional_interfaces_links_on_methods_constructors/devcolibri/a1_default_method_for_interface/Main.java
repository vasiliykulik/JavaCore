package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.devcolibri.a1_default_method_for_interface;

/**
 * Created by Стрела on 26.09.2016.
 * http://devcolibri.com/4137
 * http://devcolibri.com/4274
 */
public class Main {

    private static PeopleBirthday peopleBirthday = new PeopleBirthdayImpl();

    public static void main(String[] args) {
        System.out.println("-- Default Method Interface --");
        System.out.println(peopleBirthday.getFullName("Alexander", "Barchuk"));
        System.out.println(peopleBirthday.getAge(1992));
    }

}
