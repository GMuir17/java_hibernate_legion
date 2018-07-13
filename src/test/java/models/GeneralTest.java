package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneralTest {

    General general;
    Legion legion;

    @Before
    public void before() {
        this.legion = new Legion("The 10th");
        this.general = new General("Agrippa", legion);
    }

    @Test
    public void hasId() {
        assertEquals(0, general.getId());
    }

    @Test
    public void canSetId() {
        general.setId(25);
        assertEquals(25, general.getId());
    }

    @Test
    public void hasName() {
        assertEquals("Agrippa", general.getName());
    }

    @Test
    public void canSetName() {
        general.setName("Brutus");
        assertEquals("Brutus", general.getName());
    }

    @Test
    public void hasLegion() {
        assertEquals(legion, general.getLegion());
    }

    @Test
    public void canSetLegion() {
        Legion legion2 = new Legion("Banana");
        general.setLegion(legion2);
        assertEquals(legion2, general.getLegion());
    }

}
