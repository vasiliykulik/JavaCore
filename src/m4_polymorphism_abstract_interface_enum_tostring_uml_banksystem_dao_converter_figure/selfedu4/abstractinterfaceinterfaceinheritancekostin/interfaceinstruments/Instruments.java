package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.selfedu4.abstractinterfaceinterfaceinheritancekostin.interfaceinstruments;

/**
 * Created by Стрела on 05.09.2016.
 * Поскольку все свойства интерфейса должны быть константными и статическими, а все методы общедоступными, то соответсвующие модификаторы перед свойствами и методами разрешается не указывать. То есть интерфейс можно было описать так:

 interface Instruments {
 static public String key = "До мажор";
 void play();
 }
 Но когда метод play() будет описываться в реализующем интерфейс классе, перед ним всё равно необходимо будет явно указать модификатор public.
 */
public interface Instruments {
    final static String key = "До мажор";
    public void play();
}
class Drum implements Instruments {
    public void play() {
        System.out.println("бум бац бац бум бац бац");
    }
}
class Guitar implements Instruments {
    public void play() {
        System.out.println("до ми соль до ре до");
    }
}
