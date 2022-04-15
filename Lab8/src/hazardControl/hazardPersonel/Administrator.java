
package src.hazardPersonel;

import src.Actions.Hazard;

import java.util.ArrayList;
import java.util.List;

public abstract class Administrator extends Employee {
  //this admin will direct employees
  protected List<Employee> members;

  //constructor the parameter is just name
  public Administrator(String name) {
    super(name);
    members = new ArrayList<Employee>();
  }

  //this will add the direct employee to an administrators' member
  //the parameter here is newTeamMember
  public void addMember(Employee newTeamMember){
    members.add(newTeamMember);
  }


  @Override
  public abstract void seeDanger(HReporter_IF reporter, Hazard hazard);

  // the people that are evacuationg all the members and then they will evacuate themselves
  @Override
  public void evacuate() {
    System.out.println("Evacuating members first ... ");
    for(Employee e: members){
      e.evacuate();
    }
    System.out.println(name + " has evacuated now that their members have evacuated.");
  }
}