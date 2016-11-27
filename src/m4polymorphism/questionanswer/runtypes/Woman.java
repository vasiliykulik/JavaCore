package src.m4polymorphism.questionanswer.runtypes;

/**
 * Created by Стрела on 06.09.2016.
 */
public class Woman implements Person {
    private Car car;
    @Override
    public void runDistance(int distance) {
        if (distance<10){
            System.out.println("Run :" + RunTypes.BY_FOOT);
        }
        if (distance<500 && distance>=10){
            System.out.println("Run :" + RunTypes.BY_CAR);
            System.out.println("Fuel spent :" + car.fuelNeeds());
        }
        if (distance>=500){
            System.out.println("Run :" + RunTypes.BY_PLANE);

        }
    }

    public Car getCar() {
        return car;
    }
}
