package myProject;

import org.hibernate.Session;

public class VehicleSearch {

	public static void main(String[] args) {
		Session session=Util.getSF().openSession();
		Vehicle ve=session.get(Vehicle.class, 100);
		System.out.println(ve.getRegno());
		System.out.println(ve.getBrand());
		System.out.println(ve.getModel());
		System.out.println(ve.getPrice());
		
		session.close();
	}

}
