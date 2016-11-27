package src.m3oop.questionanswer.task4.task4;

public class User {// массив как поле нашего класса
    private String[] phones; // read only переменная
    private  int a; // напрмер на перееменную а нет ни геттера не сеттера
    private int ID; // data Hidng - мы можем только сеттер поставить


    private  String[] getPhones(){
        if(phones.length !=0)
        return phones;
        else return null;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }


}
