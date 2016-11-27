package src.m4polymorphism.selfedu4.interfacestackoverflow;

/**
 * Created by Стрела on 04.09.2016.
 */
// интерфейс описывает взаимодействие с автомобилем - т.е. его интерфейс
// предоставляет другим обьектам доступ к рулю и педалям
// (по сути этот интерфейс соответсвует автомобилю с коробкой автоматом)
public interface Car {
    Rul getRul();
    Pedal[] getPedali();
}
