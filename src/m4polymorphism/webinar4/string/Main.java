package src.m4polymorphism.webinar4.string;

/**
 * Created by Стрела on 02.09.2016.
 * Заглядываем JDK - через Ctrl - в реализацию String
 * Вы должны понимать что вы можете заглядывать в классы - здесь как инструкция
 * достаточно круто все написано
 *Gromcode - манипулирует стрингами
 * Хедеры тоже стрингами
 * Начнем с конструкторов
 * конструкторы - очень много - есть сложные
 * Методы ValueOf - boolean - и тд - для любого типа
 * любой тип привести к стрингу
 * subString - тоже часто используется
 *Довольно можно штука - любые тексты - зеркально делать
 * Около 50 методов
 * Не все так просто работает - есть более низкоуровневые вещи
 * По дебажим String - так можно, в дебаге F8 - программа в замедленном действии
 * также два брейпойнта. Люди - которые шарят - дебажат библиотеки - и знают как работает flow
 */
public class Main {
    public static void main(String[] args) {
        String name = "Jack";
        String name1 = new String ("Ann");
        char[] chars = {'a','b','c'};
        String ch = new String(chars);

        String test = "Hello there guys";


        name.length();
        System.out.println(name.charAt(2));
        System.out.println(test.substring(0,6));
        System.out.println(test.substring(6));
        System.out.println(test.contains("llo"));
        System.out.println(test.toLowerCase());


    }
}
