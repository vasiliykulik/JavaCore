package src.m6staticfinal.offline.static_meth1;

/**
 * Created by Стрела on 19.09.2016.
 */
public class Utils {
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
    split - поверне нам якись строчки - но так не работает

     */
    public static String removeChar2(char letter, String text) {
        String result = "";
        String[]split = text.split("");
        for (String c:split){
            if(!c.equals(""+letter)){
                result+=c;
            }
        }
        return result;
    }

}



/*
    public static  void doSomething (){
        doSomething2();
    }
    private static void doSomething2(){

    }
*/