package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.offline4.dao3;

/**
 * Created by Стрела on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        AbstractDAO dao = new TaskDAOImpl();
        dao.find(123);          // b можем дергать уже методы
    }

}
