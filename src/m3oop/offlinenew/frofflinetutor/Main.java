package src.m3oop.offlinenew.frofflinetutor;

import src.m3oop.offlinenew.frofflinetutor.task1.Converter;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {


        Converter converter1 = new Converter(8);
        Converter converter2 = new Converter(16);
        Converter converter3 = new Converter(26.3);

        System.out.println(converter1.convertGRNtoUSD(100));
        System.out.println(converter2.convertGRNtoUSD(100));

        String sum = converter3.convertGRNtoUSD(100) + "";
        System.out.println(sum.substring(0, 4));

        NumberFormat formatter = new DecimalFormat("0.00");

        System.out.println(formatter.format(converter3.convertGRNtoUSD(1000)));

        System.out.println(String.format("%1$,.2f", converter3.convertGRNtoUSD(1000))); //
        System.out.printf("%1$,.2f", converter3.convertGRNtoUSD(1000)); //ета строчка полностью еквивалентна предыдущей

    }
}
