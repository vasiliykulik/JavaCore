package src.m6staticfinal.devcolibri.a4_links_on_methods_and_constructors;

/**
 * Created by Raketa on 26.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\n-- Constructor References --");
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Alexander", "Barchuk");
        System.out.println(person);
    }
}
