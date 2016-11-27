package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.devcolibri.a4_links_on_methods_and_constructors;

/**
 * Created by Raketa on 26.09.2016.
 */
@FunctionalInterface
public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
