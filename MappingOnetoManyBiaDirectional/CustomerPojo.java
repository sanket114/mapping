package MappingOnetoManyBiaDirectional;

import java.util.List;

import javax.persistence.OneToOne;

import MappingOneToManyUni.AccountEntity;

public class CustomerPojo {
	private int id;
	private String name;
	
	private List<AccountPojo> a;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<AccountPojo> getA() {
		return a;
	}
	public void setA(List<AccountPojo> a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", a=" + a + "]";
	}
	public CustomerPojo(int id, String name, List<AccountPojo> a) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
	}
	public CustomerPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



}
