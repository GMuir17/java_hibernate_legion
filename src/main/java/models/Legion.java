package models;

import models.units.Unit;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "legions")
public class Legion {

    private int id;
    private String name;
    private General general;
    private List<Unit> units;
    private List<Battle> battles;

    public Legion() {}

    public Legion(String name) {
        this.name = name;
        this.units = new ArrayList<Unit>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(mappedBy = "legion", fetch = FetchType.LAZY)
    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }

    @OneToMany(mappedBy = "legion", fetch = FetchType.LAZY)
    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public void addUnit(Unit unit) {
        this.units.add(unit);
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "legions")
    public List<Battle> getBattle() {
        return battles;
    }

    public void setBattle(List<Battle> battles) {
        this.battles = battles;
    }
}
