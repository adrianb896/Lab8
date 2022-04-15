package hazardControl;

public class Manager {
    public void setSuccessor(Manager successor) {};

    public void handleRequest(Request request) {
        System.out.println("CEO's can approve anything they want");
        if(request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors can approve conference");
        }
        else {
            successor.handleRequest(request);
        }
        if(request.getRequestType() == RequestType.PURCHASE) {
            if(request.getAmount() < 1500) {
                System.out.println("VP's can approve purchases below 1500");
            }
            else {
                successor.handleRequest(request);
            }
        }
    }


    public class seeDanger(r: HReporter_IF; h:Hazard) {
        Boolean reportToCEO = true;
        for (each e: members) {
            DirectAdministrator d = (DirectAdministrator.e);


        }
    }
}
