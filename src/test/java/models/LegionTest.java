package models;

import org.junit.Before;
import org.junit.Test;

import javax.persistence.Temporal;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LegionTest {

    Legion legion;
    General general;
    Unit unit;

    @Before
    public void before() {
        this.legion = new Legion("The 10th");
        this.general = new General("Agrippa", legion);
        this.unit = new Unit();
    }

    @Test
    public void hasId() {
        assertEquals(0, legion.getId());
    }

    @Test
    public void canSetId() {
        legion.setId(25);
        assertEquals(25, legion.getId());
    }

    @Test
    public void hasName() {
        assertEquals("The 10th", legion.getName());
    }

    @Test
    public void canSetName() {
        legion.setName("Bananas");
        assertEquals("Bananas", legion.getName());
    }

    @Test
    public void hasGeneral() {
        legion.setGeneral(general);
        assertEquals(general, legion.getGeneral());
    }

    @Test
    public void canSetGeneral() {
        General general2 = new General("Julius", legion);
        legion.setGeneral(general2);
        assertEquals(general2, legion.getGeneral());
    }

    @Test
    public void hasUnits() {
        ArrayList<Unit> results = new ArrayList<Unit>();
        assertEquals(results, legion.getUnits());
    }

    @Test
    public void canSetUnits() {
        ArrayList<Unit> results = new ArrayList<Unit>();
        legion.setUnits(results);
        assertEquals(results, legion.getUnits());
    }

    @Test
    public void unitsListStartsEmpty() {
        assertEquals(0, legion.getUnits().size());
    }

    @Test
    public void canAddUnit() {
        legion.addUnit(unit);
        assertEquals(1, legion.getUnits().size());
    }


}
