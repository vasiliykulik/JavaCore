package src.m10exception.homework_e.banki;

/**
 * Created by Стрела on 06.09.2016.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return getCurrency() == Currency.USD ? 2000 : 2200;
    }

    @Override
    int getLimitOfFunding() {
        return getCurrency() == Currency.USD ? 10000 : 20000;
    }

    @Override
    int getMonthlyRate() {
        return getCurrency() == Currency.USD ? 0 : 1;
    }

    @Override
    double getCommission(int summ) {
        double commission;
        if (getCurrency() == Currency.USD) {
            commission = summ <= 1000 ? 5 : 7;
        } else {
            commission = summ <= 1000 ? 2 : 4;
        }
        commission = summ * commission / 100;
        return commission;
    }
}
