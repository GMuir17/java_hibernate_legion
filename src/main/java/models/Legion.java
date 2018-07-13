package models;

import java.util.ArrayList;
import java.util.List;

public class Legion {

    private int id;
    private String name;
    private General general;
    private List<Unit> units;

    public Legion() {}

    public Legion(String name) {
        this.name = name;
        this.units = new ArrayList<Unit>();
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

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }
}
