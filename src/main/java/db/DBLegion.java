package db;

import models.Legion;
import models.soldiers.Soldier;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBLegion {

    private static Session session;

    public static List<Soldier> getSoldiersinLegion(Legion legion) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Soldier> results = null;
        try {
            Criteria cr = session.createCriteria(Soldier.class);
            cr.add(Restrictions.eq("id", legion.getId()));
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

}
