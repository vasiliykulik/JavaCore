package src.m6staticfinal.offline.static_meth2;

/**
 * Created by Стрела on 19.09.2016.
 */
public abstract class Utils {
    public static String removeChar(char letter, String text) {
        String result = new String();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != letter){     // если != заменить на == то выведет все одинаковые буквы
                result = result+text.charAt(i);
            }
        }
return result;
    }
    /*
    можем задебажить а потом

     */
    public static String removeChar2(char letter, String text) {
        return text.replaceAll(letter + "", ""); // конкатенация до строки
    }

}



/*
    public static  void doSomething (){
        doSomething2();
    }
    private static void doSomething2(){

    }
*/