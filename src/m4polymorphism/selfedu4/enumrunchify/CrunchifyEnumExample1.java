package src.m4polymorphism.selfedu4.enumrunchify;

/**
 * Created by Стрела on 04.09.2016.
 *
 * Enum in Java are type-safe: Enum has there own name-space.
 * It means your enum will have a type for example “Company”
 * in below example and you can not assign any value other
 * than specified in Enum Constants.
 *
 * You can specify values of enum constants at the creation time.
 * MyEnum.values() returns an array of MyEnum’s values.
 *
 * Enum constants are implicitly static and final and can not be
 * changed once created.
 *
 * Enum can be safely compare using:

 Switch-Case Statement
 == Operator
 .equals() method

 Company eBay = Company.EBAY;
 if(eBay == Company.EBAY){
 log.info("enum in java can be compared using ==");
 }

 */
public class CrunchifyEnumExample1 {

    public enum Company {
        EBAY(30), PAYPAL(10), GOOGLE(15), YAHOO(20), ATT(25);
        private int value;

        private Company(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        for (Company cName : Company.values()) {
            System.out.println("Company Value: " + cName.value + " - Company Name: " + cName);


        }
    }
}
