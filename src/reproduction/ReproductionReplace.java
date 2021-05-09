package reproduction;

import java.util.Random;
import genetics.*;
/*
 *  Child is the same as one of the parents
 * 
*/
public class ReproductionReplace implements Reproduction {
    public Chromosome crossover(Chromosome parent1, Chromosome parent2){
        
        String parentString1 = parent1.toString();
        String parentString2 = parent2.toString();

        Random rand = new Random();
        
        Chromosome child = new Chromosome();

        if(rand.nextInt(2) == 0)
            child.setGenes(parentString1);
        else
            child.setGenes(parentString2);
        
        return child;
            
    }
}
