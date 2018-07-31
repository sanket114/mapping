package MappingOnetoManyBiaDirectional;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class TestMain {
public static void main(String[] args) {
	AccountPojo a1= new AccountPojo(12345, BankAccount.Saving,null);
	AccountPojo a2= new AccountPojo(12344, BankAccount.Saving,null);
	AccountPojo a3= new AccountPojo(12346, BankAccount.Saving,null);
	List<AccountPojo> l1=new ArrayList();
	
	l1.add(a2);
	l1.add(a3);
	List<AccountPojo> l2=new ArrayList();
	l2.add(a1);
	CustomerPojo c1=new CustomerPojo(123, "Sanket", null);
	CustomerPojo c2=new CustomerPojo(124, "Sanket", null);
	CustomerPojo c3=new CustomerPojo(125, "Sanket", null);
	CustomerPojo c4=new CustomerPojo(126, "Sanket", null);
	
	
	
	a1.setCpojo(c1);
	a2.setCpojo(c2);
	a3.setCpojo(c3);
	
	c1.setA(l1);
	c2.setA(l2);
	c3.setA(l1);
	c4.setA(l2);
	
	
	
	Session s1= Utlity.getSession();
	Transaction t= s1.beginTransaction();
	s1.save(mapPojoToEntity(c1));
	s1.save(mapPojoToEntity(c2));
	s1.save(mapPojoToEntity(c3));
	s1.save(mapPojoToEntity(c4));
	//s1.save(mapPojoToEntity(a1));
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
	CustomerEntity centity=new CustomerEntity();
	AccountEntity ae=new AccountEntity();
	ae.setAccount(ap.getAccount());
	ae.setAccountid(ap.getAccountid());
	ae.setCentity(centity);
	return ae;
	
}
private static AccountEntity mapPojoToEntityAddress(AccountPojo ap) {
	if(ap==null)
	return null;
	CustomerEntity centity=new CustomerEntity();
	AccountEntity ae=new AccountEntity();
	ae.setAccount(ap.getAccount());
	ae.setAccountid(ap.getAccountid());
	ae.setCentity(mapPojoToEntity(ap.getCpojo()));
	return ae;
	
}




}
