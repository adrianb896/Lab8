package hazardPersonel;

import Actions.Hazard;

public abstract class Employee implements HReporter_IF {
    protected String name;
    protected Administrator overseer;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void seeDanger(HReporter_IF r, Hazard hazard);

    public abstract void evacuate();

    /**
	 * set this employee's direct overseer
	 * @param directOverseer boss
	 */
    public void setDirectOverseer(HReporter_IF directOverseer) {
        this.overseer = (Administrator) directOverseer;
    }
    
    /**
	 * get this employee's direct overseer
	 * @return HReporter_IF - boss
	 */
    public HReporter_IF getDirectOverseer() {
        return overseer;
    }

    public String getName() {
        return name;
    }
}
