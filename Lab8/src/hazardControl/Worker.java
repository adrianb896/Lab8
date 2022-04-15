package src.Personel;

import src.Actions.Hazard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Worker extends Employee{
    public Worker(String name) {
        super(name);
    }

    //Worker will triggered the method [seeDanger] to report hazard to the overseer(supervisor)
    //and the parameters here are reporter and hazard
    @Override
    public void seeDanger(IReporterHazard reporter, Hazard hazard)
    {
        if(reporter != null){
            fixIt(hazard);
        }else{
            hazard = documentHazard();
            fixIt(hazard);
            overseer.seeDanger(this, hazard);
        }
    }

    //here we will create a new hazard and return the hazard
    private Hazard documentHazard(){
        Scanner observationDetails = new Scanner(System.in);

        List<String> types = new ArrayList<String>(){
            {
                add("Biological");
                add("Chemical");
                add("Physical");
                add("Safety");
                add("Ergonomic");
                add("Psychosocial");
            }
        };

        System.out.printf("Worker %s has observed something hazardous.\n", name);
        System.out.println("What type of hazard is this?");
        int i = 1;
        for (String type: types){
            System.out.printf("\t[%d] - %s\n", i++, type);
        }
        int typeSelection = observationDetails.nextInt()-1;
        if(typeSelection<0 || typeSelection >= types.size())
            typeSelection = types.indexOf("Safety");// if they select something weird default to safety hazard
        String type = types.get(typeSelection);

        System.out.println("On a scale from 1(low) - 10(high), how dangerous is this hazard?");
        int level = observationDetails.nextInt();

        System.out.println("Please provide a short description of this hazard:");
        String desp = observationDetails.next();
        desp += observationDetails.nextLine();

        return new Hazard(type, desp, level);
    }

    //this is used to alert when a worker has evacuated
    @Override
    public void evacuate() {
        System.out.println(name + " has been evacuated." );
    }

    //the function fixIt will announce when the worker is fixing the hazard
    //the parameters are hazard and the hazard being fixed
    public void fixIt(Hazard hazard){
        System.out.printf(" -> %s is fixing %s.\n", name, hazard.toString());
    }
}