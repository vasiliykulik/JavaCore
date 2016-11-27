package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.offline4.dao3;

/**
 * Created by Стрела on 05.09.2016.
 */
public class Task{
long id;
    String description;

    public Task(String description) {
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
