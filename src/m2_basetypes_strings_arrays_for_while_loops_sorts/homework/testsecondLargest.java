package src.m2_basetypes_strings_arrays_for_while_loops_sorts.homework;

/**
 * Created by Raketa on 25.08.2016.
 */
public class testsecondLargest {
    public static void main(String[] args) {
        int arrayinteger[]={30,45,56,67,78,78,90,1,12,28};
        int value=0;
        int j;
        int temp;
        boolean sorted = true;

        while(sorted){
            sorted=false;
            for(j=0;j<arrayinteger.length-1;j++){
                if (arrayinteger[j]>arrayinteger[j+1]){
                    temp=arrayinteger[j];
                    arrayinteger[j]=arrayinteger[j+1];
                    arrayinteger[j+1]=temp;
                    sorted = true;

                }
            }

        }
        value=arrayinteger[arrayinteger.length-1];// присваиваем максимальное значение - последний элемент массива
        System.out.println(value);
        int i=0;
        i=arrayinteger.length-1;
        System.out.println(i);
        for (i=arrayinteger.length-1; i >=0; i--){
            System.out.println(i);
            if (arrayinteger[i]<value){
                value = arrayinteger[i];
                break;
            }
        }
        System.out.println(value);
    }
}
