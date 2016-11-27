package src.m4polymorphism.selfedu4.interfacestackoverflow;

/**
 * Created by Стрела on 04.09.2016.
 */
// этот интерфейс расширяет базовый
// и предоставляет доступ еще и к коробке передач
public interface CarWithKPP extends Car {
    Kpp getKpp();
}
