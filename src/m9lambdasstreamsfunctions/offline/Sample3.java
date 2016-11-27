package src.m9lambdasstreamsfunctions.offline;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Стрела on 19.10.2016.
 */
public class Sample3 {

    public static void sample3(){
    List<Integer> list = Arrays.asList(1,2,3,4,5);
    for(Integer i:list){}
        list.forEach(i->{
            System.out.println(i);
            if(i%2==0){
                System.out.println("Even");
            }else{
                System.out.println("123");
            }
        });
    }


}
