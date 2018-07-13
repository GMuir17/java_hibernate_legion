package models.units;

import models.Legion;
import models.soldiers.Provincial;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "auxiliaries")
public class Auxilia extends Unit {

    private List<Provincial> soldiers;

    public Auxilia() {}

    public Auxilia(String name, Legion legion) {
        super(name, legion);
        this.soldiers = new ArrayList<Provincial>();
    }

    //set up one to many relationship between auxilia and citizens
    @OneToMany(mappedBy = "auxilia", fetch = FetchType.LAZY)
    public List<Provincial> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(List<Provincial> soldiers) {
        this.soldiers = soldiers;
    }

}
