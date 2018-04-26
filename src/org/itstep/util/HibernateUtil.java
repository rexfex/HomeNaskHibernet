package org.itstep.util;

import java.io.File;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.itstep.model.Account;
import org.itstep.model.Good;
import org.itstep.model.GoodAction;

public class HibernateUtil {

 private static final SessionFactory sessionFactory = configureSessionFactory();

 private static SessionFactory configureSessionFactory() throws HibernateException {

 Configuration configuration = new Configuration();
 
 configuration.addAnnotatedClass(Good.class);
 configuration.addAnnotatedClass(Account.class);
 configuration.addAnnotatedClass(GoodAction.class);
 
 return configuration.buildSessionFactory();

 }

 public static SessionFactory getSessionFactory() {
 return sessionFactory;
 }
}