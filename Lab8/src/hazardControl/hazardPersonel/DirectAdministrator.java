package src.hazardPersonel;

import src.Actions.Hazard;

public abstract class DirectAdministrator extends Administrator{

	private final int HAZARD_LEVEL_THRESHOLD = 5;
	/**
	 * constructor
	 */
	public DirectAdministrator(String name) {
		super(name);
	}

	/**
	 Each supervisor or leader object has a “boolean getFeedback()” method, displaying “Feedback by [name]”
	 
	 */
	public boolean getFeedBack(Hazard hazard){
		boolean feedback = hazard.getHazard_level() >= HAZARD_LEVEL_THRESHOLD;
		System.out.printf("\nFeedback from %s is %b.\n", name, feedback);
		return feedback;
	}

	/**
	 Supervisor - tell all his team members to perform fixIt() and also inform their overseer(manager)
	 Manager -   handle the danger by asking feedbacks from all supervisors/leaders under his management
	 and contacting the CEO in case the feedbacks are all positive(T)
	 CEO -       collect suggested decisions from the managers who performed their suggestDecisions method
	 
	
	 */
	@Override
	public void seeDanger(HReporter_IF reporter, Hazard hazard) {
		System.out.printf("%s instructs team members to fix %s\n", name, hazard.toString());
		for(Employee e: members){
			if(e != reporter){
				e.seeDanger(this, hazard);
			}
		}
		if(overseer != null)
			overseer.seeDanger(reporter, hazard);
	}
}
