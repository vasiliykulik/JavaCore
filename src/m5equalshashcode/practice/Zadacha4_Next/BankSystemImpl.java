package src.m5equalshashcode.practice.Zadacha4_Next;


public class BankSystemImpl implements BankSystem {
    int a = 10;
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        double commission = userBank.getCommission(amount) / 100; //5 -> 0.05
        if (userBank.getLimitOfWithdrawal() >= amount + amount * commission) {
            //do logic if rules allow
            double newBalance = user.getBalance() - amount - amount * commission;
            user.setBalance(newBalance);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        //if limit is ok - do funding - if no do nothing

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        //fromUser balance - amount - commission
        //toUser balance + amount
    }

    @Override
    public void paySalary(User user) {
        //user balance + salary - commision
    }
    /*
    Оверрайдим методы
     */
 int calculate(){
     return a++;
 }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {

        fundUser(null,10);
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        BankSystemImpl that = (BankSystemImpl) o;

        return a == that.a;

    }

    @Override
    public int hashCode() {
        return a;
    }
}
