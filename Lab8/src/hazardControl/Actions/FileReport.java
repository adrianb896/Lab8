package src.Actions;

import src.hazardPersonel.CEO;
import src.hazardPersonel.Manager;
import src.hazardPersonel.Manager;

public class FileReport extends Decision{

    /*
    * this is the constructor the parameters for FileReport are
    * suggestedBy, priority and hazard
    */
    public FileReport(Manager suggestedBy, int priority, Hazard hazard) {
        super(suggestedBy, priority, hazard);
    }

    //this plan will be executed and the parameter in the execute function is commander
    @Override
    public void execute(CEO commander) {
        System.out.printf("Execute File Report: suggested by %s for %s\n", suggestedBy.getName(), hazard.toString());
        commander.report();
    }
}
