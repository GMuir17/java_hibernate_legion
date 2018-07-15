import db.DBBattle;
import db.DBCenturion;
import db.DBHelper;
import models.Battle;
import models.General;
import models.Legion;
import models.soldiers.*;
import models.units.Auxilia;
import models.units.Cohort;

import javax.persistence.GeneratedValue;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        //legions
        Legion legion = new Legion("The 13th");
        DBHelper.save(legion);

        Legion legion2 = new Legion("The 25th");
        DBHelper.save(legion2);

        //generals
        General general = new General("Julius Caesar", legion, 1000000);
        DBHelper.save(general);

        General general2 = new General("Pomey Magnus", legion2, 1000000);
        DBHelper.save(general2);

        //cohorts
        Cohort cohort1 = new Cohort("The 1st", legion);
        DBHelper.save(cohort1);
        Cohort cohort2 = new Cohort("The 3rd", legion);
        DBHelper.save(cohort2);

        Cohort cohort3 = new Cohort("The 5th", legion2);
        DBHelper.save(cohort3);
        Cohort cohort4 = new Cohort("The 4th", legion2);
        DBHelper.save(cohort4);

        //auxiliaries
        Auxilia auxilia1 = new Auxilia("5th Cohort of Espania", legion);
        DBHelper.save(auxilia1);
        Auxilia auxilia2 = new Auxilia("2nd Cohort of Gaul", legion);
        DBHelper.save(auxilia2);

        Auxilia auxilia3 = new Auxilia("5th Cohort of Syria", legion2);
        DBHelper.save(auxilia3);
        Auxilia auxilia4 = new Auxilia("2nd Cohort of Asia", legion2);
        DBHelper.save(auxilia4);

        //centurions
        Centurion centurion1 = new Centurion("Lucius Vorenus", EquipmentType.GLADIUS, 20, 95, cohort1);
        DBHelper.save(centurion1);
        Centurion centurion2 = new Centurion("Gaius Crastinus", EquipmentType.SHIELD, 15, 70, cohort2);
        DBHelper.save(centurion2);
        Centurion centurion3 = new Centurion("Appius Lutatius", EquipmentType.PILLA, 17, 85, auxilia1);
        DBHelper.save(centurion3);
        Centurion centurion4 = new Centurion("Potitus Avitus", EquipmentType.GLADIUS, 30, 100, auxilia2);
        DBHelper.save(centurion4);

        Centurion centurion5 = new Centurion("Tertias Micianus", EquipmentType.GLADIUS, 20, 95, cohort3);
        DBHelper.save(centurion5);
        Centurion centurion6 = new Centurion("Placus Sorex", EquipmentType.SHIELD, 15, 70, cohort4);
        DBHelper.save(centurion6);
        Centurion centurion7 = new Centurion("Plotius Nolus", EquipmentType.PILLA, 17, 85, auxilia3);
        DBHelper.save(centurion7);
        Centurion centurion8 = new Centurion("Marcellus Firmus", EquipmentType.GLADIUS, 30, 100, auxilia4);
        DBHelper.save(centurion8);

        //citizens
        Citizen citizen1 = new Citizen("Marcus", EquipmentType.GLADIUS, 4, cohort1);
        DBHelper.save(citizen1);
        Citizen citizen2 = new Citizen("Brutus", EquipmentType.SHIELD, 8, cohort1);
        DBHelper.save(citizen2);
        Citizen citizen3 = new Citizen("Gaius", EquipmentType.GLADIUS, 12, cohort2);
        DBHelper.save(citizen3);
        Citizen citizen4 = new Citizen("Quintus", EquipmentType.PILLA, 15, cohort2);
        DBHelper.save(citizen4);

        Citizen citizen5 = new Citizen("Cassius", EquipmentType.GLADIUS, 4, cohort3);
        DBHelper.save(citizen5);
        Citizen citizen6 = new Citizen("Gallus", EquipmentType.SHIELD, 8, cohort3);
        DBHelper.save(citizen6);
        Citizen citizen7 = new Citizen("Decimus", EquipmentType.GLADIUS, 12, cohort4);
        DBHelper.save(citizen7);
        Citizen citizen8 = new Citizen("Spurius", EquipmentType.PILLA, 15, cohort4);
        DBHelper.save(citizen8);

        //provincials
        Provincial provincial1 = new Provincial("Birgir", EquipmentType.PILLA, 18, auxilia1, OriginType.GOTH);
        DBHelper.save(provincial1);
        Provincial provincial2 = new Provincial("Hagamo", EquipmentType.PILLA, 3, auxilia1, OriginType.GOTH);
        DBHelper.save(provincial2);
        Provincial provincial3 = new Provincial("Drest", EquipmentType.GLADIUS, 10, auxilia1, OriginType.GAUL);
        DBHelper.save(provincial3);
        Provincial provincial4 = new Provincial("Vercingetorix", EquipmentType.SHIELD, 24, auxilia1, OriginType.GAUL);
        DBHelper.save(provincial4);

        Provincial provincial5 = new Provincial("Judocus", EquipmentType.PILLA, 18, auxilia3, OriginType.VANDAL);
        DBHelper.save(provincial5);
        Provincial provincial6 = new Provincial("Ritic", EquipmentType.PILLA, 3, auxilia3, OriginType.VANDAL);
        DBHelper.save(provincial6);
        Provincial provincial7 = new Provincial("Asterix", EquipmentType.GLADIUS, 10, auxilia4, OriginType.GAUL);
        DBHelper.save(provincial7);
        Provincial provincial8 = new Provincial("Obelix", EquipmentType.SHIELD, 24, auxilia4, OriginType.GAUL);
        DBHelper.save(provincial8);

        //battles
        Battle battle = new Battle("Battle of Dyrrhachium");
        DBHelper.save(battle);
        DBBattle.addLegionToBattle(battle, legion);
        DBBattle.addLegionToBattle(battle, legion2);

        //CRUD tests
        legion.setName("The 22nd");
        DBHelper.update(legion);

        DBHelper.delete(provincial4);

        List<Soldier> centurions = DBHelper.getAll(Centurion.class);

        Cohort foundCohort = DBHelper.findById(Cohort.class, cohort1.getId());

        Soldier foundSoldier = DBHelper.findByName(Centurion.class, "Gaius Crastinus");

        List<Centurion> sortedCenturions = DBCenturion.sortByPopularity();

        List<Legion> legionsInBattle = DBBattle.getLegionsInBattle(battle);



        //TODO: create DBGeneral with the method paySoldier(Soldier soldier) which takes money from General's budget and transfers to soldiers. Or maybe payUnit(Unit unit) which does the same thing to a unit before distributing it to soldiers??

        //TODO: change the battle/legion relationship to many to many
    }

}
