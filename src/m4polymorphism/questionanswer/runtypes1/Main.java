package src.m4polymorphism.questionanswer.runtypes1;

/**
 * Created by Стрела on 06.09.2016.
 * Пример на два уровня абстракции
 * Car и Person интерфейсы и один методреализации
 * При этом каждый person может пройти путь тремя методами
 * Если пешком - время
 * Если машина бензин
 * Если самолет - что то еще
 * Женщина по одному моет сделать - мужчина по другому
 *
 * B еще продебажим в каждом методе ставим breakpoint
 * b смотрим что куда заходит
 */
public class Main {
    public static void main(String[] args) {
        Car honda = new Honda();
        // Honda honda = new Honda();
        Car tesla = new Tesla();

        Person woman = new Woman(honda);
        Person man = new Man(tesla);

        Person boy = new Boy(honda);
        Person girl = new Boy(honda);

        woman.runDistance(499);
        woman.runDistance(2);
        woman.runDistance(1000);

        System.out.println();

        boy.runDistance(499);
        boy.runDistance(2);
        boy.runDistance(1000);

       // Person person = Man();
       // person.runDistance(int 500);

    }
}
