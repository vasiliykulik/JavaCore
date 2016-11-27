package src.m11filesio.finalcoretest.dogshow;

/**
 * Created by Стрела on 14.11.2016.
 */
class Dog {
    public void bark() {
        System.out.print("woof ");
    }
}

class Hound extends Dog {
    public void sniff() {
        System.out.print("sniff ");
    }

    public void bark() {
        System.out.print("howl ");
    }
}

