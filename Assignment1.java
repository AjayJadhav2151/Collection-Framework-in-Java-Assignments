//1 Create collection for storing strings accepted from user. Display all elements from the 
//collection. Accept the index from which element has to be removed and remove the element at 
//that index. Redisplay the collection.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Assignment1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		List <String> l = new ArrayList<>();
		
		l.add("java");
		l.add("c");
		l.add("cpp");
		l.add("python");
		l.add("dsa");
		l.add(".net");
		l.add("html");
		
		System.out.println(l);
		
		System.out.println("Enter the index: ");
		int index = Integer.parseInt(br.readLine());
		
		l.remove(index);
		System.out.println(l);
	}

}
