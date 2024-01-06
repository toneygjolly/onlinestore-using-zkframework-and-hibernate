package onlinezk;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.login_pojo;
import pojo.product_pojo;

import org.hibernate.query.Query;



public class mainjava {
	private SessionFactory fact;
	 private Session ses;
	 private Transaction tx;
	 private List<login_pojo> logincheck;
	 
	 public mainjava() {
		 fact = HibernateConnect.getSessionFactory();
		 logincheck=new ArrayList<login_pojo>();
	 }
	 public void insert() {
		 Session ses = fact.openSession();
	        ses.beginTransaction();
	        login_pojo lp=new login_pojo();
	        lp.setLoginid(1);
	        lp.setUsername("Toney");
	        lp.setPassword("Toney");
	        ses.save(lp);
	        ses.getTransaction().commit();
	 }
	 public List<login_pojo>logincheck(String name1,String pass){
		 Session ses = fact.openSession();
	        ses.beginTransaction();
//	        boolean found=false;
//	        Query query=ses.createQuery("select a from login_pojo a");
//	        List<login_pojo>check=query.list();
//	        for(login_pojo lp:check) {
//	        	if(lp.getUsername().contains(name1) && lp.getPassword().contains(pass)) {
//	        		logincheck.add(lp);
//	        		found=true;
//	        	}
//	        	else {
//	        		found=false;
//	        	}
//	        }
//		 return logincheck;
	        Query query = ses.createQuery("from login_pojo where username = :name and password = :pass");
	        query.setParameter("name", name1);
	        query.setParameter("pass", pass);
	        List<login_pojo> check = query.list();
	        ses.getTransaction().commit();
	        ses.close();
	        return check;
		 
	 }
	 public void insertproduct() {
		 Session ses = fact.openSession();
	        ses.beginTransaction();
	        product_pojo pp=new product_pojo();
	        pp.setProductid(1);
	        pp.setProductname("Nokia360");
	        pp.setPrice(5000);
	        pp.setAvailableQ(4.0);
	        pp.setCategory("Mobile");
	        ses.save(pp);
	        ses.getTransaction().commit();
	 }
	 
	 public static void main(String args []) {
		 mainjava mj=new mainjava();
		// mj.insert();
		 mj.insertproduct();
	 }
}
