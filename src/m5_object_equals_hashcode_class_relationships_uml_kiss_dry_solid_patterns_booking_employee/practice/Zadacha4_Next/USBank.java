package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.practice.Zadacha4_Next;

/**
 * Created by Andrey on 9/2/16.
 */
public class USBank extends Bank {

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    //
    int getCommission(int amount) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000) commission = 5;
            else commission = 7;
        } else {
            //if (amount < 1000) commission = 5;
            //else commission = 7;
            return 0;
        }
        return commission;
    }
}
