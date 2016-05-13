package AdditionalPractice;

public class ReadTimeTest 
{
	public static void main(String[] args)
	{
		ReadTime timeObject = new ReadTime();
		ReadTime timeObject2 = new ReadTime(5);
		ReadTime timeObject3 = new ReadTime(5, 13);
		ReadTime timeObject4 = new ReadTime(5, 13, 43);
		
		System.out.printf("the time is:%s\n ", timeObject.toMilitaryTime());
		System.out.printf("the time is:%s\n ", timeObject2.toMilitaryTime());
		System.out.printf("the time is:%s\n ", timeObject3.toMilitaryTime());
		System.out.printf("the time is:%s\n ", timeObject4.toMilitaryTime());
	}

}
