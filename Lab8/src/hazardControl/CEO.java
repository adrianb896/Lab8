package hazardControl;

import java.util.ArrayList;
import java.util.List;

public class CEO {

    public CEO(String name) {
        super(name);
}

    @Override
    public void seeDanger(HReporter_IF r, Hazard h) {
        List<Decision> decisions = new ArrayList<>();
        for (Employee admin: members) {
            if(admin instanceof Manager)
                decisions.addAll(((Manager)admin).suggestDecisions(h));
        }
        implementDecision(decisions);
    }
    private List<Decision> sortByPriority(List<Decision> ds){
        List<Decision> decisions = new ArrayList<>();
        while(!ds.isEmpty()){
            Decision topPriority = ds.remove(0);
            for (Decision d: ds){
                if(d.getPriority() > topPriority.getPriority())
                    topPriority = d;
            }
            decisions.add(topPriority);
        }
        return decisions;
    }


    public void implementDecision(List<Decision> ds){
        ds = sortByPriority(ds);
        int dsToBeExecuted = 2;
        while (!ds.isEmpty() && dsToBeExecuted-- > 0)
            ds.remove(0).execute(this);
    }

    public void report(){
        System.out.println("The city’s environmental department is notified");
    }
}

