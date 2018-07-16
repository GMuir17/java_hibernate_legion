package db;

import models.General;
import models.soldiers.Soldier;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBGeneral {

    private static Session session;

    public static void paySoldier(General general, int pay, Soldier soldier) {
        general.paySoldier(pay, soldier);
        DBHelper.update(general);
        DBHelper.update(soldier);
    }

    //TODO: find out how to got through the general's legion to get his soldiers
//    public static List<Soldier> getSoldiersOfGeneral(General general) {
//        session = HibernateUtil.getSessionFactory().openSession();
//        List<Soldier> results = null;
//        try {
//            Criteria cr = session.createCriteria(Soldier.class);
//            cr.add(Restrictions.eq("id", general.getId()));
//            results = cr.list();
//        }
//        catch (HibernateException e) {
//            e.printStackTrace();
//        }
//        finally {
//         session.close();
//        }
//        return results;
//    }


}
