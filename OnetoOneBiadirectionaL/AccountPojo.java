package Mapping1to1.OnetoOneBiadirectionaL;

public class AccountPojo {
	private int accountid;
	private BankAccount account;
	private CustomerPojo c;
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
	public CustomerPojo getC() {
		return c;
	}
	public void setC(CustomerPojo c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", account=" + account + ", c=" + c + "]";
	}
	public AccountPojo(int accountid, BankAccount account, CustomerPojo c) {
		super();
		this.accountid = accountid;
		this.account = account;
		this.c = c;
	}
	public AccountPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
}
