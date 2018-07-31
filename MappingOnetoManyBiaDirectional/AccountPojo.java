package MappingOnetoManyBiaDirectional;

import java.util.List;

public class AccountPojo {
	private int accountid;
	private BankAccount account;
	private CustomerPojo cpojo;
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	public CustomerPojo getCpojo() {
		return cpojo;
	}
	public void setCpojo(CustomerPojo cpojo) {
		this.cpojo = cpojo;
	}
	@Override
	public String toString() {
		return "AccountPojo [accountid=" + accountid + ", account=" + account + ", cpojo=" + cpojo + "]";
	}
	public AccountPojo(int accountid, BankAccount account, CustomerPojo cpojo) {
		super();
		this.accountid = accountid;
		this.account = account;
		this.cpojo = cpojo;
	}
	public AccountPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
