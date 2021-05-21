package Autos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreAuto {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		Auto a=new Auto();
		a.setAutoId(1);
		a.setRedgno("AP27BA8441");
		a.setOwnerName("Nithesh");
		a.setYear(2021);
		session.save(a);
		tx.commit();
		System.out.println("Auto details saved successfully");
		
	}

}
