package src.m11filesio.finalcoretest;

/**
 * Created by Стрела on 14.11.2016.
 */
enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;

    Animals(String s) {     sound = s;  }
}
class TestEnum {
    static Animals a;
    public static void main(String[] args) {
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
    }
}
