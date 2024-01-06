package onlinezk;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.login_pojo;
import pojo.product_pojo;




public class HibernateConnect {
	private static SessionFactory sesfact;

	private HibernateConnect() {
       
        sesfact = new Configuration().configure("Hiber.cfg.xml")
        		.addAnnotatedClass(login_pojo.class).addAnnotatedClass(product_pojo.class).buildSessionFactory();
        System.out.println("Session factory created!");

    }

	public static SessionFactory getSessionFactory() {
		if (sesfact == null) {
			new HibernateConnect();
			return sesfact;
		} else {
			return sesfact;
		}

	}
	// public static void main(String[] args) {
	// HibernateConnect.getSessionFactory();
	// }

}
