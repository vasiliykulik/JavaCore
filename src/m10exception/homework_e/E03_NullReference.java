package src.m10exception.homework_e;

       /* * Define an object referenceand initialize it
        * to null. Try to call a method through this
        * reference. Now wrap the code in a try-catch
        * clause to catch the exception.*/

public class E03_NullReference {
    public static void main(String[] args) {
        String s = null; // Causes a NullPointerException: ! s.toString();
        try{
            s.toString();
        }catch(Exception e){
            System.out.println("Caught exception "+ e);
        }
    }
}// When we catch the exception, the program runs to completion.
