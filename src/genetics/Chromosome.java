package genetics;

public class Chromosome {
    Gene[] genes = new Gene[10];
    double fitness;

    public void createChromosome(){
        for(int i = 0; i< genes.length; i++){
            genes[i] = new Gene();
            genes[i].createGene();
        }
    }
    
    void setFitness(double aFitness){
        fitness = aFitness;
    }

    // On creation of new chromosome
    public void setGenes(String chromosome){
        for(int i = 0, j = 0; i < genes.length; i++){
            genes[i] = new Gene();
            genes[i].setCode(chromosome.substring(j, j+4));
            j+=4;
        }
    }

    public String toString(){
        StringBuilder chromosomeAsString = new StringBuilder();
        for (Gene g : genes){
            chromosomeAsString.append(g.toString());
        }
        return chromosomeAsString.toString();
    }


    public String toStringForPrinting(){
        StringBuilder chromosomeAsString = new StringBuilder();
        for (Gene g : genes){
            chromosomeAsString.append(g.toString()+"\t");
        }
        chromosomeAsString.append("\t"+ String.format("%.2f", fitness));
        return chromosomeAsString.toString();
    }
}
