package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.offline4.dao3;

/**
 * Created by Стрела on 05.09.2016.
 */
public abstract class AbstractDAO {

    public Object save(Object object) {
        System.out.println(object.toString()+"saved");
        return object;
    }

    public Object update(Object object) {
        System.out.println(object.toString()+"updated");
        return object;
    }

    public boolean delete(Object object) {
        System.out.println(object.toString()+"deleted");
        return true;
    }

    abstract public Object find(long id);
    }

