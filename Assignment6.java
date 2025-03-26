//6 Create a tree set for Emp objects where Emp objects should be arranged on the basis of
//increasing salary.
import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Assignment6 {

	public static void main(String[] args)  {
		
		Set <Employee6> Emp = new TreeSet<>();
		
		Emp.add(new Employee6(1, "AAA", 1000));
		Emp.add(new Employee6(2, "BBB", 2000));
	    Emp.add(new Employee6(3, "CCC", 3000));
	    Emp.add(new Employee6(4, "DDD", 4000));
	    Emp.add(new Employee6(5, "EEE", 5000));
	    Emp.add(new Employee6(6, "FFF", 6000));
	    Emp.add(new Employee6(7, "GGG", 7000));
	    Emp.add(new Employee6(8, "HHH", 8000));
	    Emp.add(new Employee6(9, "III", 9000));
	    Emp.add(new Employee6(11,"JJJ", 1000));
	    Emp.add(new Employee6(12, "KKK", 2000));
	    Emp.add(new Employee6(13, "LLL", 3000));
	    Emp.add(new Employee6(14, "MMM", 4000));
	    Emp.add(new Employee6(15, "NNN", 5000));
	    Emp.add(new Employee6(16, "OOO", 6000));
	    Emp.add(new Employee6(17, "PPP", 7000));
	    Emp.add(new Employee6(18, "RRR", 8000));
	    Emp.add(new Employee6(19, "VVV", 9000));
	
	    for(Employee6 e : Emp) {
	    	System.out.println(e);
	    }
	}
}

