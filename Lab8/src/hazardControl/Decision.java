//Decision.java
package src.Actions;

import src.Personel.CEO;
import src.Personel.Manager;

public abstract class Decision {
    //this will be for the  manager that will suggest the plan
    protected Manager suggestedBy;

    //this integer is for the priority level
    protected int priority;

    //this is fort the hazard that needs to be resolved by this plan
    protected Hazard hazard;

    //this is the constructor  the parameters we will use are suggestedBy,priority and hazard
    public Decision(Manager suggestedBy, int priority, Hazard hazard) {
        this.suggestedBy = suggestedBy;
        this.priority = priority;
        this.hazard = hazard;
    }

    // this plan will be executed with the parameter as the commander
    public abstract void execute(CEO commander);


    //this int will get the priority of the decision and we will return the priority
    public int getPriority() {
        return priority;
    }
}