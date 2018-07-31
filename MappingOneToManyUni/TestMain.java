package MappingOneToManyUni;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class TestMain {
public static void main(String[] args) {
	AccountPojo a1= new AccountPojo(12345, BankAccount.Saving);
	AccountPojo a2= new AccountPojo(12344, BankAccount.Saving);
	AccountPojo a3= new AccountPojo(12346, BankAccount.Saving);
	List<AccountPojo> l1=new ArrayList();
	l1.add(a1);
	l1.add(a2);
	l1.add(a3);
	CustomerPojo c1=new CustomerPojo(123, "Sanket", l1);
	Session s1= Utlity.getSession();
	Transaction t= s1.beginTransaction();
	s1.save(mapPojoToEntity(c1));
	s1.flush();
	t.commit();
	
}

private static CustomerPojo mapEntityToPojo(CustomerEntity userEntity){
	if(userEntity==null)
		return null;
	AccountPojo apojo=new AccountPojo();
	CustomerPojo pojo = new CustomerPojo();
	pojo.setId(userEntity.getId());
	pojo.setName(userEntity.getName());
	apojo.setAccount(((AccountPojo) userEntity.getA()).getAccount());
	apojo.setAccountid(((AccountPojo) userEntity.getA()).getAccountid());
	pojo.setA((List<AccountPojo>) apojo);
	
	return pojo;
}

private static CustomerEntity mapPojoToEntity(CustomerPojo userPojo){
	if(userPojo==null)
		return null;
	AccountEntity apojo=new AccountEntity();
	
	CustomerEntity pojo = new CustomerEntity();
	List<AccountPojo> lis=userPojo.getA();
	List<AccountEntity> las=new ArrayList<AccountEntity>();
	for(AccountPojo ap:lis) {
		las.add(mapPojoToEntityAddre(ap));
	}
	pojo.setId(userPojo.getId());
	pojo.setName(userPojo.getName());
	pojo.setA(las);
	
	
	return pojo;
}
private static AccountEntity mapPojoToEntityAddre(AccountPojo ap) {
	if(ap==null)
	return null;
	
	AccountEntity ae=new AccountEntity();
	ae.setAccount(ap.getAccount());
	ae.setAccountid(ap.getAccountid());
	
	return ae;
	
}

}
