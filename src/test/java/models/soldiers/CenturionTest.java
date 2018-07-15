package models.soldiers;

import models.units.Auxilia;
import models.units.Cohort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CenturionTest {

    Centurion centurion;
    Cohort cohort;

    @Before
    public void before() {
        this.cohort = new Cohort();
        this.centurion = new Centurion("Marcus", EquipmentType.SHIELD, 20, 100, cohort);
    }

    @Test
    public void hasId() {
        assertEquals(0, centurion.getId());
    }

    @Test
    public void canSetId() {
        centurion.setId(25);
        assertEquals(25, centurion.getId());
    }

    @Test
    public void hasName() {
        assertEquals("Marcus", centurion.getName());
    }

    @Test
    public void canSetName() {
        centurion.setName("Bananas");
        assertEquals("Bananas", centurion.getName());
    }

    @Test
    public void hasEquipment() {
        assertEquals(EquipmentType.SHIELD, centurion.getEquipment());
    }

    @Test
    public void canSetEquipment() {
        centurion.setEquipment(EquipmentType.GLADIUS);
        assertEquals(EquipmentType.GLADIUS, centurion.getEquipment());
    }

    @Test
    public void hasYearsOfService() {
        assertEquals(20, centurion.getYearsOfService());
    }

    @Test
    public void canSetYearsOfService() {
        centurion.setYearsOfService(1);
        assertEquals(1, centurion.getYearsOfService());
    }

    @Test
    public void hasPopularity() {
        assertEquals(100, centurion.getPopularity());
    }

    @Test
    public void canSetPopularity() {
        centurion.setPopularity(5);
        assertEquals(5, centurion.getPopularity());
    }

    @Test
    public void hasUnit() {
        assertEquals(cohort, centurion.getUnit());
    }

    @Test
    public void canSetUnit() {
        Auxilia auxilia = new Auxilia();
        centurion.setUnit(auxilia);
        assertEquals(auxilia, centurion.getUnit());
    }

    @Test
    public void hasAvailability() {
        assertEquals(true, centurion.getAvailability());
    }

    @Test
    public void canSetAvailability() {
        centurion.setAvailability(false);
        assertEquals(false, centurion.getAvailability());
    }

    @Test
    public void canChangeAvailabilityToFalseWithoutSetter() {
        centurion.changeAvailabilityToFalse();
        assertEquals(false, centurion.getAvailability());
    }

    @Test
    public void hasPurse() {
        assertEquals(0, centurion.getPurse());
    }

    @Test
    public void canSetPurse() {
        centurion.setPurse(10);
        assertEquals(10, centurion.getPurse());
    }

    @Test
    public void canAddToPurse() {
        centurion.addToPurse(100);
        assertEquals(100, centurion.getPurse());
    }
}
