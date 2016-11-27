package src.m4polymorphism.webinar4.interFaces;

import src.m4polymorphism.webinar4.Employeeabstractclassandmethods.DeveloperEmployee;

/**
 * Created by Стрела on 02.09.2016.
 * тоже будет имплементить прекрасный DBService interface
 * но это будет другая реализация - другая БД
 */
public class ManagerDbService implements DBService {
    @Override
    public void save(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee get(long id) {
        return null;
    }

    @Override
    public void update(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee[] getallDevelopers() {
        return new DeveloperEmployee[0];
    }
}
