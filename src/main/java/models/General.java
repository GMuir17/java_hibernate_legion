package models;

public class General {

    private int id;
    private String name;
    private Legion legion;

    public General() {}

    public General(String name, Legion legion) {
        this.name = name;
        this.legion = legion;
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

    public Legion getLegion() {
        return legion;
    }

    public void setLegion(Legion legion) {
        this.legion = legion;
    }
}
