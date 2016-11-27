package src.m6staticfinal.devcolibri.a4_links_on_methods_and_constructors;

/**
 * Created by Raketa on 26.09.2016.
 */
public class Person {

    String firstName;
    String lastName;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{firstName: "+ firstName + ", lastName: " + lastName + "}";
    }

}