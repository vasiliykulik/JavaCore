package src.m4polymorphism.homework4;

/**
 * Created by Стрела on 06.09.2016.
 */
public class USBank extends Bank {


    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return getCurrency() == Currency.USD ? 1200 : 1000;
    }

    @Override
    int getLimitOfFunding() {
        return getCurrency() == Currency.USD ? 0 : 1200; // ставим 0 - надо ввести обработку if == 0 && ~amount < getLimitOfFunding, Вопрос а будут ли равны int 0 == double 0.0 если на последующих этапах произойдет расширяющееся приведение - да будут равны! src.module1.FirstClass
    }

    @Override
    int getMonthlyRate() {
        return getCurrency() == Currency.USD ? 1 : 2;
    }

    @Override
    double getCommission(int summ) {
        double commission;
        if (getCurrency() == Currency.USD) {
            commission = summ <= 1000 ? 5 : 7;
        } else {
            commission = summ <= 1000 ? 6 : 8;
        }
        commission = summ * commission / 100;
        return commission;
    }
}
