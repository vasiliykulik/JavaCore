package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.webinar4.Employeeabstractclassandmethods;

/**
 * Created by Стрела on 02.09.2016.
 * Даже и здесь и в HREmployee надо писать реализацию
 */
public class HRSpecialEmployee extends HREmployee {
    @Override
    void paySalary(){
        double k =1.1;
        balance+=salary*k;
    }
}
