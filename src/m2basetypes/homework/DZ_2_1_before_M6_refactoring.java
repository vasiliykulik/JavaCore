package src.m2basetypes.homework;

/**
 * Created by Raketa on 25.08.2016.
 */
public class DZ_2_1_before_M6_refactoring {

    public static int sum(int arrayInteger[]) {
        int value = 0;
        for (int item : arrayInteger) {
            value += item;
        }
        return value;
    }

    public static double sum(double arrayReal[]) {
        double value = 0;
        for (double item : arrayReal) {
            value += item;
        }
        return value;
    }

    public static int min(int arrayInteger[]) {
        int value = arrayInteger[0];
        for (int i = 1; i < arrayInteger.length; i++) {
            if (arrayInteger[i] < value) {
                value = arrayInteger[i];
            }
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

    public static int max(int arrayInteger[]) {
        int value = arrayInteger[0];
        for (int i = 1; i < arrayInteger.length; i++) {
            if (arrayInteger[i] > value) {
                value = arrayInteger[i];
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

    public static int maxPositive(int arrayInteger[]) {
        int value = 0;
        for (int i = 0; i < arrayInteger.length; i++) {
            if (arrayInteger[i] > 0 && arrayInteger[i] > value) {
                value = arrayInteger[i];
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

    public static long multiplication(int arrayInteger[]) {
        long value = 1;
        for (int item : arrayInteger) {
            value *= item;
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

    public static int modulus(int arrayInteger[]) {
        return arrayInteger[0] % arrayInteger[arrayInteger.length - 1];
    }

    public static double modulus(double arrayReal[]) {
        return arrayReal[0] % arrayReal[arrayReal.length - 1];
    }

    public static int secondLargest(int arrayInteger[]) {
        int max = 0;
        int secondLargestp = 0;

        for (int i = 0; i < arrayInteger.length; i++) {

            if (arrayInteger[i] > max) {
                secondLargestp = max;
                max = arrayInteger[i];
            }
            if (arrayInteger[i] < max && arrayInteger[i] > secondLargestp) {
                secondLargestp = arrayInteger[i];
            }
        }
        return secondLargestp;
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
        System.out.println(sum(arrayInteger)); // integer to sum int
        System.out.println(sum(arrayReal)); // double to sum double
        System.out.println("min");
        System.out.println(min(arrayInteger));
        System.out.println(min(arrayReal));
        System.out.println("max");
        System.out.println(max(arrayInteger));
        System.out.println(max(arrayReal));
        System.out.println("maxPositive");
        System.out.println(maxPositive(arrayInteger));
        System.out.println(maxPositive(arrayReal));
        System.out.println("multiplication");
        System.out.println(multiplication(arrayInteger));
        System.out.println(multiplication(arrayReal));
        System.out.println("modulus");
        System.out.println(modulus(arrayInteger));
        System.out.println(modulus(arrayReal));
        System.out.println("secondLargest");
        System.out.println(secondLargest(arrayInteger));
        System.out.println(secondLargest(arrayReal));


    }
}
