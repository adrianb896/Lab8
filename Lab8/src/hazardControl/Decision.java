//Decision.java
package src.Actions;

import src.Personel.CEO;
import src.Personel.Manager;

public abstract class Decision {

    /**
     * this is the manager that the plan got suggested by
     */
    protected Manager suggestedBy;

    /**
     * level of priority
     */
    protected int priority;

    /**
     * hazard, that will be resolved
     */
    protected Hazard hazard;

    /**
     * @param suggestedBy
     * @param priority
     * @param hazard
     */
    public Decision(Manager suggestedBy, int priority, Hazard hazard) {
        this.suggestedBy = suggestedBy;
        this.priority = priority;
        this.hazard = hazard;
    }

    /**
     * plan will be executed
     * 
     * @param commander
     */
    public abstract void execute(CEO commander);

    /**
     * The priority
     * 
     * @return
     */
    public int getPriority() {
        return priority;
    }
}