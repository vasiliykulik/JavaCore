package src.m4polymorphism.questionanswer.runtypes1;

/**
 * Created by Стрела on 06.09.2016.
 * Круто но никто так не делает
 * you can skip implements
 */
public abstract class Person  {
    private Car car;

    public Person(Car car) {
        this.car = car;
    }

    abstract void runDistance(int distance);

    public Car getCar() {
        return car;
    }

}
