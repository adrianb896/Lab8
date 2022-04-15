package src.Actions;

import src.hazardPersonel.CEO;;
import src.hazardPersonel.Manager;

public class Evacuation extends Decision{
    public Evacuation(Manager suggestedBy, int priority, Hazard hazard) {
        super(suggestedBy, priority, hazard);
    }
    
    /*
    * @param commander
    */
    
    @Override
    public void execute(CEO commander) {
        System.out.printf("Execute Evacuation Plan: suggested by %s for %s\n", suggestedBy.getName(), hazard.toString());
        commander.evacuate();
    }

}
