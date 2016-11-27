package src.m11filesio.finalcoretest.dogshow;

/**
 * Created by Стрела on 14.11.2016.
 */
public class DogShow {
    public static void main(String[] args) {
        new DogShow().go();
    }

    void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark();
        //    ((Dog) new Hound()).sniff();
    }}
