package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.homework4;

/**
 * Created by Стрела on 06.09.2016.
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}
