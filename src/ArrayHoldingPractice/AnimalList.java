package ArrayHoldingPractice;


//class that holds array for any type of animal

public class AnimalList {
	private Animal[] theList = new Animal [5];
	private int i = 0;
	
	public void add(Animal a)
	{
		if (i<theList.length)
		{
			theList[i] = a;
			System.out.println("Animal added at index: " +i);
			i++;
		}
	}
	

}
