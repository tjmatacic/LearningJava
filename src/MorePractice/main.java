package MorePractice;

public class main {
	public static void main(String[] args)
	{
		Integer [] iray = {1,2,3,4};
		Character [] cray = {'b','u','c','y'};
		
		printMe(iray);
		printMe(cray);
	}
	
	//generic method
	
	public static <T> void printMe(T[] x)
	{
		for (T b : x)
			System.out.printf("%s ", b);
		System.out.println();
	}

}
