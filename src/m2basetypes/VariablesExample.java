package src.m2basetypes;

/**
 * Created by Raketa on 19.08.2016.
 */
public class VariablesExample {

    public static void main(String[] args) {
       // int a = 3, b  = 10;
        //a=a+10;
        //a+=1;
        //a--;
/*
        int balance =120;

        if(balance > 120) {
            System.out.println("finish");
        }
*/
        /*
        boolean isActive
        for(int k=5; k<10; k++){
// цикл будет выполняться 5 раз
            System.out.println("value" + k);

        }

        */
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

        int n = 20;
        while (n > 10) {
            System.out.println(n);
            n -= 3;
        }
    }
}
