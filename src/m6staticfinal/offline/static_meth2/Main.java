package src.m6staticfinal.offline.static_meth2;

/**
 * Created by Стрела on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        final String result =
        Utils.removeChar('e',"Heeello");
        System.out.println(result);
        int number = 12345;
        final String numberReplaced = Utils.removeChar('2', String.valueOf(number));
        System.out.println(numberReplaced);
    }
}
