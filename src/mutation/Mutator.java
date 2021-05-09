package mutation;

import genetics.*;

public interface Mutator {
    public Chromosome mutate(Chromosome child, double mutationRate);
}
