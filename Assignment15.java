import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment15 {

	public static void main(String[] args) {
	
		Map <Integer,String> map = new HashMap<>();
		
		map.put(1, "Ajay");
		map.put(2, "Soham");
		map.put(3, "Rushikesh");
		map.put(4, "Pushpak");
		map.put(5, "Kedar");
		map.put(6, "Ganesh");
		map.put(7, "Krushna");
		
		Set<Entry<Integer,String>> mp = map.entrySet();
		for(Entry<Integer,String> i :mp) {
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		System.out.println("Iterator...........................");
		Iterator<Entry<Integer,String>> itr = mp.iterator();
		while(itr.hasNext()) {
			Entry obj = itr.next();
			System.out.println(obj.getKey()+" : "+obj.getValue());
		}
	}

}
