package MappingOnetoManyBiaDirectional;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AccountManyBia")
public class AccountEntity {
	@Id
private int accountid;
private BankAccount account;
@ManyToOne(cascade=CascadeType.ALL)
private CustomerEntity centity;
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
public CustomerEntity  getCentity() {
	return centity;
}
public void setCentity(CustomerEntity centity) {
	this.centity = centity;
}
@Override
public String toString() {
	return "AccountEntity [accountid=" + accountid + ", account=" + account + ", centity=" + centity + "]";
}
public AccountEntity(int accountid, BankAccount account, CustomerEntity centity) {
	super();
	this.accountid = accountid;
	this.account = account;
	this.centity = centity;
}
public AccountEntity() {
	super();
	// TODO Auto-generated constructor stub
}




}
