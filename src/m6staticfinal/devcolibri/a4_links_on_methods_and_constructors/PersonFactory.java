package src.m6staticfinal.devcolibri.a4_links_on_methods_and_constructors;

/**
 * Created by Raketa on 26.09.2016.
 */
@FunctionalInterface
public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
