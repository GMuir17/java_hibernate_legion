package models.soldiers;

import models.units.Auxilia;

import javax.persistence.*;

@Entity
@Table(name = "provincials")
public class Provincial extends Soldier{

    private Auxilia auxilia;
    private OriginType origin;

    public Provincial() {}

    public Provincial(String name, EquipmentType equipment, int yearsOfService, Auxilia auxilia, OriginType origin) {
        super(name, equipment, yearsOfService);
        this.auxilia = auxilia;
        this.origin = origin;
    }

    @ManyToOne
    @JoinColumn(name = "auxilia_id", nullable = false)
    public Auxilia getAuxilia() {
        return auxilia;
    }

    public void setAuxilia(Auxilia auxilia) {
        this.auxilia = auxilia;
    }

    @Enumerated(value = EnumType.STRING)
    @Column(name = "origin")
    public OriginType getOrigin() {
        return origin;
    }

    public void setOrigin(OriginType origin) {
        this.origin = origin;
    }
}
