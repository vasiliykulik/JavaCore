package src.m3oop.offlinenew.сonverter.converter1;

public class Main {
    public static void main(String[] args) {

        Converter converter = new Converter(26.3);


        double usd = converter.convertGRN(100);

        System.out.println(converter.convertGRN(100));
        System.out.println(usd);
    }

}