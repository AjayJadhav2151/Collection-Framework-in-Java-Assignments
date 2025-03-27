import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Assignment17 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\CDAC Code data\\Collection Framework\\src\\emails.txt");
		BufferedReader br = new BufferedReader(fr);
		
		Map <String, Integer> mp = new TreeMap<>();
		
		String str;
		while((str=br.readLine())!= null) {
//			System.out.println(str);
			int index = str.indexOf('@');
			String domain = str.substring(index+1);
			if(mp.containsKey(domain)) {
				int occur = mp.get(domain);
				occur++;
				mp.put(domain, occur);
			} else {
				mp.put(domain, 1);
			}
		}
		System.out.println(mp);
	}

}
