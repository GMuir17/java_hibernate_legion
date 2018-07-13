package models.soldiers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProvincialTest {

    Provincial provincial;

    @Before
    public void before() {
        this.provincial = new Provincial("Marcus", EquipmentType.SHIELD, 20, OriginType.GOTH);
    }

    @Test
    public void hasId() {
        assertEquals(0, provincial.getId());
    }

    @Test
    public void canSetId() {
        provincial.setId(25);
        assertEquals(25, provincial.getId());
    }

    @Test
    public void hasName() {
        assertEquals("Marcus", provincial.getName());
    }

    @Test
    public void canSetName() {
        provincial.setName("Bananas");
        assertEquals("Bananas", provincial.getName());
    }

    @Test
    public void hasEquipment() {
        assertEquals(EquipmentType.SHIELD, provincial.getEquipment());
    }

    @Test
    public void canSetEquipment() {
        provincial.setEquipment(EquipmentType.GLADIUS);
        assertEquals(EquipmentType.GLADIUS, provincial.getEquipment());
    }

    @Test
    public void hasYearsOfService() {
        assertEquals(20, provincial.getYearsOfService());
    }

    @Test
    public void canSetYearsOfService() {
        provincial.setYearsOfService(1);
        assertEquals(1, provincial.getYearsOfService());
    }

    @Test
    public void hasOrigin() {
        assertEquals(OriginType.GOTH, provincial.getOrigin());
    }

    @Test
    public void canSetOrigin() {
        provincial.setOrigin(OriginType.VANDAL);
        assertEquals(OriginType.VANDAL, provincial.getOrigin());
    }
}
