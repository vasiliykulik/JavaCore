package src.m9_lambdas_streams_functions.homework_9_java8_refactor_fr_HW_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Raketa on 09.10.2016.
 */
public class Randomizer {
    public static void main(String[] args) {


        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<String> stringslinked = new LinkedList<>();
        List<Integer> integerslinked = new LinkedList<>();

        Random myRandom = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            integers.add(new Integer(myRandom.nextInt(30000)));
        }
        long finish = System.currentTimeMillis();
        System.out.println("integers 100000 add:   " + (finish - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            integers.set(i, new Integer(myRandom.nextInt(30000)));
        }
        finish = System.currentTimeMillis();
        System.out.println("integers 100000 set:   " + (finish - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            integers.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("integers 100000 get:   " + (finish - start));



        start = System.currentTimeMillis();
        for (int i = 100000 ; i== 0 ; i++) {
            integers.remove(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("integers 100000 remove:   " + (finish - start));
////////////////////////////////////////////////////////////////////////////
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            strings.add(new Integer(myRandom.nextInt(30000)).toString());
        }
        finish = System.currentTimeMillis();
        System.out.println("strings 100000 add:   " + (finish - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            strings.set(i, new Integer(myRandom.nextInt(30000)).toString());
        }
        finish = System.currentTimeMillis();
        System.out.println("strings 100000 set:   " + (finish - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            strings.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("strings 100000 get:   " + (finish - start));



        start = System.currentTimeMillis();
        for (int i = 100000 ; i== 0 ; i++) {
            strings.remove(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("strings 100000 remove:   " + (finish - start));

//////////////////////////////////////////////////////////////////////////

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringslinked.add(new Integer(myRandom.nextInt(30000)).toString());
        }
        finish = System.currentTimeMillis();
        System.out.println("stringslinked 100000 add:   " + (finish - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringslinked.set(i, new Integer(myRandom.nextInt(30000)).toString());
        }
        finish = System.currentTimeMillis();
        System.out.println("stringslinked 100000 set:   " + (finish - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringslinked.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("stringslinked 100000 get:   " + (finish - start));



        start = System.currentTimeMillis();
        for (int i = 100000 ; i== 0 ; i++) {
            stringslinked.remove(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("stringslinked 100000 remove:   " + (finish - start));
//////////////////////////////////////////////////////////////////////
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            integerslinked.add(new Integer(myRandom.nextInt(30000)));
        }
        finish = System.currentTimeMillis();
        System.out.println("integerslinked 100000 add:   " + (finish - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            integerslinked.set(i, new Integer(myRandom.nextInt(30000)));
        }
        finish = System.currentTimeMillis();
        System.out.println("integerslinked 100000 set:   " + (finish - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            integerslinked.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("integerslinked 100000 get:   " + (finish - start));



        start = System.currentTimeMillis();
        for (int i = 100000 ; i== 0 ; i++) {
            integerslinked.remove(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("integerslinked 100000 remove:   " + (finish - start));

    }


}
