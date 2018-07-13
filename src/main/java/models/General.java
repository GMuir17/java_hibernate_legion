package models;

import javax.persistence.*;

@Entity
@Table(name = "generals")
public class General {

    private int id;
    private String name;
    private Legion legion;

    public General() {}

    public General(String name, Legion legion) {
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "legion_id", nullable = false)
    public Legion getLegion() {
        return legion;
    }

    public void setLegion(Legion legion) {
        this.legion = legion;
    }
}
