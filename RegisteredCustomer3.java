import java.io.Serializable;

public class RegisteredCustomer3 extends Customer3{

	private int regno;

	public RegisteredCustomer3() {
		super();
	}

	public RegisteredCustomer3(String name, String emailid, long contactno, int regno) {
		super(name, emailid, contactno);
		this.regno = regno;
	}

	@Override
	public String toString() {
		return super.toString()+"  RegisteredCustomer regno=" + regno;
	}

	

	
	
	
}
