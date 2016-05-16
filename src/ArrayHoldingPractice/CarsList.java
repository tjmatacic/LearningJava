package ArrayHoldingPractice;

public class CarsList {
	
	private Cars[] theList = new Cars[2];
	private int i =0;
	
	public void add(Cars a)
	{
		if(i<theList.length)
		{
			theList[i] = a;
			i++;
			
			System.out.println("New car added at index:" +i);
		}
	}

}
