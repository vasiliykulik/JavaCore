package src.m6staticfinal.devcolibri.a3_functional_interfaces;

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
