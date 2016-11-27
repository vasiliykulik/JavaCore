package src.m9_lambdas_streams_functions.offline.org.app.data;


import src.m9_lambdas_streams_functions.offline.org.app.model.Animal;
import src.m9_lambdas_streams_functions.offline.org.app.model.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stan on 19.10.2016.
 */
public class DataModule {
    private List<Animal> animals = new ArrayList<>();

    public DataModule() {
        for(int i=0;i<10;i++){
            animals.add(new Dog("Name"+i, i));
        }
    }

    public void add(Animal a){
        animals.add(a);
    }

    public void remove(Animal a){
        animals.remove(a);
    }

    public List<Animal> getAnimals(){
        return animals;
    }


}
