package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.practice.Zadacha4_Next;
/*
тут мы общий оверрайд мы не можем сделать как в абстрактном классе
 */

public interface BankSystem {
    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}
