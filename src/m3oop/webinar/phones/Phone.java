package src.m3oop.webinar.phones;

public class Phone {
    /*
    Область видимости нашего поля - Инкапсуляция
    Data Hiding. ООП - редактировать данные класса можно только из класса
    если public - то сможем менять с любого места - источник багов.
    private Закрыdf.n возможность модификация полей
    Information Hiding
     */
    private String manufacturer;
    private String operatingSystem;
    private String model;
    private int cost;
/*
    области видимости
    private - можно модифицировать только изнутри самого класса - видно хорошо на примере
    метода
    public - доступен всем
    protected - классам пакета (на оффлайн только наследникам),
    классам пакета и наследникам
   (default-package private)- классам пакета
 */
    public Phone() {
    }

    public Phone(int cost, String model, String manufacturer, String operatingSystem) {
        this.cost = cost;
        this.model = model;
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
    }

    static void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        test();
    }

}
