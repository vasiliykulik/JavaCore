package src.m4polymorphism.questionanswer.runtypes1;

/**
 * Created by Стрела on 06.09.2016.
 */
public class Man extends Person {
    public Man(Car car){
        super(car);
    }
    public void runDistance(int distance) {
        if (distance<50){
            System.out.println("Run :" + RunTypes.BY_FOOT);
        }
        if (distance<1500 && distance>=50){
            System.out.println("Run :" + RunTypes.BY_CAR);
            System.out.println("Fuel spent :" + getCar().fuelNeeds());
        }
        if (distance>=1500){
            System.out.println("Run :" + RunTypes.BY_PLANE);

        }
    }
}
