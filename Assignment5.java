//5 Create a Student entity for storing information like studentid, name, city, percentage. 
//Generate hashCode based on city. Create HashSet of 5 students and observe how the students 
//are arranged in the hashset collection.

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Assignment5 {
	
	public static void main(String[] args){
		
		Set<Student5> std = new HashSet<>();
		std.add(new Student5(1,"AAA","Pune",55.6));
		std.add(new Student5(2, "BBB", "Mumbai", 78.2));
	    std.add(new Student5(3, "CCC", "Pune", 92.0));
	    std.add(new Student5(4, "DDD", "Bangalore", 67.5));
	    std.add(new Student5(5, "EEE", "Pune", 88.3));
	    std.add(new Student5(6, "FFF", "Chennai", 72.9));
	    std.add(new Student5(7, "GGG", "Bangalore", 81.4));
	    std.add(new Student5(8, "HHH", "Pune", 63.7));
	    std.add(new Student5(9, "III", "Bangalore", 95.1));
	    std.add(new Student5(11,"JJJ","Pune",55.6));
	    std.add(new Student5(12, "KKK", "Mumbai", 78.2));
	    std.add(new Student5(13, "LLL", "Pune", 92.0));
	    std.add(new Student5(14, "MMM", "Bangalore", 67.5));
	    std.add(new Student5(15, "NNN", "Chennai", 88.3));
	    std.add(new Student5(16, "OOO", "Pune", 72.9));
	    std.add(new Student5(17, "PPP", "Mumbai", 81.4));
	    std.add(new Student5(18, "RRR", "Chennai", 63.7));
	    std.add(new Student5(19, "VVV", "Mumbai", 95.1));
	    
	    std.forEach(k->System.out.println(k));
	}
}