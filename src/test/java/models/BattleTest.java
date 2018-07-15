package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattleTest {

    Legion legion1;
    Legion legion2;
    Battle battle;

    @Before
    public void before() {
        this.legion1 = new Legion("The 13th");
        this.legion2 = new Legion("The 2nd");
        this.battle = new Battle(legion1, legion2);
    }

    @Test
    public void hasLegion1() {
        assertEquals(legion1, battle.getLegion1());
    }

    @Test
    public void canSetLegion1() {
        Legion testLegion = new Legion("Test");
        battle.setLegion1(testLegion);
        assertEquals(testLegion, battle.getLegion1());
    }

    @Test
    public void hasLegion2() {
        assertEquals(legion2, battle.getLegion2());
    }

    @Test
    public void canSetLegion2() {
        Legion testLegion = new Legion("Test");
        battle.setLegion2(testLegion);
        assertEquals(testLegion, battle.getLegion2());
    }
}
