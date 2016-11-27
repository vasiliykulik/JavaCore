package src.m4polymorphism.selfedu4.abstractinterfaceinterfaceinheritancekostin.pets1;

public class Main {
    public static void main(String[] args) {
        Pet zorka = new Pet();
        zorka.food();
        Fish nemo = new Fish();
        nemo.voice();
        Dog snoopy = new PatrolDog();
        snoopy.voice();
    }
}
