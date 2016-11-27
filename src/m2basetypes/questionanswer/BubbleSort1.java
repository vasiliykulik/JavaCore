package src.m2basetypes.questionanswer;

import java.util.Arrays;

/**
 * Created by Raketa on 24.08.2016.
 */
public class BubbleSort1 {

    private static void SortMethod(int[] num) {

        int j;
        int temp;
        boolean sorted = true;

        while(sorted){
            sorted=false;
            for(j=0;j<num.length-1;j++){
                if (num[j]>num[j+1]){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    sorted = true;
                }
            }
        }

        System.out.println(Arrays.toString(num));
    }


    public static void main(String[] args) {
    int[] num={5,65,345,876};
            SortMethod(num);
    }


}
