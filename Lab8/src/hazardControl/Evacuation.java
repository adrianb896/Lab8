package hazardControl;

public class Evacuation extends Decision{
    public Evacuation(Manager suggestedBy, int priority, Hazard hazard) {
        super(suggestedBy, priority, hazard);
    }
    @Override
    public void execute(CEO commander) {
        System.out.printf("Execute Evacuation Plan: suggested by %s for %s\n", suggestBy.getName(), hazard.toString());
        commander.evacuate();
    }

}
