package employee;

import salary.Type;
import sindicate.Sindicate;

public class Employee {
	
	private int id;
	private String name;
	private String adress;
	private Type type;
	private Sindicate sindicate;
	

	public Employee() {
		this.id++;
	}
	
	public Employee(String name, String adress) {
		this();
		this.name = name;
		this.adress = adress;
	}
	
	public Employee(String name, String adress, Type type){
		this(name, adress);
		this.type = type;
	}
	
	public Employee(String name, String adress,Type type, boolean isSindicated){
		this(name, adress,type);
		if(isSindicated == true){
			this.sindicate = new Sindicate();
		}
	}
	
	public Employee(String name, String adress, Type type, Sindicate sindicate){
		this(name, adress,type);
		this.sindicate = sindicate;
	}

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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Sindicate getSindicate() {
		return sindicate;
	}

	public void setSindicate(Sindicate sindicate) {
		this.sindicate = sindicate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + adress
				+ ", type=" + type + "]";
	}
}

