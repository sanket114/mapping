package Mapping1to1.OnetoOneBiadirectionaL;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestMain {
public static void main(String[] args) {
	AccountEntity a1= new AccountEntity(12345, BankAccount.Saving,null);
	CustomerEntity c1=new CustomerEntity(123, "Sanket", null);
	
	a1.setC(c1);
	c1.setA(a1);
	
	Session s1= Utlity.getSession();
	Transaction t= s1.beginTransaction();
	s1.save(a1);
	//s1.save(c1);
	s1.flush();
	t.commit();
	
}
}
