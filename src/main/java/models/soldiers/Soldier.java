package models.soldiers;

public abstract class Soldier {

    private int id;
    private String name;
    private EquipmentType equipment;
    private int yearsOfService;

    public Soldier() {}

    public Soldier(String name, EquipmentType equipment, int yearsOfService) {
        this.name = name;
        this.equipment = equipment;
        this.yearsOfService = yearsOfService;
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

    public EquipmentType getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentType equipment) {
        this.equipment = equipment;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }
}
