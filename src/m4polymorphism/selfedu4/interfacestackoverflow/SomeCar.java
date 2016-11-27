package src.m4polymorphism.selfedu4.interfacestackoverflow;

/**
 * Created by Стрела on 04.09.2016.
 */
// а здесь у нас сам автомобиль
// реализации методов опущены т.к. не существенно
public class SomeCar implements CarWithKPP {
    public static void main(String[] args) {
        // создаем новый обьект
        SomeCar instance = new SomeCar();
        // делаем какие-то действия над обьектом
        testAction1(instance);
        testAction2(instance);

    }
/*


    Как видите используем мы их одинаково, но суть кроется в реализации методов:
*/
    void testAction1(CarWithKPP c) {
        c.getRul(); // можно
        c.getPedali(); // можно
        c.getKpp(); // можно
    }

    void testAction2(Car c) {
        c.getRul(); // можно
        c.getPedali(); // можно
    //    c.getKpp(); // нельзя, ошибка компиляции. этот метод не определен в интерфейсе Car
    }

// Заглушки
    private static void testAction2(SomeCar instance) {

    }

    private static void testAction1(SomeCar instance) {

    }

    @Override
    public Rul getRul() {
        return null;
    }

    @Override
    public Pedal[] getPedali() {
        return new Pedal[0];
    }

    @Override
    public Kpp getKpp() {
        return null;
    }
}
