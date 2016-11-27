package src.m2_basetypes_strings_arrays_for_while_loops_sorts.selfedu3Strings;

/**
 * Created by Стрела on 21.08.2016.
 */
public class StringsFormat {
    public static void main(String[] args) {
        String formatString = "We are printing double variable (%f), string ('%s') and integer variable (%d).";
        System.out.println(String.format(formatString, 2.3, "habr", 10));
    }
}
