package MorePractice;
import java.util.*;

public class main {
	public static void main(String[] args)
	{
		/*Integer [] iray = {1,2,3,4};
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
	}*/
		System.out.println(max(23, 42, 1));
		System.out.println(max("apples", "tots", "Chicken"));
				
	}
	
	public static <T extends Comparable<T>> T max (T a, T b, T c)
	{
		T m = a;
		
		if (b.compareTo(a) > 0)
			m = b;
		
		if(c.compareTo(m) > 0)
			m = c;
		
		return m;
	}

}
