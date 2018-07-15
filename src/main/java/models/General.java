package models;

import javax.persistence.*;

@Entity
@Table(name = "generals")
public class General {

    private int id;
    private String name;
    private Legion legion;
    // TODO: add int budget which will be used to pay soldiers
    private int budget;

    public General() {}

    public General(String name, Legion legion, int budget) {
        this.name = name;
        this.legion = legion;
        this.budget = budget;
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "legion_id", nullable = false)
    public Legion getLegion() {
        return legion;
    }

    public void setLegion(Legion legion) {
        this.legion = legion;
    }

    @Column(name = "budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void addToBudget(int money) {
        this.budget += money;
    }

    public void removeFromBudget(int money) {
        this.budget -= money;
    }
}
