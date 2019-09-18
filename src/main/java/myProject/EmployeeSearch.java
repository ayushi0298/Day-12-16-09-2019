package myProject;
import org.hibernate.Session;

public class EmployeeSearch {

	public static void main(String[] args) {
		Session session=Util.getSF().openSession();
		Employee emp=session.get(Employee.class, 111);
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		System.out.println(emp.getLaptop().getCode());
		System.out.println(emp.getLaptop().getBrand());
		System.out.println(emp.getLaptop().getPrice());
		session.close();
	}

}