package src.m2basetypes.homework;

import src.m6staticfinal.homework_m6.ArrayUtils;

import java.util.Arrays;

/**
 * Created by Raketa on 25.08.2016.
 */
public class DZ_2_1 {

    public static double sum(double arrayReal[]) {
        double value = 0;
        for (double item : arrayReal) {
            value += item;
        }
        return value;
    }

    public static double min(double arrayReal[]) {
        double value = arrayReal[0];
        for (int i = 1; i < arrayReal.length; i++) {
            if (arrayReal[i] < value) {
                value = arrayReal[i];
            }
        }
        return value;
    }

    public static double max(double arrayReal[]) {
        double value = arrayReal[0];
        for (int i = 1; i < arrayReal.length; i++) {
            if (arrayReal[i] > 0 && arrayReal[i] > value) {
                value = arrayReal[i];
            }
        }
        return value;
    }

    public static double maxPositive(double arrayReal[]) {
        double value = 0;
        for (int i = 0; i < arrayReal.length; i++) {
            if (arrayReal[i] > 0 && arrayReal[i] > value) {
                value = arrayReal[i];
            }
        }
        return value;
    }

    public static double multiplication(double arrayReal[]) {
        double value = 1;
        for (double item : arrayReal) {
            value *= item;
        }
        return value;
    }

    public static double modulus(double arrayReal[]) {
        return arrayReal[0] % arrayReal[arrayReal.length - 1];
    }

    public static double secondLargest(double arrayReal[]) {
        double max = 0;
        double secondLargestpd = 0;

        for (int i = 0; i < arrayReal.length; i++) {

            if (arrayReal[i] > max) {
                secondLargestpd = max;

                max = arrayReal[i];
            }
            if (arrayReal[i] < max && arrayReal[i] > secondLargestpd) {
                secondLargestpd = arrayReal[i];
            }

        }
        return secondLargestpd;
    }


    public static void main(String[] args) {
        int arrayInteger[] = {30, 100, 56, 67, 78, 78, 90, 1, 90, 28};
        double arrayReal[] = {28.19, 100.3, 90.454, 67.34, 78.09, 89.45, 90.454, 01.34, 12.34, 28.12};
        System.out.println("sum");
        System.out.println(ArrayUtils.sum(arrayInteger)); // integer to sum int
        System.out.println(sum(arrayReal)); // double to sum double
        System.out.println("min");
        System.out.println(ArrayUtils.min(arrayInteger));
        System.out.println(min(arrayReal));
        System.out.println("max");
        System.out.println(ArrayUtils.max(arrayInteger));
        System.out.println(max(arrayReal));
        System.out.println("maxPositive");
        System.out.println(ArrayUtils.maxPositive(arrayInteger));
        System.out.println(maxPositive(arrayReal));
        System.out.println("multiplication");
        System.out.println(ArrayUtils.multiplication(arrayInteger));
        System.out.println(multiplication(arrayReal));
        System.out.println("modulus");
        System.out.println(ArrayUtils.modulus(arrayInteger));
        System.out.println(modulus(arrayReal));
        System.out.println("secondLargest");
        System.out.println(ArrayUtils.secondLargest(arrayInteger));
        System.out.println(secondLargest(arrayReal));
        System.out.println();
        System.out.println("reverse");
        System.out.println(Arrays.toString(ArrayUtils.reverse(arrayInteger)));
        System.out.println("findEvenElements");
        System.out.println(Arrays.toString(ArrayUtils.findEvenElements(arrayInteger)));


    }
}
