package com.anudip.onetoone.congig;	
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.anudip.onetoone.entity.AddressProof;
import com.anudip.onetoone.entity.Employee;


public class HbUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/sys");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "Thanos@admin");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

				settings.put(Environment.SHOW_SQL, "true");

				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				settings.put(Environment.HBM2DDL_AUTO, "update");
                settings.put(Environment.ENABLE_LAZY_LOAD_NO_TRANS,"true");
                  
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Employee.class);
				configuration.addAnnotatedClass(AddressProof.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				System.out.println("Hibernate Java Config serviceRegistry created");
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				return sessionFactory;

			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}

	public static Session getSession()
	 {
		 return getSessionFactory().openSession(); 
	 }
	
}
