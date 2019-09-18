package myProject;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class AccDetailsQBC {
	public static void main(String[] args) {
		//ACCOUNT DETAILS USING QBC
		Criteria cr= Util.getSF().openSession().createCriteria(Employee.class);
		
		Order o1= Order.asc("sal");
		cr.addOrder(o1);
		Criterion c1= Restrictions.between("sal", 100,30000);
		cr.add(c1);
		List<Employee> accs= cr.list();
		for(Employee acc:accs) {
			//System.out.println(acc);
			System.out.println(acc.getEno());
			System.out.println(acc.getEname());
			System.out.println(acc.getSal());
			System.out.println("________________________");
		}
		

	}

}
