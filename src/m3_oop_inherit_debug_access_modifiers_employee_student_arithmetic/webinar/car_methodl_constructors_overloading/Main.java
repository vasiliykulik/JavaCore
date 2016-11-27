package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.webinar.car_methodl_constructors_overloading;

public class Main {
    public static void main(String[] args) {
        int a=5;

        Car honda1 = new Car("civik",2009);
        // и вот у нас два разных объекта
        Car honda2 = new Car (2010,"civik2",10000,"Jack");

        honda1.printYear(); // в любом объекте мы можем вызвать этот метод - и у нас год будет
        honda2.printYear(); // мы задали его в конструкторе - проинициализировали
    }
}
