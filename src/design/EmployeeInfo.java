package design;

import jdk.internal.org.jline.utils.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeInfo {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private static Object sal;
	private double monthlySalary;

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public static void main(String[] args) {

		//Creating object of EployeeDetails class
		EmpolyeeDetails empolyeeDetails = new EmpolyeeDetails();
	}

	public EmployeeInfo(int employeeId) {
		final int employeeId1 = employeeId;


	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter employee salary:");
		String input1 = br.readLine();
		System.out.println("Enter bouns %:");
		String input2 = br.readLine();
		double salary = Double.parseDouble(input1);
		double bonus = Double.parseDouble(input2);
		double total = salary + bonus / 100 * salary;
		System.out.println(total);
		return numberOfYearsWithCompany;
	}

	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension() {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		//implement numbers of year from above two dates
		//Calculate pension


		return total;
	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
public static class Employee{
	private String fName;
	private String lName;
	private double monthlySalary;
	// constructor
	public Employee(String fName, String lName, double monthlySalary){ setFirstName(fName);
		setLastName(lName);
		setMonthlySalary(monthlySalary);
	}
	// setters
	public void setFirstName(String fName){
		this.fName = fName;
	}
	public void setLastName(String lName){
		this.lName = lName;
	}
	public void setMonthlySalary(double monthlySalary){
		if(monthlySalary > 0)
			this.monthlySalary = monthlySalary;
	}
	public void setRaise(double percentage){
		setMonthlySalary(monthlySalary += (monthlySalary / 100) * percentage);
	}
	// getters
	public String getFirstName(){
		return fName;
	}
	public String getLastName(){
		return lName;
	}
	public double getMonthlySalary(){
		return monthlySalary;
	}
	public double getYearlySalary(){
		return getMonthlySalary() * 12;
	}
}
    public class EmployeeTest{
		public void main(String[] args){
			Employee employee1 = new Employee("Frank", "Freddy", 1000);
			Employee employee2 = new Employee("Jack", "Jackson", 768);
			System.out.println("\nAfter 10% raises:\n");
			// set raises of 10%
			employee1.setRaise(10);
			printEmployee(employee1);

			employee2.setRaise(10);
			printEmployee(employee2);
		}
		private void printEmployee(Employee employee){ System.out.printf("%s %s: $%.2f per annum\n",
				employee.getFirstName(), employee.getLastName(), employee.getYearlySalary());
	}

	}
}
class EmployeeTest{
	public void main(String[] args){
		EmployeeInfo.Employee employee1 = new EmployeeInfo.Employee("Frank", "Freddy", 1000);
		EmployeeInfo.Employee employee2 = new EmployeeInfo.Employee("Jack", "Jackson", 768);
		System.out.println("\nAfter 5% raises:\n");
		// set raises of 5%
		employee1.setRaise(5);
		printEmployee(employee1);

		employee2.setRaise(5);
		printEmployee(employee2);
	}
	private void printEmployee(EmployeeInfo.Employee employee){ System.out.printf("%s %s: $%.2f per annum\n",
			employee.getFirstName(), employee.getLastName(), employee.getYearlySalary());
	}

}


