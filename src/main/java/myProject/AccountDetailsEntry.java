package myProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AccountDetailsEntry {

	public static void main(String[] args) {
		SessionFactory sf = Util.getSF();
		Session session = sf.openSession();
		AccountDetails a1 = new AccountDetails(1000,"AXIS",300000);
		AccountDetails a2 = new AccountDetails(2000,"SBI",400000);
		AccountDetails a3 = new AccountDetails(3000,"HDFC",500000);

		Transaction tr = session.beginTransaction();
		session.save(a1); session.save(a2); session.save(a3);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");

	}
}

