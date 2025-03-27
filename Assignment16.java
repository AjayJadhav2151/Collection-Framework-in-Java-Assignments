import java.util.Map;
import java.util.TreeMap;


public class Assignment16 {

	public static void main(String[] args) {
		String s = "coccacola";
		
		Map<Character, Integer> mp = new TreeMap<>();
		for(int i = 0; i < s.length();i++) {
			char ch = s.charAt(i);
			if(mp.containsKey(ch)) {
				int occur =  mp.get(ch);
				occur++;
				mp.put(ch, occur);
			} else {				
				mp.put(ch, 1);
			}
			
		}
		System.out.println(mp);
	}

}
