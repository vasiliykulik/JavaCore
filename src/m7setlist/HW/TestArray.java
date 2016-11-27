package src.m7setlist.HW;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class TestArray {
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<Integer>();
        Random myRandom = new Random();

        for (int i=0; i<10000; i++) {
            myList.add(new Integer(myRandom.nextInt(30000)));
        }

        System.out.println("Filled:   " + myList);
        Collections.sort(myList);
        System.out.println("Sorted:   " + myList);

        Collections.shuffle(myList);
        System.out.println("Shuffled: " + myList);
    }
}