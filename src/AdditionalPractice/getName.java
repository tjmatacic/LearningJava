package AdditionalPractice;

public class getName 
{
	private String friendName;
	
	public void setName(String name)
	{
		friendName = name;
	}
	
	public getName(String name)
	{
		friendName=name;
	}
	
	public String returnName()
	{
		return friendName;
	}
	
	public void saying()
	{
		System.out.printf("My friend's name is %s\n", returnName());
	}
	
}