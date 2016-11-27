package src.m2_basetypes_strings_arrays_for_while_loops_sorts.selfedu8Arrays;

public class BubbleSortMy1 {
    public static void main(String[] args) {
        int a[] = {5, 6, 7, 8, 9, 1, 4, 3, 2, 0};
        for (int i : a) {
            System.out.print(i);
        }
        for (int i = a.length - 1; i >= 2; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        System.out.println();
        for (int i : a) {
            System.out.print(i);
        }
    }
}
