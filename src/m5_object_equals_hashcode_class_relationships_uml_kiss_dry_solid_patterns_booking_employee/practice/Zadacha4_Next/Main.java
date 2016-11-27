package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.practice.Zadacha4_Next;
/*
Полезности  ID из БД  - да мы можем сравнивать по ID - и equals  переписывается
 */
public class Main {
    public static void main(String[] args) {
      /*  //BankSystemImpl -> User -> Bank
        Bank usBank = new USBank();
        usBank.setCurrency(Currency.EUR);

        User user = new User();
        user.setBalance(5000);
        user.setBank(usBank);


        System.out.println(user);

        //top level of abstraction, we run all methods throught it
        BankSystem bankSystem = new BankSystemImpl(); //better
        //BankSystemImpl bankSystem1 = new BankSystemImpl();
        bankSystem.withdrawOfUser(user, 1100);

        System.out.println(user);
        */
        Bank bank1 = new EUBank();

        Bank bank2 = new USBank();

        System.out.println(bank1.equals(bank2));

        Currency currency = Currency.USD;
        Currency currency1 = Currency.EUR;
        // с 10 будет true , b без 10 будет
    }
}
