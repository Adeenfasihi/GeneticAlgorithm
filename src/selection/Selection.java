package selection;

/*
 *  Selection can be of two types
 *  1. While selecting a parent from population for crossover
 *  2. While creating a parent for populating purpose
 * 
*/

import population.*;
import genetics.*;

public interface Selection{
    Chromosome selectParent(Population aPopulation);
    Chromosome createParent();
}
