package myProject;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AccHQL {

	public static void main(String[] args) {
		SessionFactory sf = Util.getSF();
		Session session = sf.openSession();
		Criteria cr= session.createCriteria(Employee.class);
		String hql = "from Employee where eno> :eno";
		Query query = session.createQuery(hql);
		query.setParameter("eno",111);
		List<Employee> emplist = query.list();
		for (Employee emp : emplist) {
			System.out.println(emp);

		}

	}

}
