package models.soldiers;

import models.units.Cohort;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "citizens")
public class Citizen extends Soldier {

    private Cohort cohort;

    public Citizen() {}

    public Citizen(String name, EquipmentType equipment, int yearsOfService, Cohort cohort) {
        super(name, equipment, yearsOfService);
        this.cohort = cohort;
    }

    @ManyToOne
    @JoinColumn(name = "cohort_id", nullable = false)
    public Cohort getCohort() {
        return cohort;
    }

    public void setCohort(Cohort cohort) {
        this.cohort = cohort;
    }
}
