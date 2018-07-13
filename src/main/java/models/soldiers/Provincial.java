package models.soldiers;

public class Provincial extends Soldier{

    private OriginType origin;

    public Provincial() {}

    public Provincial(String name, EquipmentType equipment, int yearsOfService, OriginType origin) {
        super(name, equipment, yearsOfService);
        this.origin = origin;
    }

    public OriginType getOrigin() {
        return origin;
    }

    public void setOrigin(OriginType origin) {
        this.origin = origin;
    }
}
