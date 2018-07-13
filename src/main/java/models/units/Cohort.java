package models.units;

import models.Legion;
import models.soldiers.Citizen;
import models.units.Unit;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cohorts")
public class Cohort extends Unit {

    private List<Citizen> soldiers;

    public Cohort() {}

    public Cohort(String name, Legion legion) {
        super(name, legion);
        this.soldiers = new ArrayList<Citizen>();
    }

    //TODO: set up one to many relationship between cohort and citizens
    public List<Citizen> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(List<Citizen> soldiers) {
        this.soldiers = soldiers;
    }
}
