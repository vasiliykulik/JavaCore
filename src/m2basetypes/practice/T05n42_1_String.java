package src.m2basetypes.practice;

/**
 * Created by Стрела on 20.08.2016.
 */
public class T05n42_1_String {
    static long containsCount(long[] array, int n){

        int k = 0;
        for (long item : array) {
            if (item == n) {
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        long[] array ={10, 40, 50, 42, 54, 50, 200, 60};

        int n =50;

        long result = containsCount(array,n);

        if ( result==1){
            System.out.println("yes");
        }
        if ( result==0){
            System.out.println("no");
        }
        if ( result>1){
            System.out.println(containsCount(array,n));
            System.out.println(result);
        }

        // если в массиве есть число n написать yes, если есть число n, через метод - есть ли, количество раз k, если нет то нет


    }
}
