package models.soldiers;

public class Centurion extends Soldier {

    private int popularity;

    public Centurion() {}

    public Centurion(String name, EquipmentType equipment, int yearsOfService, int popularity) {
        super(name, equipment, yearsOfService);
        this.popularity = popularity;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }
}
