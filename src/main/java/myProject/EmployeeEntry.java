package myProject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeEntry {

	public static void main(String[] args) {
		SessionFactory sf=Util.getSF();
		Session session=sf.openSession();
	
		Employee e1=new Employee(111,"AAA",50000, new Laptop("L111"), new AccountDetails(1000),new Vehicle(100));
		Employee e2=new Employee(112,"BBB",60000, new Laptop("L112"),new AccountDetails(2000),new Vehicle(200));
		Employee e3=new Employee(113,"CCC",70000, new Laptop("L113"),new AccountDetails(3000),new Vehicle(300));
		
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2);
		session.save(e3); 
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");
	}

}