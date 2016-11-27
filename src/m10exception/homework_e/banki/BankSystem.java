package src.m10exception.homework_e.banki;

/**
 * Created by Стрела on 06.09.2016.
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}
