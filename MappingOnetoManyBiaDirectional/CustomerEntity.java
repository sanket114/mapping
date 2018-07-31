package MappingOnetoManyBiaDirectional;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CustManyBia")
public class CustomerEntity {
	@Id
	private int id;
	private String name;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="centity")
	
	private List<AccountEntity> a;
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
	public List<AccountEntity> getA() {
		return a;
	}
	public void setA(List<AccountEntity> a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", a=" + a + "]";
	}
	public CustomerEntity(int id, String name, List<AccountEntity> a) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
	}
	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
