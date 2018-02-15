package salary;



public class Type {
	
	private Object type;
	
	public Type(int typeIndex, double wage) {
		
		if(typeIndex == 1) 
			this.type = new Hourly(wage);
		else if(typeIndex == 2)
			this.type = new Salaried(wage);
		else
			this.type = new Commissioned(wage);	
	}

	public Object getType() {
		return type;
	}

	public void setType(Object type) {
		this.type = type;
	}
}
