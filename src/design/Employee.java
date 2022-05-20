package design;

public interface Employee<emp_id> {
    static void raiseSalary(int i) {
    }

	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	//employeeId() will return employee id.
	public int employeeId();



	//employeeName() will return employee name
	public String employeeName();



	
	//assignDepartment() will assign employee to departments
    public void assignDepartment();
	
	//calculate employee salary
	public int calculateSalary();
	
	//employee benefit
	public void benefitLayout();

	}
class EmpolyeeDetails{
	String id;
	String name;
	String department;
	int salary;
	String benefit;

	public void Employee(){
	}
	public void Employee(String id, String name, String department, int salary, String benefit){
		this.id=id;
		this.name=name;
		this.department=department;
		this. salary=salary;
		this.benefit=benefit;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name=name;
}
public String getDepartment(){
		return department;
}

	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary(){
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getBenefit(){
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	@Override
	public String toString() {
		return "EmpolyeeDetails{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", department='" + department + '\'' +
				", salary=" + salary +
				", benefit='" + benefit + '\'' +
				'}';
	}
}




