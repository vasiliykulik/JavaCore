package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.questionanswer.runtypes;

/**
 * Created by Стрела on 06.09.2016.
 * Здесь делаем наследование
 * Если у нас идет наследование и имплементация - то имплементацию мы берем на себя тоже
 */
public class Girl extends Man implements Person {
    public Girl(Car car) {
        super(car);
    }


    @Override
    public void runDistance(int distance) {
        super.runDistance(distance);
    }
}
