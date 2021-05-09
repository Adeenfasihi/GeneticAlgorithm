package population;

import java.util.ArrayList;
import java.util.Random;
import genetics.*;
import factory.*;
import selection.*;
/*
 *  Population includes all chromosomes
 * 
*/
public class Population {
    int size = 10;
    public ArrayList<Chromosome> population = new ArrayList<>();
    
    public Population(){
        for(int i = 0; i<size; i++){
            Individual parent = new Parent();
            Chromosome c;
            Random rand = new Random();

            if(rand.nextInt(2) == 0)
                c = parent.createParent(new SelectionIrish());
            else
                c = parent.createParent(new SelectionPakistani());
            
            population.add(c);
        }
    }

    public String toString(){
        StringBuilder populationAsString = new StringBuilder();
        for(Chromosome c : population){
            populationAsString.append(c.toString()+"\n");
        }
        return populationAsString.toString();
    }

    public String toStringForPrinting(){
        StringBuilder populationAsString = new StringBuilder();
        for(Chromosome c : population){
            populationAsString.append(c.toStringForPrinting()+"\n");
        }
        return populationAsString.toString();
    }
}

