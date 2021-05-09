package mutation;

import genetics.*;

public class SingleMutation implements Mutator{
    public Chromosome mutate(Chromosome child, double mutationRate){
        String mutated = child.toString();
        mutated = mutated.replaceFirst("a", "t");
        child.setGenes(mutated);
        return child;
    }
}
