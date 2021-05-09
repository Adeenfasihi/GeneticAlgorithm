package controller;

import factory.*;
import population.*;
import selection.*;
import genetics.*;
import mutation.*;
import reproduction.*;
/*
 *  Main controller for the Genetic Algorithm
 *  Drives the program
 * 
*/
public class GAControl {
    
    private Population population;
    private Selection selector;
    private Reproduction reproducer;
    private Mutator mutator;


    // For GAControl Singleton - thread safe initialization (Bill Pugh Solution)
    private static class InstanceWrapper{
        static GAControl INSTANCE = new GAControl();
    }

    public static GAControl getInstance(){
        return InstanceWrapper.INSTANCE;
    }

    private GAControl(){
        selector = new SelectionPakistani();
        reproducer = new ReproductionSinglePoint();
    }


    public void start(){
        // Create Population
        population = new Population();

        // Evaluate Fitness
        FitnessEvaluator evaluator = new FitnessEvaluator();
        evaluator.evaluate(population);

        // Initial population output
        printPopulation();

        int generations = 2;
        double mutationRate = 0.1;

        // For selecting parents from population
        Parent p1 = new Parent();
        Parent p2 = new Parent();

        for(int i = 0; i < generations; i++){
            // Initialize new child which will be a potential parent
            Individual child = new Parent();

            // Select parent chromosomes
            Chromosome c1 = p1.selectParent(selector, population);
            Chromosome c2 = p2.selectParent(selector, population);

            // Create new chromosome for child
            Chromosome newChromosome = reproducer.crossover(c1, c2);

            // If mutator set then mutate else skip
            if(mutator != null)
                newChromosome = mutator.mutate(newChromosome, mutationRate);
            
            // Evaluate fitness of the new chromosome
            evaluator.evaluate(newChromosome);
            
            // Replace one parent in the population (Child becomes new parent)
            child.replaceParent(newChromosome, population);
        }

        // Resulting population output
        printPopulation();
    }

    private void printPopulation(){
        System.out.println(population.toStringForPrinting());
    }

    // We can observe strategy pattern here onwards

    public void setSelection(Selection aSelectionStrategy){
        selector = aSelectionStrategy;
    }

    public void setReproduction(Reproduction aReproductionStrategy){
        reproducer = aReproductionStrategy;
    }

    public void setMutation(Mutator aMutationStrategy){
        mutator = aMutationStrategy;
    }
}
