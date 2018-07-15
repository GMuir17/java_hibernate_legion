package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "battles")
public class Battle {

    private int id;
    private String name;
    private Legion legion1;
    private Legion legion2;

    public Battle() {}

    public Battle(String name, Legion legion1, Legion legion2) {
        this.name = name;
        this.legion1 = legion1;
        this.legion2 = legion2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Legion getLegion1() {
        return legion1;
    }

    public void setLegion1(Legion legion1) {
        this.legion1 = legion1;
    }

    public Legion getLegion2() {
        return legion2;
    }

    public void setLegion2(Legion legion2) {
        this.legion2 = legion2;
    }
}
