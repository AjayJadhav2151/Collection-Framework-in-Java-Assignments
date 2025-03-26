import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Assignment4 {

public static void main(String[] args) throws FileNotFoundException, IOException {
ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
		"D:\\CDAC Code data\\Collection Framework\\data3.txt"));
		
		List <Customer3> cust = new ArrayList<>();
		List <RegisteredCustomer3> rcust = new ArrayList<>();
		
		while(true) {
			try {
				Object o = ois.readObject();
				if(o instanceof RegisteredCustomer3) {
					rcust.add((RegisteredCustomer3)o);					
				} else {
					cust.add((Customer3)o);					
				}
			}catch(Exception e){
				break;
			}
		}
		
		for(RegisteredCustomer3 r : rcust) {
			System.out.println(r);
		}
		
		for(Customer3 c : cust) {
			System.out.println(c);
		}
	}
}
