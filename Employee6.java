

public class Employee6 implements Comparable<Employee6>{
	
	private int empid;
	private String name;
	private double salary;
	
	public Employee6() {	
		super();
	}

	@Override
	public int compareTo(Employee6 e) {
	
		int diff = 0;
		
		if(this.salary > e.salary) {
			diff = 1;
		}
		else if(this.salary < e.salary) {
			diff = -1;
		}
		else {
			diff = this.name.compareTo(e.name);
			if(diff==0) {
				diff=this.empid-e.empid;
			}
		}
		return diff;
	}

	public Employee6(int empid, String name ,double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return "\nEmployee id is: "+empid+"Employee name is: "+name+"Employee Salary is :"+salary;
	}
}
