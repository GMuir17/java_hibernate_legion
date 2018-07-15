package models;

import javax.persistence.*;

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

    @OneToOne
    @JoinColumn(name = "legion_id", nullable = false)
    public Legion getLegion1() {
        return legion1;
    }

    public void setLegion1(Legion legion1) {
        this.legion1 = legion1;
    }

    @OneToOne
    @JoinColumn(name = "legion_id", nullable = false)
    public Legion getLegion2() {
        return legion2;
    }

    public void setLegion2(Legion legion2) {
        this.legion2 = legion2;
    }
}
