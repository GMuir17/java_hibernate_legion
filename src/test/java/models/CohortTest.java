package models;

import models.soldiers.Centurion;
import models.soldiers.Citizen;
import models.units.Cohort;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CohortTest {

    Cohort cohort;
    Citizen citizen;
    Centurion centurion;

    @Before
    public void before() {
        this.centurion = new Centurion();
        this.citizen = new Citizen();
        this.cohort = new Cohort("banana");
    }

    @Test
    public void hasId() {
        assertEquals(0, cohort.getId());
    }

    @Test
    public void canSetId() {
        cohort.setId(25);
        assertEquals(25, cohort.getId());
    }

    @Test
    public void hasName() {
        assertEquals("banana", cohort.getName());
    }

    @Test
    public void canSetName() {
        cohort.setName("apples");
        assertEquals("apples", cohort.getName());
    }

    @Test
    public void canSetCenturion() {
        Centurion centurion2 = new Centurion();
        cohort.setCenturion(centurion2);
        assertEquals(centurion2, cohort.getCenturion());
    }

    @Test
    public void hasCitizens() {
        ArrayList<Citizen> results = new ArrayList<Citizen>();
        assertEquals(results, cohort.getSoldiers());
    }

    @Test
    public void canSetCitizens() {
        ArrayList<Citizen> results = new ArrayList<Citizen>();
        cohort.setSoldiers(results);
        assertEquals(results, cohort.getSoldiers());
    }

    @Test
    public void citizensListStartsEmpty() {
        assertEquals(0, cohort.getSoldiers().size());
    }

}
