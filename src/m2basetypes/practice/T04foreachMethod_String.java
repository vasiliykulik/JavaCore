package src.m2basetypes.practice;

/**
 * Created by Стрела on 20.08.2016.
 */

public class T04foreachMethod_String {


    static String[] getOwnerNames(int[] balances, String[] names) {
        int ownersCount = 0;
        for (int balance : balances) {
            if (balance > 1000) ownersCount++;
        }
        /* считаем сколько элементов соотсветствуют условию*/
        String[] result = new String[ownersCount];
        /* Оператор new всегда создает новый объект и возвращает ссылку на этот объект.
        Создаем массив строк result (объект/instance/экземпляр класса enums) размером ownersCount.
         */

        int index = 0;
        /*Создаем  переменную index для работы с элементами массива result*/
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 1000) {
                result[index] = names[i];
                index++;
            }
        }
        /* Организуем пробежку по двум массивам, если состояние iтого элемента массива балансов
         соответствует условиям, то имя iтого элемента массива имен мы записываем в index элемент
          массива строк result, и счетчиком переходим на следующий index массива result,
          размер массива result мы посчитали заранее.
          */
        for (String abc : result) {
            System.out.println(abc);
        }
        return result;
    }

    public static void main(String[] args) {
        // создадим ownerNames
        int[] balances = {2300, 2345, 456, 346, 453354};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        int[] balances1 = {200, 2345, 6, 346, 45354};

        for (String name : getOwnerNames(balances, ownerNames))
            System.out.println(name + " ");
/*Вывести на экран каждое возвращенное методом getOwnerNames значение,
  которому на вход мы подали два массива (balances,ownerNames)
   */


    }

}

