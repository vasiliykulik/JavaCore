package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.offline4.moneyconverter1;

/**
 * Created by Стрела on 05.09.2016.
 *
 */
public class Main {
    public static void main(String[] args) {

        Calc calc = new Calc();
        demonstrate(calc,100);

    }
// 2. добавляем метод, вызываю метод у интерфейса - Полиморфизм
    private void demonstrate(MoneyConverter moneyConverter, int moneyCount) {
        System.out.println(moneyConverter.convertFromUSD(moneyCount));
    }
/*


    BAD - потом придется дописывать методы (программист должен думать наперед)
    мы как входящий параметр используем конкретную реализацию, и что
    НАДО ПЕРЕДАВАТЬ интерфейс, а не объект
    Пользуйтесь Debug
    speed converter пропускаем
 */
    private static void demonstrate(Calc calc, int moneyCount) {
        System.out.println(calc.convertFromUSD(moneyCount));
    }
}
