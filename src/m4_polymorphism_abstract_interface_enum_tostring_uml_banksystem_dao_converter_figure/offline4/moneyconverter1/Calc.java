package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.offline4.moneyconverter1;

/**
 * Created by Стрела on 05.09.2016.
 * Если кто впереди бежит - пишите в slack
 * 1ая задача
 *
 */
public class Calc implements MoneyConverter {
static final double k = 26.5;

    @Override
    public double convertFromUSD(int i) {
        return i*k;
    }


}
