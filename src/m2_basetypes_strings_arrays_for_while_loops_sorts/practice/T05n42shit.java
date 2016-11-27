package src.m2_basetypes_strings_arrays_for_while_loops_sorts.practice;

/**
 * Created by Стрела on 20.08.2016.
 */
public class T05n42shit {

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
        long[] array = {10, 40, 50, 42, 54, 50, 200, 60};

        int n =50;
        if ( containsCount(array,n)==1){
            System.out.println("yes");
        }
        if ( containsCount(array,n)==0){
            System.out.println("no");
        }
        if ( containsCount(array,n)>1){
            System.out.println(containsCount(array,n));
        }

        // если в массиве есть число n написать yes, если есть число n, через метод - есть ли, количество раз k, если нет то нет
        // как по мне три if - это хорошо, минус первый if одно вхождение (а если их 10) - программа будет проверять 10 раз и не разу
        // не выполнит - потеря ресурсов, с return - тоже может быть проблема



    }
}
