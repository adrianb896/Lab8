package hazardControl;

public class Manager extends Administrator {

    public Manager(String name) {
        super(name);
    }

    public void seeDanger(HReporter_IF r, Hazard hazard) {
        boolean reportToCEO = true;
        for (Employee e: members) {
            if(e instanceof DirectAdministrator)
                reportToCEO = ((DirectAdministrator)e).getFeedback(hazard) && reportToCEO;
        }
        if(reportToCEO && overseer != null)
            overseer.seeDanger(this, hazard);
        else {
            System.out.println("I fail to see why the CEO needs to be informed to this.");
        }
    }

    public List<Decision> suggestDecisions(Hazard hazard){
        List<Decision> mySuggestions = new ArrayList<>();

        Scanner choice = new Scanner(System.in);
        System.out.printf("Manager %s, please suggest some decisions to the CEO regarding %s.\n", name, hazard.toString());
        do {
            System.out.println("Does the area need to be evacuated?\n\t[Yes] - Evacuate the area\n\t[No] - File an incident report");
            boolean shouldEvacuate = choice.next().toLowerCase(Locale.ROOT).indexOf('y') >= 0;

            System.out.printf("How urgent %s on a scale from 1(low) - 10(high)? ", shouldEvacuate ? "is evacuating the area" : "does a report need to be filed");
            int priority = choice.nextInt();

            mySuggestions.add(shouldEvacuate ? new Evacuation(this, priority, hazard) : new FileReport(this, priority, hazard));

            System.out.println("Would you like to make an alternate suggestion?\n\t[1] - Suggestion another decision\n\t[ANY] - Done");
        }while(choice.nextInt()==1);
        System.out.println("Your suggestions have been recorded.");

        return mySuggestions;
    }
}
