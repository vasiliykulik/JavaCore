package src.m2basetypes.selfedu3Strings;

/**
 * Created by Стрела on 21.08.2016.
 */
// Конкатенация — операция объединения строк
    /*Важно понимать, что метод concat не изменяет строку, а лишь создает новую как результат слияния текущей и
     переданной в качестве параметра. Да, метод возвращает новый объект enums,
      поэтому возможны такие длинные «цепочки»*/
public class StringsConcatenation {
    public static void main(String[] args) {


        String javaHub = "habrhabr".concat(".ru").concat("/hub").concat("/java");
        System.out.println(javaHub); // получим "habrhabr.ru/hub/java"
    }

    // перепишем наш метод используя concat
    private static String message(boolean b) {
        return "Your char had".concat(b ? " " : "n't ").concat("been found!");
    }
}
