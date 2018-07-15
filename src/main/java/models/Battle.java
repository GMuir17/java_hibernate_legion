package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "battles")
public class Battle {

    private int id;
    private Legion legion1;
    private Legion legion2;

    public Battle() {}

    public Battle(Legion legion1, Legion legion2) {
        this.legion1 = legion1;
        this.legion2 = legion2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
