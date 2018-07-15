package models;

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

    @OneToMany(mappedBy = "battle", fetch = FetchType.LAZY)
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
