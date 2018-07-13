import db.DBHelper;
import models.General;
import models.Legion;
import models.soldiers.*;
import models.units.Auxilia;
import models.units.Cohort;

public class Runner {

    public static void main(String[] args) {

        //legions
        Legion legion = new Legion("The 10th");
        DBHelper.save(legion);

        //generals
        General general = new General("Julius Caesar", legion);
        DBHelper.save(general);

        //cohorts
        Cohort cohort1 = new Cohort("The 1st", legion);
        DBHelper.save(cohort1);
        Cohort cohort2 = new Cohort("The 3rd", legion);
        DBHelper.save(cohort2);

        //auxiliaries
        Auxilia auxilia1 = new Auxilia("5th Cohort of Britannia", legion);
        DBHelper.save(auxilia1);
        Auxilia auxilia2 = new Auxilia("2nd Cohort of Gaul", legion);
        DBHelper.save(auxilia2);

        //centurions
        Centurion centurion1 = new Centurion("Lucius Vorenus", EquipmentType.GLADIUS, 20, 95, cohort1);
        DBHelper.save(centurion1);
        Centurion centurion2 = new Centurion("Gaius Crastinus", EquipmentType.SHIELD, 15, 70, cohort2);
        DBHelper.save(centurion2);
        Centurion centurion3 = new Centurion("Appius Lutatius", EquipmentType.PILLA, 17, 85, auxilia1);
        DBHelper.save(centurion3);
        Centurion centurion4 = new Centurion("Potitus Avitus", EquipmentType.GLADIUS, 30, 100, auxilia2);
        DBHelper.save(centurion4);

        //citizens
        Citizen citizen1 = new Citizen("Marcus", EquipmentType.GLADIUS, 4, cohort1);
        DBHelper.save(citizen1);
        Citizen citizen2 = new Citizen("Brutus", EquipmentType.SHIELD, 8, cohort1);
        DBHelper.save(citizen2);
        Citizen citizen3 = new Citizen("Gaius", EquipmentType.GLADIUS, 12, cohort2);
        DBHelper.save(citizen3);
        Citizen citizen4 = new Citizen("Quintus", EquipmentType.PILLA, 15, cohort2);
        DBHelper.save(citizen4);

        //provincials
        Provincial provincial1 = new Provincial("Birgir", EquipmentType.PILLA, 18, auxilia1, OriginType.GOTH);
        DBHelper.save(provincial1);
        Provincial provincial2 = new Provincial("Hagamo", EquipmentType.PILLA, 3, auxilia1, OriginType.GOTH);
        DBHelper.save(provincial2);
        Provincial provincial3 = new Provincial("Drest", EquipmentType.GLADIUS, 10, auxilia1, OriginType.GAUL);
        DBHelper.save(provincial3);
        Provincial provincial4 = new Provincial("Vercingetorix", EquipmentType.SHIELD, 24, auxilia1, OriginType.GAUL);
        DBHelper.save(provincial4);


    }

}
