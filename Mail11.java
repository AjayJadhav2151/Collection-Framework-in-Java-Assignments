import java.time.LocalDateTime;

public class Mail11 {

	private long mailid;
	private String from;
	private String subject;
	private String body;
	private LocalDateTime rec_time;
	
	public Mail11() {
		super();
	}

	public Mail11(long mailid, String from, String subject, String body, LocalDateTime rec_time) {
		super();
		this.mailid = mailid;
		this.from = from;
		this.subject = subject;
		this.body = body;
		this.rec_time = rec_time;
	}

	public LocalDateTime getRec_time() {
		return rec_time;
	}

	@Override
	public String toString() {
		return "mailid=" + mailid + ", from=" + from + ", subject=" + subject + ", body=" 
					+ body + ", rec_time="+ rec_time;
	}
}
