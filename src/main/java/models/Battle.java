package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "battles")
public class Battle {

    private int id;
    private String name;
    private List<Legion> legions;

    public Battle() {}

    public Battle(String name) {
        this.name = name;
        this.legions = new ArrayList<Legion>();
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

    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "battles_legions",
            joinColumns = {@JoinColumn(name = "battle_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "legion_id", nullable = false, updatable = false)}
    )
    public List<Legion> getLegions() {
        return legions;
    }

    public void setLegions(List<Legion> legions) {
        this.legions = legions;
    }

    public void addLegion(Legion legion) {
        this.legions.add(legion);
    }
}
