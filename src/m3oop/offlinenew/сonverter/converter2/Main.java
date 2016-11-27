package src.m3oop.offlinenew.сonverter.converter2;

public class Main {
    public static void main(String[] args) {

        Converter converter1 = new Converter(8);
        Converter converter2 = new Converter(16);
        Converter converter3 = new Converter(26.3);


        System.out.println(converter1.convertGRN(100));
        System.out.println(converter2.convertGRN(100));
        System.out.println(converter3.convertGRN(100) + ""); // привести до строки

        final String sum = converter3.convertGRN(100) + "";

        System.out.println(sum.substring(0, 4));
        
    }

}