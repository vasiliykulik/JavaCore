package src.m10exception.homework_e.banki;

/**
 * Created by Стрела on 06.09.2016.
 */
public class BankSystemImpl implements BankSystem {

    // коммиссию снимаю при всех операциях
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank bank = user.getBank();

        if (user.getBalance() > amount + bank.getCommission(amount) && amount < bank.getLimitOfWithdrawal()) {
            user.setBalance(user.getBalance() - amount - bank.getCommission(amount));
        } else {
            System.out.println("NO withdrawOfUser");
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank bank = user.getBank();
        if (bank.getLimitOfFunding() > amount || bank.getLimitOfFunding() == 0) { // условие пополнение без ограничений
            user.setBalance(user.getBalance() + amount - bank.getCommission(amount));
        } else {
            System.out.println("NO fundUser");
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank frombank = fromUser.getBank();
        Bank tobank = toUser.getBank();

        if (fromUser.getBalance() > amount + frombank.getCommission(amount) && amount < frombank.getLimitOfWithdrawal()
                && (tobank.getLimitOfFunding() > amount || tobank.getLimitOfFunding() == 0)) {
            fromUser.setBalance(fromUser.getBalance() - amount - frombank.getCommission(amount));
            toUser.setBalance(toUser.getBalance() + amount - tobank.getCommission(amount));
        } else {
            System.out.println("NO transferMoney");
        }
    }

    @Override
    public void paySalary(User user) {
        Bank bank = user.getBank();
        if (bank.getLimitOfFunding() < user.getSalary() || bank.getLimitOfFunding() == 0) {
            user.setBalance(user.getBalance() + user.getSalary() - bank.getCommission(user.getSalary()));
        } else {
            System.out.println("NO paySalary");
        }
    }
}
