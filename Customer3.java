
public class Customer3 {

	private String name;
	private String emailid;
	private long contactno;
	public Customer3() {
		super();
	}
	public Customer3(String name, String emailid, long contactno) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Customer name=" + name + ", emailid=" + emailid + ", contactno=" + contactno;
	}
	
}
