package models.units;

import models.Legion;
import models.soldiers.Centurion;

import javax.persistence.*;

@Entity
@Table(name = "units")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "unit_type")
public abstract class Unit {

    private int id;
    private String name;
    private Centurion centurion;
    private Legion legion;

    public Unit() {}

    public Unit(String name, Legion legion) {
        this.name = name;
        this.legion = legion;
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

    public Centurion getCenturion() {
        return centurion;
    }

    public void setCenturion(Centurion centurion) {
        this.centurion = centurion;
    }

    @ManyToOne
    @JoinColumn(name = "legion_id", nullable = false)
    public Legion getLegion() {
        return legion;
    }

    public void setLegion(Legion legion) {
        this.legion = legion;
    }
}
