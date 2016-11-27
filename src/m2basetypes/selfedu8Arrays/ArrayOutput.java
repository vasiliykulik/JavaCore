package src.m2basetypes.selfedu8Arrays;

/**
 * Created by Стрела on 22.08.2016.
 */
public class ArrayOutput {
    public static void main(String[] args) {
        int a[] = {5, 6, 7, 8, 9, 1, 4, 3, 2, 0};

        for (int i : a) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : a) {
            System.out.print(a[i]);
        }
        System.out.println();
        for (int i = 0; i<=a.length-1; i++) {
            System.out.print(a[i]);
        }
    }
}
