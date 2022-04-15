//Hazard.java
package src.Actions;

public class Hazard {

    /**
     * The type of hazard
     */
    private String type;

    /**
     * description
     */
    private String desp;

    /**
     * Level of seriousness
     */
    private int hazard_level;

    public Hazard(String type, String desp, int hazard_level) {
        this.type = type;
        this.desp = desp;
        this.hazard_level = hazard_level;
    }

    /**
     * get a string that describes this hazard
     * it will return complete hazard type and description
     */
    public String toString() {
        return String.format("%s Hazard - %s", type, desp);
    }

    /**
     * get the description of the hazard
     * and will return hazard description
     */
    public String getDesp() {
        return desp;
    }

    /**
     * get the seriousness of the hazard
     * it will return hazard level
     */
    public int getHazard_level() {
        return hazard_level;
    }
}