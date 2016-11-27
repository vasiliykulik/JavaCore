package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.selfedu4.abstractinterfaceinterfaceinheritancekostin.interfaceauto;

/**
 * Created by Стрела on 05.09.2016.
 * Вместо множественного наследования классов в Java введено множественное наследование интерфейсов, которое часично решает проблемы (но, как будет показано в примере далее, к сожалению, не все).

 Рассмотрим пример, где реализовано два интерфейса с методами доступными для грузового и для легкового транспорта. Класс Pickup (пикап) должен обладать как возможностью перевозки грузов, так и пассажиров, поэтому он реализует сразу оба интерфейса:
 Часто всю открытую часть класса (т. е. общедоступные методы) предопределяю как раз в интерфейсе. Тогда взглянув на один лишь интерфейс можно поять какие же методы должны использоваться для взаимодействия с объектами данного класса. То есть интерфейсы вполне соответствуют принципам инкапсуляцуии. Как, впрочем, и принципу полиморфизма. Ведь в нескольких классах метод некоторого интерфейса может быть реализован по-разному, хотя и с одним и тем же именем.

 */
public interface PassangersAuto {
    void transportPassangers();
}
interface CargoAuto {
    void transportCargo();
}
class Truck implements CargoAuto {
    final static int a = 1;
    public void transportCargo() {
        System.out.println("Везу груз");
    }
}
class Sedan implements PassangersAuto {
    public void transportPassangers() {
        System.out.println("Везу пассажиров");
    }
}
class Pickup implements CargoAuto, PassangersAuto {
    public void transportCargo() {
        System.out.println("Везу груз");
    }
    public void transportPassangers() {
        System.out.println("Везу пассажиров");
    }
}