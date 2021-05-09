package reproduction;

import genetics.*;

public interface Reproduction {
    Chromosome crossover(Chromosome parent1, Chromosome parent2);
}
