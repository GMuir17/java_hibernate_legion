package models.units;

import models.soldiers.Centurion;

public abstract class Unit {

    private int id;
    private String name;
    private Centurion centurion;

    public Unit() {}

    public Unit(String name) {
        this.name = name;
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

    public Centurion getCenturion() {
        return centurion;
    }

    public void setCenturion(Centurion centurion) {
        this.centurion = centurion;
    }
}
