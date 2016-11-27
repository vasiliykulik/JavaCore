package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.homework_m6;

/**
 * Created by Raketa on 18.09.2016.
 */
public final class ArrayUtils {

    public static final int sum(int arrayInteger[]) {
        int value = 0;
        for (int item : arrayInteger) {
            value += item;
        }
        return value;
    }

    public static final int min(int arrayInteger[]) {
        int value = arrayInteger[0];
        for (int i = 1; i < arrayInteger.length; i++) {
            if (arrayInteger[i] < value) {
                value = arrayInteger[i];
            }
        }
        return value;
    }

    public static final int max(int arrayInteger[]) {
        int value = arrayInteger[0];
        for (int i = 1; i < arrayInteger.length; i++) {
            if (arrayInteger[i] > value) {
                value = arrayInteger[i];
            }
        }
        return value;
    }

    public static final int maxPositive(int arrayInteger[]) {
        int value = 0;
        for (int i = 0; i < arrayInteger.length; i++) {
            if (arrayInteger[i] > 0 && arrayInteger[i] > value) {
                value = arrayInteger[i];
            }
        }
        return value;
    }

    public static final long multiplication(int arrayInteger[]) {
        long value = 1;
        for (int item : arrayInteger) {
            value *= item;
        }
        return value;
    }

    public static final int modulus(int arrayInteger[]) {
        return arrayInteger[0] % arrayInteger[arrayInteger.length - 1];
    }

    public static final int secondLargest(int arrayInteger[]) {
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

    public static final int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length]; //создали новый массив такой же длинны
        for (int i = array.length - 1; i >= 0; i--) {   // first element of input array write to last element of reverseArray
            reverseArray[i] = array[array.length - i - 1];
        }
        return reverseArray;
    }

    public static final int[] findEvenElements(int[] array) {
        int count = 0;
        for (int number : array)
            if (number % 2 == 0 || number == 0) {
                count++;
            }
        int[] evenArray = new int[count];
        int i = 0;
        for (int number : array)
            if (number % 2 == 0 || number == 0) {
                evenArray[i] = number;
                i++;
            }
        return evenArray;
    }


}
