package src.m2_basetypes_strings_arrays_for_while_loops_sorts.practice;

/**
 * Created by Raketa on 24.08.2016.
 */
public class T05n42_1_StringorTask02 {

static long containsCount(long[]array,int n){
int k=0;
    for (long item:array) {
        if (item==n){
            k++;
        }
    }

    return k;
}

    public static void main(String[] args) {
        long array[] = {23,34,45,56,23,78,89,90};
        int n=34;
        long result = containsCount(array,n);

        if(result==0){
            System.out.println("No");
        }
        if(result==1){
            System.out.println("Yes");
        }

        if(result>1){
            System.out.println("Yes "+result+" times");
        }

    }


}
