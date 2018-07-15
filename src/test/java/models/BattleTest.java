package models;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BattleTest {

    Legion legion1;
    Legion legion2;
    Battle battle;

    @Before
    public void before() {
        this.legion1 = new Legion("The 13th");
        this.legion2 = new Legion("The 2nd");
        this.battle = new Battle("Test battle");
    }

   @Test
   public void legionListStartsEmpty() {
        assertEquals(0, battle.getLegions().size());
   }

   @Test
   public void canSetLegions() {
       battle.addLegion(legion1);
       battle.addLegion(legion2);
       assertEquals(2, battle.getLegions().size());
   }

    @Test
    public void hasId() {
        assertEquals(0, battle.getId());
    }

    @Test
    public void canSetId() {
        battle.setId(5);
        assertEquals(5, battle.getId());
    }

    @Test
    public void hasName() {
        assertEquals("Test battle", battle.getName());
    }

    @Test
    public void canSetName() {
        battle.setName("Banana");
        assertEquals("Banana", battle.getName());
    }
}
