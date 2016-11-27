package src.m3oop.offlinenew.frofflinetutor.task1;

/**
 * Created by zetokz on 31.08.16.
 */
public class Converter {

    private final double rate;

    public Converter(double rate) {
        this.rate = rate;
    }

    public double convertGRNtoUSD(double grn) {
        return grn / rate;
    }

}
