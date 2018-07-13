package models.units;

import models.soldiers.Provincial;

import java.util.ArrayList;
import java.util.List;

public class Auxilia extends Unit {

    private List<Provincial> soldiers;

    public Auxilia() {}

    public Auxilia(String name) {
        super(name);
        this.soldiers = new ArrayList<Provincial>();
    }

    public List<Provincial> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(List<Provincial> soldiers) {
        this.soldiers = soldiers;
    }

}
