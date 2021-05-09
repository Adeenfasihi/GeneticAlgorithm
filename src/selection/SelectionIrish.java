package selection;

import java.util.Random;
import population.*;
import genetics.*;

public class SelectionIrish implements Selection{
    
    Chromosome c;
    
    public Chromosome selectParent(Population aPopulation){
        Random rand = new Random();
        return aPopulation.population.get(rand.nextInt(aPopulation.population.size()));
    }

    public Chromosome createParent(){
        c = new Chromosome();
        c.createChromosome();
        return c;
    }
}
