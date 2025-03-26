//3 Create a super class Customer(name, emailid, contactno), extend it to create 
//RegisteredCustomer(regno). Accept information about 5 different customers from the 
//user and save it to the file.

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.nio.Buffer;

public class Assignment3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos = null;
		String fname;
			System.out.println("Enter file Name: ");
			fname = br.readLine();
			
			oos = new ObjectOutputStream(new FileOutputStream(fname));
			
			Customer3 []cust = new Customer3[3];
			String name, email;
			int regino;
			long phno;
			
			for(int i=0;i<cust.length;i++) {
				System.out.println("Enter c if you want customer or r");
				char ch=br.readLine().charAt(0);
				System.out.println("Enter name=");
				name=((BufferedReader)br).readLine();
				System.out.println("Enter email=");
				email=((BufferedReader)br).readLine();
				System.out.println("Enter contact number=");
				phno=Long.parseLong(br.readLine());	
				if(ch=='r')
				{
				   System.out.println("Enter register number=");
				   regino=Integer.parseInt(br.readLine());			
				   cust[i]=new RegisteredCustomer3(name,email,phno,regino);
				}
				else
				{
				    cust[i]=new Customer3(name,email,phno);
				}
			}
			for(int i=0;i<cust.length;i++) {
				System.out.println("written");
				oos.writeObject(cust[i]);
			}
			System.out.println("Customer saved in file...");
			oos.close();
			
	}

}
