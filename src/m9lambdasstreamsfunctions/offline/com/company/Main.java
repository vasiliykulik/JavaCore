package src.m9lambdasstreamsfunctions.offline.com.company;

import src.m9lambdasstreamsfunctions.offline.org.app.controller.business.BusinessProcessor;
import src.m9lambdasstreamsfunctions.offline.org.app.controller.business.BusinessProcessorImpl;
import src.m9lambdasstreamsfunctions.offline.org.app.data.DataModule;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // A a = new C();
        //C c = (C) new A();
       // System.out.println("-----------------");
       // A a1 = new A();
        BusinessProcessor bp = new BusinessProcessorImpl(new DataModule());
        bp.getSumOfAgesOfAnimals();

    }
}
