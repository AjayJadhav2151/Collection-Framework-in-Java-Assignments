public class Employee7{
	
	private int empid;
	private String name;
	private double salary;
	
	public Employee7() {	
		super();
	}

	public Employee7(int empid, String name ,double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}


	public int getEmpid() {
		return empid;
	}

	@Override
	public String toString() {
		return "\nEmployee id is: "+empid+"Employee name is: "+name+"Employee Salary is :"+salary;
	}
}

