package AdditionalPractice;

public class getName 
{
	private String friendName;
	
	public getName(String name)
	{
		friendName=name;
	}
	
	public void setName(String name)
	{
		friendName = name;
	}
	
	public String getName()
	{
		return friendName;
	}
	
	public void saying()
	{
		System.out.printf("My friend's name is", getName());
	}
	
}