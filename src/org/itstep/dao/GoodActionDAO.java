package org.itstep.dao;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.itstep.model.GoodAction;
import org.itstep.util.HibernateUtil;

public class GoodActionDAO {

 private Session session;

 public void save(GoodAction goodAction) {

 session = HibernateUtil.getSessionFactory().openSession();

 session.getTransaction().begin();

 session.save(goodAction);

 session.getTransaction().commit();

 session.close();
 }

 
 
 public List<GoodAction> getByAccountAndGood(String acclogin, String goodAsin) {

 session = HibernateUtil.getSessionFactory().openSession();

 session.getTransaction().begin();

 Query query = session.createNativeQuery("SELECT * FROM good_actions WHERE account_login= :acc_login AND good_asin= :asin",
 GoodAction.class);

 query.setParameter("acc_login", acclogin);

 query.setParameter("asin", goodAsin);

 List<GoodAction> result = query.getResultList();

 session.getTransaction().commit();

 session.close();

 return result;
 }

 
 public void update(String asin, GoodAction newgoodsAction) {
	 
	 session = HibernateUtil.getSessionFactory().openSession();

	 session.getTransaction().begin(); 
	 
	 Query query = session.createQuery("UPDATE GoodAction.class SET  actionTime =:1, login=:2, asin=:3, added_to_wl=:4,added_to_cart=:5 WHERE asin=:6");
	 
	 query.setParameter(1, newgoodsAction.getTimeAction());
	 query.setParameter(2, newgoodsAction.getLogin());
	 query.setParameter(3, newgoodsAction.getAsin());
	 query.setParameter(4, newgoodsAction.getAdded_to_wl());
	 query.setParameter(5, newgoodsAction.getAdded_to_cart());
	 query.setParameter(6, asin);
	 
	 session.getTransaction().commit();

	 session.close();
	 
 }
 
 
 public void delete(GoodAction goodAction) {
 session = HibernateUtil.getSessionFactory().openSession();

 session.getTransaction().begin();

 session.delete(goodAction);

 session.getTransaction().commit();

 session.close();

 }
}