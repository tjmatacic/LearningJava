package AdditionalPractice;

public class genericNotGenericTest {
	
	public static String key1 = "I'm the first key";
	public static Integer value1 = 5;
	
	public static Object obj1 = new Object();
	public static Integer integer1 = new Integer(19);
	
	public static notGeneric notGen = new notGeneric(key1, value1);
	public static isGeneric <String, Integer> isGen = new isGeneric<>(key1, value1);
	public static singleGeneric <Integer> sGen1 = new singleGeneric<> (new Integer(3));
	
	
	public static void main(String[] args)
	{
		obj1 = integer1;
		
		Number num1 = getNumber(value1);
		
		Integer int1 = (Integer) notGen.getValue();
		String string1 = isGen.getKey();
		
		System.out.println(num1);
	}
	
	public static Number getGenNumber (singleGeneric <Number> sGen)
	{
		return sGen.getType();
	}
	
	public static Number getNumber(Number num)
	{
		return num;
	}

}
