package models;

import models.soldiers.Centurion;
import models.soldiers.Provincial;
import models.units.Auxilia;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AuxiliaTest {

    Auxilia auxilia;
    Provincial citizen;
    Centurion centurion;

    @Before
    public void before() {
        this.centurion = new Centurion();
        this.citizen = new Provincial();
        this.auxilia = new Auxilia("banana");
    }

    @Test
    public void hasId() {
        assertEquals(0, auxilia.getId());
    }

    @Test
    public void canSetId() {
        auxilia.setId(25);
        assertEquals(25, auxilia.getId());
    }

    @Test
    public void hasName() {
        assertEquals("banana", auxilia.getName());
    }

    @Test
    public void canSetName() {
        auxilia.setName("apples");
        assertEquals("apples", auxilia.getName());
    }

    @Test
    public void canSetCenturion() {
        Centurion centurion2 = new Centurion();
        auxilia.setCenturion(centurion2);
        assertEquals(centurion2, auxilia.getCenturion());
    }

    @Test
    public void hasProvincials() {
        ArrayList<Provincial> results = new ArrayList<Provincial>();
        assertEquals(results, auxilia.getSoldiers());
    }

    @Test
    public void canSetProvincials() {
        ArrayList<Provincial> results = new ArrayList<Provincial>();
        auxilia.setSoldiers(results);
        assertEquals(results, auxilia.getSoldiers());
    }

    @Test
    public void citizensListStartsEmpty() {
        assertEquals(0, auxilia.getSoldiers().size());
    }

}
