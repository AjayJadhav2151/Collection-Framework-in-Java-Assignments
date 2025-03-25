//2 Refer assignment no 1.
//a. Display no of elements in collection (use size() method)
//b. Display all the strings from the collection using advanced for loop
//c. Display all the strings from the collection using Iterator.
//d. Display all the strings from the collection from last element to first element.
//e. Display all the strings from the collection using foreach method
//f. Sort the list
//g. Display the list in reverse order
//h. Accept the string from the user and check whether string is present or not 
//and if present at what index?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment2 {

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
		
//		System.out.println("Enter the index: ");
//		int index = Integer.parseInt(br.readLine());
//		
//		l.remove(index);
//		System.out.println(l);
		
		System.out.println("a............");
		System.out.println(l.size());
		
		System.out.println("b...........");
		for(String s : l) {
			System.out.println(s);
		}
		
		System.out.println("c............");
		//Using Iterator
		System.out.println("**************Iterator**************");
		Iterator<String> itr = l.iterator();
		while(itr.hasNext()) {			
			System.out.println(itr.next());
		}
		
		System.out.println("d....................");
		System.out.println("**************LIST ITERATOR************");
		ListIterator<String> litr = l.listIterator();
		while(litr.hasNext()) {
			litr.next();
		}
		while(litr.hasPrevious()) {
			System.out.println(litr.previous().toUpperCase());
		}

		System.out.println("e.................");
		System.out.println("For each method ");
		l.forEach(s->System.out.println(s));
		
		System.out.println("f..................");
		Collections.sort(l);
		System.out.println(l);
		
		System.out.println("g..................");
		System.out.println(l.reversed());
		
		System.out.println("h..................");
		System.out.println("Enter the find value: ");
		String name = br.readLine();
		
		//try codeeeeeeee
//		for(String element : l) {
//			if(element.equals(name)) {
//				System.out.println("Find");
//			} else
//		}
		
		int i = 0;
		if((i=l.indexOf(name))!=-1) {
			System.out.println(name+"is found at "+i);
		} else {
			System.out.println("Index not found");
		}
		
	}

}
