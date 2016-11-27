package src.m3oop.webinar.phones;

public class Main {
    public static void main(String[] args) {
        int a=5;

        Car honda1 = new Car("civik",2009);
        // и вот у нас два разных объекта
        Car honda2 = new Car(2010,"civik2",10000,"Jack");

        Phone phone = new Phone();
       // phone.test();
    }
}
