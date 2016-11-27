package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.homework4;

/**
 * Created by Стрела on 06.09.2016.
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return getCurrency() == Currency.USD ? 100 : 150;
    }

    @Override
    int getLimitOfFunding() {
        return getCurrency() == Currency.USD ? 10000 : 5000;
    }

    @Override
    int getMonthlyRate() {
        return getCurrency() == Currency.USD ? 1 : 0;
    }

    @Override
    double getCommission(int summ) {
        double commission;
        if (getCurrency() == Currency.USD) {
            commission = summ <= 1000 ? 3 : 5;
        } else {
            commission = summ <= 1000 ? 10 : 11;
        }
        commission = summ * commission / 100;
        return commission;
    }
}
