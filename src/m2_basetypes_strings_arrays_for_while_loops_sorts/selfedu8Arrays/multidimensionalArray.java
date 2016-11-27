package src.m2_basetypes_strings_arrays_for_while_loops_sorts.selfedu8Arrays;

/**
 * Created by Raketa on 22.08.2016.
 */
public class multidimensionalArray {
    public static void main(String[] args) {
/*
Объявляются массивы так:

int[] d1; //Обычный, одномерный
int[][] d2; //Двумерный
double[][] d3; //Трёхмерный
int[][][][][] d5; //Пятимерный

всё же используются двумерные массивы с равным количеством элементов в каждой строке.
Для обработки двумерных массивов используются два вложенных друг в друга цикла с разными счётчиками.
Пример (заполняем двумерный массив случайными числами от 0 до 9 и выводим его на жкран в виде матрицы):
*/
        int[][] da = new int[6][4];
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                da[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println(); // Переходим на следующую строку
        }
    }
}
