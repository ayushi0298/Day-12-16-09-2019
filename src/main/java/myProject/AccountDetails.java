package myProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AccountDetails {
	
	@Override
	public String toString() {
		return "AccountDetails [accountNo=" + accountNo + ", bankName=" + bankName + ", bankBalance=" + bankBalance
				+"]";
	}
	@Id
	private int accountNo;
	private String bankName;
	private int bankBalance;
	
	@OneToOne(mappedBy="account")
	private Employee emp;
	
	public int getAccountNo() {
		return accountNo;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(int bankBalance) {
		this.bankBalance = bankBalance;
	}
	public AccountDetails() {
		super();
	}
	public AccountDetails(int accountNo, String bankName, int bankBalance) {
		super();
		this.accountNo = accountNo;
		this.bankName = bankName;
		this.bankBalance = bankBalance;
	}
	public AccountDetails(int accountNo) {
		super();
		this.accountNo = accountNo;
	}
	

}


