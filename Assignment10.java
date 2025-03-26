import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Assignment10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<String> Emp = new TreeSet<>(new Comparator<>() {

			public int compare(String o1, String o2) {
				int diff = o1.length() - o2.length();
				if(diff == 0) {
					diff = o1.compareTo(o2);
				}
				return diff;
				}
			});
		System.out.println("Enter five String..........");
		for(int i=0;i<5;i++) {
			String Str = br.readLine();	
			Emp.add(Str);
		}
		System.out.println("For each loop");
		for(String s:Emp) {
			System.out.println(s);
		}
		System.out.println("Normal print");
			System.out.println(Emp);
	}
}
