package salary;


public class Commissioned {


	private Sales[] sales;
	private int numberOfSales;
	private String payDay = "bi-weekly";
	private double wage;

	public Commissioned() {
		this.numberOfSales = 0;
	}
	
	public Commissioned(double wage){
		this();
		this.wage = wage;
	}
	
	public Commissioned(Sales sales){
		this.sales[this.numberOfSales] = sales;
	}
	
	public Sales[] getSales() {
		return sales;
	}

	public void setSales(Sales[] sales) {
		this.sales = sales;
	}

	public int getNumberOfSales() {
		return numberOfSales;
	}

	public void setNumberOfSales(int numberOfSales) {
		this.numberOfSales = numberOfSales;
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
