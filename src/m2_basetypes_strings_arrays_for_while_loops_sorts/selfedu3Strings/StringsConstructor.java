package src.m2_basetypes_strings_arrays_for_while_loops_sorts.selfedu3Strings;

import java.nio.charset.Charset;

/**
 * Created by Стрела on 21.08.2016.
 */
// 2. С помощью конструкторов:
public class StringsConstructor {
    public static void main(String[] args) {
        String habr = "habrahabr";
        char[] habrAsArrayOfChars = {'h', 'a', 'b', 'r', 'a', 'h', 'a', 'b', 'r'};
        byte[] habrAsArrayOfBytes = {104, 97, 98, 114, 97, 104, 97, 98, 114};

        String first = new String();
        String second = new String(habr);
        String third = new String(habrAsArrayOfChars); // "habrahabr"
        String fourth = new String(habrAsArrayOfChars, 0, 4); // "habr"

        String fifth = new String(habrAsArrayOfBytes, Charset.forName("UTF-16BE")); // кодировка нам явно не подходит "桡扲慨慢�"
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        String sixth = new String(new StringBuffer(habr));
        String seventh = new String(new StringBuilder(habr));
        System.out.println(sixth);
        System.out.println(seventh);
    }
}
