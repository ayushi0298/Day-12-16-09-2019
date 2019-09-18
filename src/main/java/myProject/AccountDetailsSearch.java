package myProject;

import org.hibernate.Session;

public class AccountDetailsSearch {

	public static void main(String[] args) {
		Session session = Util.getSF().openSession();
		AccountDetails acc = session.get(AccountDetails.class, 1000);
		System.out.println(acc.getAccountNo());
		System.out.println(acc.getBankName());
		System.out.println(acc.getBankBalance());
		System.out.println(acc.getEmp().getEno());
		System.out.println(acc.getEmp().getEname());
		System.out.println(acc.getEmp().getSal());
		session.close();
	}

}