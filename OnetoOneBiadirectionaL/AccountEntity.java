package Mapping1to1.OnetoOneBiadirectionaL;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class AccountEntity {
	@Id
private int accountid;
private BankAccount account;
@OneToOne(cascade=CascadeType.ALL)
private CustomerEntity c;
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
public CustomerEntity getC() {
	return c;
}
public void setC(CustomerEntity c) {
	this.c = c;
}
@Override
public String toString() {
	return "Account [accountid=" + accountid + ", account=" + account + ", c=" + c + "]";
}
public AccountEntity(int accountid, BankAccount account, CustomerEntity c) {
	super();
	this.accountid = accountid;
	this.account = account;
	this.c = c;
}
public AccountEntity() {
	super();
	// TODO Auto-generated constructor stub
}


}
