package src.tutor.module4.homework;


public class EUBank extends Bank {
    @Override
    int getCommission(int summ) {
        return 0;
    }

    @Override
    int getLimitOfWithdrawal() {
        return 0;
    }
}
