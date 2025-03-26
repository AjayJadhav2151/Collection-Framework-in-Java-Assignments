import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;

public class Assignment13 {

	public static int countvowel(String s) {
		int count=0;
		for(char c:s.toLowerCase().toCharArray()) {
			if("aeiou".indexOf(c) != -1) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
//		char [] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		
		Set<String> str = new TreeSet<>(new Comparator<String>() {
			public int compare(String o1, String o2) {
				int diff=0;
				int vowel = countvowel(o1);
				int vowel1 = countvowel(o2);
				diff= vowel-vowel1;
				if(diff==0) {
					diff = o1.compareTo(o2);
				}
				return diff;
			}
		});
		
		str.add("fliwejoifo");
		str.add("wefhoyjkwfh");
		str.add("sohaamevshuvwv");
		str.add("rushikeesh");
		str.add("pushpak");
		str.add("kedaar");
		str.add("durgeesh");
		
		str.forEach(s->System.out.println(s));
	}
}
