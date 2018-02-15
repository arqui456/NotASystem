package salary;

public class Hourly {

	private static String payDay = "every week friday";
	private int workHours;
	private int extraHours;
	private double wage;
	
	public Hourly() {
		this.workHours = 0;
		this.extraHours  = 0;
	}
	
	public Hourly(double wage) {
		this();
		this.wage = wage;
	}
	
	public void setWorkHours(int workHours) {
		this.workHours += workHours;
	}
	
	public int getWorkHours(){
		return workHours;
	}

	public static String getPayDay() {
		return payDay;
	}

	public int getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(int extraHours) {
		this.extraHours += extraHours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public static void setPayDay(String payDay) {
		Hourly.payDay = payDay;
	}

	@Override
	public String toString() {
		return "Hourly [workHours=" + workHours + ", extraHours=" + extraHours
				+ "]";
	}

}
