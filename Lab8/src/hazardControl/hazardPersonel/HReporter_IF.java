package src.hazardPersonel;

import src.Actions.Hazard;

public interface HReporter_IF {
    public void seeDanger(HReporter_IF reporter, Hazard hazard);
    public void setDirectOverseer(HReporter_IF directOverSeer);
    public HReporter_IF getDirectOverseer();
}
