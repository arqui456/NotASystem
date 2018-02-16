package salary;

import java.util.ArrayList;

public class Commissioned {

	private ArrayList<Sales> sales = new ArrayList<Sales>();
	private int numberOfSales;
	private double wage;

	public Commissioned() {
		this.numberOfSales = 0;
	}
	
	public Commissioned(double wage){
		this();
		this.wage = wage;
	}
	
	public Commissioned(Sales sales){
		this.sales.add(sales);
	}
	
	public int getNumberOfSales() {
		return numberOfSales;
	}

	public void setNumberOfSales(int numberOfSales) {
		this.numberOfSales = numberOfSales;
	}
	
	public void addSale(Sales sale) {
		this.sales.add(sale);
	}
	
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
}
