package AdditionalPractice;

public class isGeneric <K, V>
{
	private K key;
	private V value;
	
	public isGeneric (K key, V value)
	{
		this.key = key;
		this.value = value;
	}
	
	public K getKey()
	{
		return this.key;
	}
	
	public V getValue()
	{
		return this.value;
	}

}
