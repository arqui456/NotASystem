package main;

import java.util.Scanner;

import employee.Employee;
import employee.EmployeesManager;
import salary.Salary;
import salary.Type;

public class Main {

	private static Scanner inputator = new Scanner(System.in);
	
	
	private static boolean menu(){
		
		System.out.println("Possible actions: ");
		System.out.println("    1. Add a employee");
		System.out.println("    2. Remove a employee");
		System.out.println("    3. Launch a point card");
		System.out.println("    4. Launch a sales result");
		System.out.println("    5. Launch a service tax");
		System.out.println("    6. alter a employee data");
		System.out.println("    7. Execute payroll");
		System.out.println("    8. Undo/redo");
		System.out.println("    9. create a payroll");
		System.out.println("    10. Exit program");
		
		int input = inputator.nextInt();
		
		while(input <= 0 || input > 10){
			System.out.println("Invalid input, try again");
			input = inputator.nextInt();
		}
		boolean exit = false;
		switch(input){
			case 1:
				addEmployee();
				break;
			case 2:
				remEmployee();
				break;
			case 3:
				launchCard();
				break;
			case 4:
				launchsale();
				break;
			case 5:
				launchServiceTax();
				break;
			case 6:
				altEmployee();
				break;
			case 7:
				excPayroll();
				break;
			case 8:
				Undo();
				break;
			case 9:
				createPayroll();
				break;
			case 10:
				System.out.println("Exit program...");
				exit = true;
				break;
		}
		
		return exit;
	}
	
	private static void addEmployee(){
		System.out.println("Type in the employee's name: ");
		String name = inputator.nextLine();
		System.out.println("Type in the employee's adress: ");
		String adress = inputator.nextLine();
		System.out.println("Select a type of payment for the employee: ");
		System.out.println("    1.Hourly wage");
		System.out.println("    2.Salaried");
		System.out.println("    3.Commissioned");
		
		int choice = inputator.nextInt();
		while(choice < 1 || choice > 3) {
			System.out.println("Invalid input, try again: ");
			choice = inputator.nextInt();
		}
		
		System.out.println("WARNING! defaults pay dates will be used according to the contract");
		System.out.println("Type in the employee's wage: ");
		double wage = inputator.nextDouble();
		Type type = new Type(choice, wage);
		
		Employee employee = new Employee(name, adress, type);
		
		EmployeesManager manager = new EmployeesManager();
		manager.AddEmployee(employee);
	}
	
	private static void remEmployee(){
		
	}
	
	private static void launchCard(){
		
	}
	
	private static void launchsale(){
		
	}
	
	private static void launchServiceTax(){
		
	}
	
	private static void altEmployee(){
		
	}
	
	private static void excPayroll(){
		
	}
	
	private static void Undo(){
		
	}
	
	private static void createPayroll(){
		
	}
	
	
	
	public static void main(String[] args) {
		boolean exit = menu();
		

	}

}

