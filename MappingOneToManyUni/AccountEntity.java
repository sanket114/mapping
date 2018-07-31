package MappingOneToManyUni;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AccountMany")
public class AccountEntity {
	@Id
private int accountid;
private BankAccount account;
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
@Override
public String toString() {
	return "Account [accountid=" + accountid + ", account=" + account + "]";
}
public AccountEntity(int accountid, BankAccount account) {
	super();
	this.accountid = accountid;
	this.account = account;
}
public AccountEntity() {
	super();
	// TODO Auto-generated constructor stub
}



}
