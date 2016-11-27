package src.m2basetypes.selfeduoperators;

/**
 * Created by Raketa on 22.08.2016.
 */
public class While_and_do_while {
    public static void main(String[] args) {
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;


        }
        int count1 = 1;
        do {
            System.out.println("Count1 is: " + count1);
            count1++;
        } while (count1 < 11);
    }

}
