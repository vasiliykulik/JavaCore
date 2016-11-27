package src.m2basetypes.selfedu3Strings;

// Длина
public class StringsLength {
    public static void main(String[] args) {
        String habr = "habrahabr";
        int length = habr.length();  // получить длину строки
        char searchChar = 'h';  // теперь можно узнать есть ли символ символ 'h' в "habrahabr"
        boolean isFound = false;
        for (int i = 0; i < length; ++i) {
            if (habr.charAt(i) == searchChar) {
                isFound = true;
                break; // первое вхождение
            }
        }
        System.out.println(length);
        System.out.println(message(isFound)); // Your char had been found!
        // ой, забыл, есть же метод indexOf
        System.out.println(message(habr.indexOf(searchChar) != -1)); // Your char had been found!
    }

    private static String message(boolean b) {
        return "Your char had" + (b ? " " : "n't ") + "been found!";
    }

}
