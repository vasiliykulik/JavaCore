package src.m2basetypes.homework;

/**
 * Created by Raketa on 31.08.2016.
 */
public class DZ_2_1_old {


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
            if (arrayReal[i] > value) {
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
        return value - 1;
    }

    public static double multiplication(double arrayReal[]) {
        double value = 1;
        for (double item : arrayReal) {
            value *= item;
        }
        return value - 1;
    }

    public static int modulus(int arrayInteger[]) {
        return arrayInteger[0] % arrayInteger[arrayInteger.length - 1];
    }

    public static double modulus(double arrayReal[]) {
        return arrayReal[0] % arrayReal[arrayReal.length - 1];
    }

    public static int secondLargest(int arrayInteger[]) {
        int value = 0;
        int j;
        int temp;
        boolean sorted = true;

        while (sorted) {
            sorted = false;
            for (j = 0; j < arrayInteger.length - 1; j++) {
                if (arrayInteger[j] > arrayInteger[j + 1]) {
                    temp = arrayInteger[j];
                    arrayInteger[j] = arrayInteger[j + 1];
                    arrayInteger[j + 1] = temp;
                    sorted = true;

                }
            }
        }
        value = arrayInteger[arrayInteger.length - 1]; // присваиваем максимальное значение - последний элемент массива
        int i = 0;
        for (i = arrayInteger.length - 1; i >= 0; i--) { // почему не работает условие i==0 ?
            if (arrayInteger[i] < value) {
                value = arrayInteger[i];
                break;
            }
        }
        return value;
    }

    public static double secondLargest(double arrayReal[]) {
        double value = 0;
        int j;
        double temp;
        boolean sorted = true;

        while (sorted) {
            sorted = false;
            for (j = 0; j < arrayReal.length - 1; j++) {
                if (arrayReal[j] > arrayReal[j + 1]) {
                    temp = arrayReal[j];
                    arrayReal[j] = arrayReal[j + 1];
                    arrayReal[j + 1] = temp;
                    sorted = true;

                }
            }
        }
        value = arrayReal[arrayReal.length - 1]; // присваиваем максимальное значение - последний элемент массива
        int i = 0;
        for (i = arrayReal.length - 1; i >= 0; i--) { // почему не работает условие i==0 ?
            if (arrayReal[i] < value) {
                value = arrayReal[i];
                break;
            }
        }

        return value;
    }


    public static void main(String[] args) {
        int arrayInteger[] = {30, 45, 56, 67, 78, 78, 90, 1, 12, 28};
        double arrayReal[] = {28.19, 45.8, 90.454, 67.34, 78.09, 89.45, 90.454, 01.34, 12.34, 28.12};
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
