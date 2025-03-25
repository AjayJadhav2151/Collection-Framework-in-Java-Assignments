import java.util.Objects;

public class Student5 {
	private int studentid;
	private String name;
	private String city;
	private double percentage;
	
	public Student5() {
		super();
	}

	public Student5(int studentid, String name, String city, double percentage) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}

	@Override
	public int hashCode() {
		int code = 0;
		
		if(city.equals("Pune"))
				code = 10;
		else if (city.equals("Mumbai"))
			code = 20;
		else if (city.equals("Bangalore"))
			code = 30;
		else if (city.equals("Chennai"))
			code = 40;
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(obj instanceof Student5) {
			Student5 s = (Student5)obj;

			if(this.studentid == s.studentid && this.name.equals(s.name) && this.city.equals(s.city) && this.percentage == s.percentage) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public String toString() {
		return "Studentid=" + studentid + ", name=" + name + ", city=" + city + ", percentage=" + percentage;
	}
	
	
}
