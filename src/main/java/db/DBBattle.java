package db;

import models.Battle;
import models.Legion;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import java.util.ResourceBundle;

public class DBBattle {

    private static Session session;

    public static void addLegionToBattle(Battle battle, Legion legion) {
        battle.addLegion(legion);
        DBHelper.update(battle);
    }

    public static List<Legion> getLegionsInBattle(Battle battle) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Legion> results = null;
        try {
            Criteria cr = session.createCriteria(Legion.class);
            cr.createAlias("battles", "battle");
            cr.add(Restrictions.eq("battle.id", battle.getId()));
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
