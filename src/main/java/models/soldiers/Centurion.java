package models.soldiers;

import models.units.Unit;

import javax.persistence.*;

@Entity
@Table(name = "centurion")
public class Centurion extends Soldier {

    private int popularity;
    private Unit unit;

    public Centurion() {}

    public Centurion(String name, EquipmentType equipment, int yearsOfService, int popularity, Unit unit) {
        super(name, equipment, yearsOfService);
        this.popularity = popularity;
        this.unit = unit;
    }

    @Column(name = "popularity")
    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unit_id", nullable = false)
    public Unit getUnit() {
        return this.unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
