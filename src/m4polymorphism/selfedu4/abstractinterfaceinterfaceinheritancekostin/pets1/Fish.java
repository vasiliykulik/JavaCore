package src.m4polymorphism.selfedu4.abstractinterfaceinterfaceinheritancekostin.pets1;

/**
 * Created by Стрела on 05.09.2016.
 * добавили
 void voice() {
 }
 Обратите внимание, что теперь, во-первых, мы не можем создавать объекты абстрактного класса Pet, а, во-вторых, реализация метода voice() должна иметься во всех его потомках (хотя бы пустая реализация), не являющихся абстрактными классами.

 Хотя, мы могли бы создать абстрактного потомка:

 abstract class Fish extends Pet {
 }
 Но не могли бы создавать объектов класса Fish, нам пришлось бы расширять класс, чтоб в итоге получить не абстрактный и создавать на его основе объекты. Например:

 class GoldenFish extends Fish {
 void voice() {
 }
 }
 */
public class Fish extends Pet {
    void voice() {
    }
}