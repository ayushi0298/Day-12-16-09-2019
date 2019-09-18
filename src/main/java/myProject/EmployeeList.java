	package myProject;

import java.util.List;

import org.hibernate.Criteria;

public class EmployeeList {

	public static void main(String[] args) {

			Criteria cr=Util.getSF().openSession().createCriteria(Employee.class);
			List<Employee> emps=cr.list();
			for(Employee emp:emps){
				System.out.println(emp.getEno());
				System.out.println(emp.getEname());
				System.out.println(emp.getSal());
				//System.out.println(emp.getLaptop().getCode());
				//System.out.println(emp.getLaptop().getBrand());
				//System.out.println(emp.getLaptop().getPrice());
				System.out.println("___________________________________");
			}
			

	}

}
