package models.soldiers;

import models.units.Cohort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CitizenTest {

    Citizen citizen;
    Cohort cohort;

    @Before
    public void before() {
        this.cohort = new Cohort();
        this.citizen = new Citizen("Marcus", EquipmentType.SHIELD, 20, cohort);
    }

    @Test
    public void hasId() {
        assertEquals(0, citizen.getId());
    }

    @Test
    public void canSetId() {
        citizen.setId(25);
        assertEquals(25, citizen.getId());
    }

    @Test
    public void hasName() {
        assertEquals("Marcus", citizen.getName());
    }

    @Test
    public void canSetName() {
        citizen.setName("Bananas");
        assertEquals("Bananas", citizen.getName());
    }

    @Test
    public void hasEquipment() {
        assertEquals(EquipmentType.SHIELD, citizen.getEquipment());
    }

    @Test
    public void canSetEquipment() {
        citizen.setEquipment(EquipmentType.GLADIUS);
        assertEquals(EquipmentType.GLADIUS, citizen.getEquipment());
    }

    @Test
    public void hasYearsOfService() {
        assertEquals(20, citizen.getYearsOfService());
    }

    @Test
    public void canSetYearsOfService() {
        citizen.setYearsOfService(1);
        assertEquals(1, citizen.getYearsOfService());
    }

    @Test
    public void hasCohort() {
        assertEquals(cohort, citizen.getCohort());
    }

    @Test
    public void canSetCohort() {
        Cohort cohort2 = new Cohort();
        citizen.setCohort(cohort2);
        assertEquals(cohort2, citizen.getCohort());
    }

}
