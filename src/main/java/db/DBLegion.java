package db;

import models.Legion;
import models.soldiers.Soldier;
import models.units.Unit;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBLegion {

    private static Session session;

    public static List<Unit> getUnitsInLegion(Legion legion) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Unit> results = null;
        try {
            Criteria cr = session.createCriteria(Unit.class);
            cr.add(Restrictions.eq("legion", legion));
            results = cr.list();
        }
        catch (HibernateException e) {
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return results;
    }

//    public static List<Soldier> getSoldiersInLegion(Legion legion) {
//        session = HibernateUtil.getSessionFactory().openSession();
//        List<Unit> units = getUnitsInLegion(legion);
//        List<Soldier> results = null;
//        try {
//            List<Soldier> unitSoldiers = null;
//            for (unit : units) {
//                Criteria cr = session.createCriteria(Soldier.class);
//                cr.add(Restrictions.eq("legion", legion));
//
//            }
//
//
//
//            Criteria cr = session.createCriteria(Soldier.class);
//            cr.add(Restrictions.eq("legion", legion));
//            results = cr.list();
//
//        }
//        catch (HibernateException e) {
//            e.printStackTrace();
//        }
//        finally {
//            session.close();
//        }
//        return results;
//    }

}
