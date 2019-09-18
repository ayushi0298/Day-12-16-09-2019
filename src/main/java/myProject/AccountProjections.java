package myProject;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class AccountProjections {

	public static void main(String[] args) {
		SessionFactory sf = Util.getSF();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		ProjectionList plist = Projections.projectionList();
		Projection p1 = Projections.property("eno");
		Projection p2 = Projections.property("ename");
		plist.add(p1);
		plist.add(p2);
		cr.setProjection(plist);
		List<Object[]> li = cr.list();
		for (Object object[] : li) {
			for (Object obj : object) {
				System.out.println(obj);

			}
		}

	}

}
