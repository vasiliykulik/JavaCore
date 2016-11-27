package src.m7setlist.homework7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Raketa on 09.10.2016.
 */
public class Randomizer {
    private static final int COUNT = 1000;
    public static void main(String[] args) {


        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<String> stringslinked = new LinkedList<>();
        List<Integer> integerslinked = new LinkedList<>();

        Random myRandom = new Random();

        long start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            integers.add(new Integer(myRandom.nextInt(30000)));
        }
        long finish = System.nanoTime();
        System.out.println("integers"+COUNT+"add:   " + (finish - start));


        start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            integers.set(i, new Integer(myRandom.nextInt(30000)));
        }
        finish = System.nanoTime();
        System.out.println("integers"+COUNT+"set:   " + (finish - start));


        start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            integers.get(i);
        }
        finish = System.nanoTime();
        System.out.println("integers"+COUNT+"get:   " + (finish - start));



        start = System.nanoTime();
        for (int i =COUNT; i== 0 ; i++) {
            integers.remove(i);
        }
        finish = System.nanoTime();
        System.out.println("integers"+COUNT+"remove:   " + (finish - start));
////////////////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            strings.add(new Integer(myRandom.nextInt(30000)).toString());
        }
        finish = System.nanoTime();
        System.out.println("strings"+COUNT+"add:   " + (finish - start));


        start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            strings.set(i, new Integer(myRandom.nextInt(30000)).toString());
        }
        finish = System.nanoTime();
        System.out.println("strings"+COUNT+"set:   " + (finish - start));


        start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            strings.get(i);
        }
        finish = System.nanoTime();
        System.out.println("strings"+COUNT+"get:   " + (finish - start));



        start = System.nanoTime();
        for (int i =COUNT; i== 0 ; i++) {
            strings.remove(i);
        }
        finish = System.nanoTime();
        System.out.println("strings"+COUNT+"remove:   " + (finish - start));

//////////////////////////////////////////////////////////////////////////

        start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            stringslinked.add(new Integer(myRandom.nextInt(30000)).toString());
        }
        finish = System.nanoTime();
        System.out.println("stringslinked"+COUNT+"add:   " + (finish - start));


        start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            stringslinked.set(i, new Integer(myRandom.nextInt(30000)).toString());
        }
        finish = System.nanoTime();
        System.out.println("stringslinked"+COUNT+"set:   " + (finish - start));


        start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            stringslinked.get(i);
        }
        finish = System.nanoTime();
        System.out.println("stringslinked"+COUNT+"get:   " + (finish - start));



        start = System.nanoTime();
        for (int i =COUNT; i== 0 ; i++) {
            stringslinked.remove(i);
        }
        finish = System.nanoTime();
        System.out.println("stringslinked"+COUNT+"remove:   " + (finish - start));
//////////////////////////////////////////////////////////////////////
        start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            integerslinked.add(new Integer(myRandom.nextInt(30000)));
        }
        finish = System.nanoTime();
        System.out.println("integerslinked"+COUNT+"add:   " + (finish - start));


        start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            integerslinked.set(i, new Integer(myRandom.nextInt(30000)));
        }
        finish = System.nanoTime();
        System.out.println("integerslinked"+COUNT+"set:   " + (finish - start));


        start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            integerslinked.get(i);
        }
        finish = System.nanoTime();
        System.out.println("integerslinked"+COUNT+"get:   " + (finish - start));



        start = System.nanoTime();
        for (int i =COUNT; i== 0 ; i++) {
            integerslinked.remove(i);
        }
        finish = System.nanoTime();
        System.out.println("integerslinked"+COUNT+"remove:   " + (finish - start));

    }


}
