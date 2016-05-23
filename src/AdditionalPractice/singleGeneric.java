package AdditionalPractice;

public class singleGeneric <T>
{
	private T type;
	
	public singleGeneric (T type)
	{
		this.type = type;
	}
	
	public T getType()
	{
		return this.type;
	}
	
	public void setType (T type)
	{
		this.type = type;
	}

}
