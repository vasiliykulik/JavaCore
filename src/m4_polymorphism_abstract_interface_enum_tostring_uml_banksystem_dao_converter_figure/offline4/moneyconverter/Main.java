package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.offline4.moneyconverter;

/**
 * Created by Стрела on 05.09.2016.
 *
 */
public class Main {
    public static void main(String[] args) {
        MoneyConverter moneyConverter = new Calc();
        System.out.println(moneyConverter.convertFromUSD(100));
    }
// 2. добавляем метод, вызываю метод у интерфейса - Полиморфизм
    private void demonstrate(MoneyConverter moneyConverter, int moneyCount) {
        System.out.println(moneyConverter.convertFromUSD(moneyCount));


    }
}
