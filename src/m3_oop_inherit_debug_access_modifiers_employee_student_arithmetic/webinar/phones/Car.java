package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.webinar.phones;

public class Car {
    int year;
    String model;
    int price;
    String nameOfTheOwner;

    //Перегрузка Конструкторов
    public Car(String Name, int year) {
        this.model = Name;
        this.year = year;
    }

    public Car(int year, String model, int price, String nameOfTheOwner) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.nameOfTheOwner = nameOfTheOwner;
    }

    int test(int a){
        return a-5;
    }

    int test(int a, int b){
        return a-5;
    }

    void printOwnerName(){
        System.out.println(nameOfTheOwner);
    }

    void printYear(){
        System.out.println(year); // System.out.println(this.year); - одно и тоже
    }
}
