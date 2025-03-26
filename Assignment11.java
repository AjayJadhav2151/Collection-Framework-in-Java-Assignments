import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Assignment11 {

	public static void main(String[] args) {
		
		Set<Mail11> mail = new TreeSet<>(new Comparator<>() {
			public int compare(Mail11 o1, Mail11 o2) {
				return o1.getRec_time().compareTo(o2.getRec_time());
				}
			});
		LocalDateTime l= LocalDateTime.of(2023, 11, 2, 11, 10);
		mail.add(new Mail11(101,"Ajay","Trip plan","dsjvdskbvksdbc",l));
		mail.add(new Mail11(103, "Priya", "Project update", "The project is on track for delivery", LocalDateTime.of(2021, 1, 15, 14, 30)));
	    mail.add(new Mail11(104, "Rahul", "Meeting reminder", "Don't forget our 3pm meeting today", LocalDateTime.of(2022, 2, 5, 9, 45)));
	    mail.add(new Mail11(105, "Anika", "Vacation photos", "Here are the photos from our trip", LocalDateTime.of(2024, 3, 20, 18, 12)));
	    mail.add(new Mail11(106, "Michael", "Budget approval", "Please review the attached budget proposal", LocalDateTime.of(2025, 4, 10, 11, 5)));
	    mail.add(new Mail11(107, "Jessica", "Weekend plans", "Are you free this weekend for brunch?", LocalDateTime.of(2026, 5, 22, 16, 40)));
	    mail.add(new Mail11(108, "David", "Important announcement", "Company policy changes effective next month", LocalDateTime.of(2020, 6, 7, 13, 15)));
	    mail.add(new Mail11(109, "Sophia", "Birthday invitation", "You're invited to my birthday party!", LocalDateTime.of(2017, 7, 12, 20, 0)));
	    mail.add(new Mail11(110, "Kevin", "Document review", "Please find the contract for your review", LocalDateTime.of(2019, 8, 19, 10, 30)));
	    mail.add(new Mail11(111, "Emma", "Feedback request", "How was your experience with our service?", LocalDateTime.of(2020, 9, 3, 9, 0)));
	
	    mail.forEach(s->System.out.println(s));
	 	}
}
