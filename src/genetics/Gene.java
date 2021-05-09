package genetics;

import java.util.Random;

class Gene{

    /*
    // String possibleCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    //                                 + "0123456789"
    //                                 + "abcdefghijklmnopqrstuvxyz"; 
    // static String goalString = "11110000";
    */

    static final char[] letters = {'a', 't', 'g', 'c'};
    static final int LENGTHOFCODE = 4;
    char[] code;

    
    public Gene(){}
    
    public void createGene(){
        code = new char[LENGTHOFCODE];
        Random rand = new Random();

        for(int i = 0; i < code.length; i++){
            code[i] = letters[rand.nextInt(letters.length)];
        }
    }

    public void setCode(String gene){
        code = gene.toCharArray();
    }

    public String toString(){
        return String.valueOf(code);
    }
}
