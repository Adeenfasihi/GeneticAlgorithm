import controller.*;
import selection.*;
import mutation.*;
import reproduction.*;

public class Runner {
    public static void main(String[] args){
        GAControl controller = GAControl.getInstance();

        controller.setSelection(new SelectionPakistani());
        controller.setReproduction(new ReproductionSinglePoint());
        controller.setMutation(new SingleMutation());
        controller.start();

        // controller.setSelection(new SelectionIrish());
        // controller.setReproduction(new ReproductionReplace());
        
        // controller.start();
    }
}
