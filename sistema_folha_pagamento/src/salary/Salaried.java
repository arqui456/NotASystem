package salary;

public class Salaried {
	
	private String payDay = "every month's last day";
	private double wage;

	public Salaried() {
		this.wage = 0;
	}
	
	public Salaried(double wage){
		this.wage = wage;
	}

	public String getPayDay() {
		return payDay;
	}

	public void setPayDay(String payDay) {
		this.payDay = payDay;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
}
