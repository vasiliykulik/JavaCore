package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.questionanswer.runtypes1;

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
