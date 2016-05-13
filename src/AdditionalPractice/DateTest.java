package AdditionalPractice;

public class DateTest 
{
	private String name;
	private Date birthday;
	
	public DateTest(String theName, Date theBirthday)
	{
		name = theName;
		birthday = theBirthday;
	}
	
	
	public String toString()
	{
		return String.format("My name is %s, my birthday is %s", 
				name, birthday);
	}
}

