package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.questionanswer.runtypes;

/**
 * Created by Стрела on 06.09.2016.
 */
public class Man implements Person {
    private Car car;

    public Man(Car car) {
        this.car = car;
    }
    public void runDistance(int distance) {
        if (distance<50){
            System.out.println("Run :" + RunTypes.BY_FOOT);
        }
        if (distance<1500 && distance>=50){
            System.out.println("Run :" + RunTypes.BY_CAR);
            System.out.println("Fuel spent :" + car.fuelNeeds());
        }
        if (distance>=1500){
            System.out.println("Run :" + RunTypes.BY_PLANE);

        }
    }

    public Car getCar() {
        return car;
    }
}
