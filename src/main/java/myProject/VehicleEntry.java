package myProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class VehicleEntry {

	public static void main(String[] args) {
		SessionFactory sf = Util.getSF();
		Session session = sf.openSession();

		Vehicle v1 = new Vehicle(100, "BMW", "ABC", 100000);
		Vehicle v2 = new Vehicle(200, "MARUTI", "DEF", 200000);
		Vehicle v3 = new Vehicle(300, "MERCEDES", "GHI", 300000);

		Transaction tr = session.beginTransaction();
		session.save(v1);
		session.save(v2);
		session.save(v3);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");

	}

}
