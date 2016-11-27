package src.m2basetypes.selfedu8Arrays;

public class BubbleSortMy2 {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        for (int i : a) {
            System.out.print(i);
        }
        for (int i = a.length - 1; i >= 2; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
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
