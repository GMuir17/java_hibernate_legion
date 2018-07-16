package db;

import models.soldiers.Soldier;
import models.units.Unit;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.awt.image.RescaleOp;
import java.util.List;

public class DBUnit {

    private static Session session;

    public static List<Soldier> getSoldiersInUnit(Unit unit) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Soldier> results = null;
        try {
            Criteria cr = session.createCriteria(Soldier.class);
            cr.add(Restrictions.eq("unit", unit));
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
