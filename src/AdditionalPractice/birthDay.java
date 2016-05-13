package AdditionalPractice;

public class birthDay {
	public static void main(String[] args)
	{
		Date DateObject = new Date (5, 24, 1989);
		DateTest birthDayObject = new DateTest ("Tyler", DateObject);
		
		System.out.println(birthDayObject);
	}

}
