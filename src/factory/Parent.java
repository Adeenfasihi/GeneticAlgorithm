package factory;

import java.util.Random;
import population.*;
import genetics.*;
import selection.*;
/*
 * Parent factory
 * 
*/
public class Parent extends Individual {

    public Chromosome createParent(Selection selection){
        if(selection instanceof SelectionIrish)
            return new SelectionIrish().createParent();
        else 
            return new SelectionPakistani().createParent();
    }

    public Chromosome selectParent(Selection selection, Population aPopulation){
        if(selection instanceof SelectionIrish)
            return new SelectionIrish().selectParent(aPopulation);
        else
            return new SelectionPakistani().selectParent(aPopulation);
    }

    public void replaceParent(Chromosome c, Population population){
        Random rand = new Random();
        population.population.remove(rand.nextInt(population.population.size()));
        population.population.add(c);
    }
}
