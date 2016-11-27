package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.selfedu4.interfaceoracle;

/**
 * Created by Стрела on 04.09.2016.
 * Methods form the object's interface with the outside world;
 * In its most common form, an interface is a group of related methods with empty bodies.
 * A bicycle's behavior, if specified as an interface, might appear as follows:
 */
public interface Bicycle {

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
