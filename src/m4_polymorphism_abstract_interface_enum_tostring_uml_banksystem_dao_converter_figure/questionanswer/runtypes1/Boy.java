package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.questionanswer.runtypes1;

/**
 * Created by Стрела on 06.09.2016.
 */
public class Boy extends Man implements Personold {
    public Boy(Car car) {
        super(car);
    }

    @Override
    public void runDistance(int distance) {
        super.runDistance(distance);

        if (distance<35){
            System.out.println("Run :" + RunTypes.BY_FOOT);
        }
        if (distance>=35 && distance<950){
            System.out.println("Run :" + RunTypes.BY_CAR);
            System.out.println("Fuel spent :" + getCar().fuelNeeds());
        }
        if (distance>=950){
            System.out.println("Run :" + RunTypes.BY_PLANE);

        }
    }


}
