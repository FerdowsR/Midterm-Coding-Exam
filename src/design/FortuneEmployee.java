package design;
import java.util.Scanner;
public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		class Employee {
			int id;
			String name;
			int sal;
			String department;
			String benefit;

		}

		class Main {
			public void main(String args[]) {

				Scanner sc = new Scanner(System.in);
				System.out.print("Enter How many employee:");
				int k = sc.nextInt();

				Employee emp[] = new Employee[k];

				for (int i = 0; i < k; i++) {
					emp[i] = new Employee();

					System.out.println("Enter " + (i + 1) + " Employee data :");

					System.out.print("Enter 500 employees id :");
					emp[i].id = sc.nextInt();
					System.out.print("Enter 500 employees name :");
					emp[i].name = sc.next();
					System.out.print("Enter 500 employees salary :");
					emp[i].sal = sc.nextInt();
					System.out.println("Enter 500 employees benefit");

				}

				System.out.println("\n\n============ All employee details are :============\n");

				for (int i = 0; i < k; i++) {
					System.out.println("Employee id  name and salary :" + emp[i].id + " " + emp[i].name + " " + emp[i].sal+" "+emp[i].department+" "+emp[i].benefit);

				}
			}

		}

		


	}

}
