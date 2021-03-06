package src.m9lambdasstreamsfunctions.offline.org.app.controller.business;

import src.m9lambdasstreamsfunctions.offline.org.app.model.Animal;

import java.util.List;

/**
 * Created by Stan on 19.10.2016.
 */
public interface BusinessProcessor {

    public int getSumOfAgesOfAnimals();

    public Animal getOldestAnimal();

    public List<Animal> getAnimalsByName(String name);

    public void enrcihAnimals(String name, int delta);
}
