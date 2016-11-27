package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.devcolibri.a3_functional_interfaces;

/**
 * Created by Raketa on 26.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\n-- Functional Interface Using --");
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer convertAge = converter.convert("22");
        System.out.println("Age Convert: " + convertAge);
        System.out.println("Type: " + convertAge.getClass().getTypeName());
    }
}
