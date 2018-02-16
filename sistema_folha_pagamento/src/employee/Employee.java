package employee;

import java.util.ArrayList;

import salary.Type;
import sindicate.Sindicate;

public class Employee {
	
	private int id;
	private String name;
	private String adress;
	private Type type;
	private Sindicate sindicate;
	private ArrayList<Card> card = new ArrayList<Card>();
	private String payday;
	private ServiceTax tax;
	

	public Employee() {
		
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
	
	public void setSindicate() {
		this.sindicate = new Sindicate();
	}

	public void setSindicate(Sindicate sindicate) {
		this.sindicate = sindicate;
	}
	
	public ArrayList<Card> getCard() {
		return card;
	}

	public void setCard(ArrayList<Card> card) {
		this.card = card;
	}
	
	public void addCard(Card card) {
		this.card.add(card);
	}
	
	public String getPayday() {
		return payday;
	}

	public void setPayday(String payday) {
		this.payday = payday;
	}
	
	public ServiceTax getTax() {
		return tax;
	}

	public void setTax(ServiceTax tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + adress
				+ ", type=" + type + "]";
	}
}

