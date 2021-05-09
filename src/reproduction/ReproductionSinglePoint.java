package reproduction;

/*
 *  Child contains half of each parent's chromosome
 * 
*/
import genetics.*;

public class ReproductionSinglePoint implements Reproduction{
    public Chromosome crossover(Chromosome parent1, Chromosome parent2){
        
        String parentString1 = parent1.toString();
        String parentString2 = parent2.toString();

        String newString = parentString1.substring(0, (parentString1.length()-1)/2);
        newString += parentString2.substring((parentString2.length()-1)/2);
        
        Chromosome child = new Chromosome();
        child.setGenes(newString);

        return child;
    }
}
