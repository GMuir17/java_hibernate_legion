package db;

import models.soldiers.Centurion;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBCenturion {

    private static Session session;

    public static List<Centurion> sortByPopularity() {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Centurion> results = null;
        try {
            Criteria cr = session.createCriteria(Centurion.class);
            cr.addOrder(Order.desc("popularity"));
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
