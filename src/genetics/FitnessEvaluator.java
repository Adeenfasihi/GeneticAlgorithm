package genetics;

import population.*;

/*
 *  Evaluate fitness according to some metric
*/
public class FitnessEvaluator {
    
    public void evaluate(Population p){
        for(Chromosome c : p.population){
            evaluate(c);
        }
    }

    public void evaluate(Chromosome c){
        c.setFitness(Math.random());
    }
}
