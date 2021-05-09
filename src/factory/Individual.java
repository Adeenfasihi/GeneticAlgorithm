package factory;

import population.*;
import genetics.*;
import selection.*;
/*
 *  Abstract factory pattern starts
 * 
*/
public abstract class Individual{
    public abstract Chromosome createParent(Selection selection);
    public abstract void replaceParent(Chromosome c, Population population);
}



// Chromosome[] chromosomes;

// public Individual createIndividual(Selection selection){
//     chromosomes = new Chromosome[2];
//     return new Individual();
// }

// public String[] getChromosomesAsStringArray(){
//     String[] setOfChromosomesAsString = new String[2];
    
//     for(int i = 0; i < setOfChromosomesAsString.length; i++)
//     {
//         setOfChromosomesAsString[i] = chromosomes[i].toString();
//     }

//     return setOfChromosomesAsString;
// }
// Chromosome chromosome;

// public void setChromosome(Chromosome chromosome) {
//     this.chromosome = chromosome;
// }

// public Chromosome getChromosome(){
//     return chromosome;
// }