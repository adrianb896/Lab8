package src.Personel;

import src.Actions.Hazard;

public interface IReporterHazard {
    public void seeDanger(IReporterHazard reporter, Hazard hazard);
    public void setDirectOverseer(IReporterHazard director);
    public IReporterHazard getDirectOverseer();
}