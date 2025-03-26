
import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Assignment7 {

	public static void main(String[] args)  {
		
		Set <Employee7> Emp = new TreeSet<>(new Comparator<>() {
			public int compare(Employee7 e1, Employee7 e2) {
				int diff = 0;
				if(e1.getSalary() > e2.getSalary()) {
					diff = 1;}
				else if(e1.getSalary() < e2.getSalary()) {
					diff = -1;}
				else {
					diff = e1.getName().compareTo(e2.getName());
					if(diff==0) {
						diff=e1.getEmpid()-e2.getEmpid();}
				}
				return diff;}
		});
		
		Emp.add(new Employee7(1, "AAA", 1000));
		Emp.add(new Employee7(2, "BBB", 2000));
	    Emp.add(new Employee7(3, "CCC", 3000));
	    Emp.add(new Employee7(4, "DDD", 4000));
	    Emp.add(new Employee7(5, "EEE", 5000));
	    Emp.add(new Employee7(6, "FFF", 6000));
	    Emp.add(new Employee7(7, "GGG", 7000));
	    Emp.add(new Employee7(8, "HHH", 8000));
	    Emp.add(new Employee7(9, "III", 9000));
	    Emp.add(new Employee7(11,"JJJ", 1000));
	    Emp.add(new Employee7(12, "KKK", 2000));
	    Emp.add(new Employee7(13, "LLL", 3000));
	    Emp.add(new Employee7(14, "MMM", 4000));
	    Emp.add(new Employee7(15, "NNN", 5000));
	    Emp.add(new Employee7(16, "OOO", 6000));
	    Emp.add(new Employee7(17, "PPP", 7000));
	    Emp.add(new Employee7(18, "RRR", 8000));
	    Emp.add(new Employee7(19, "VVV", 9000));
	
	    for(Employee7 e : Emp) {
	    	System.out.println(e);
	    }
	}
}


