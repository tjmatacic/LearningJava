import java.util.*;
public class calendarTest {
	public static void main (String[] args)
	{
		/* if I wanted to change the date I'd use the set method: deadline.set(Calendar.DAY, 15)*/
		GregorianCalendar d = new GregorianCalendar();
		
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		//print heading
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		
		//indent first calendar line
		for (int i= Calendar.SUNDAY; i< weekday; i++)
			System.out.println("    ");
		do
		{
			//print day
			int day = d.get(Calendar.DAY_OF_MONTH);
			if (day< 10) System.out.print(" ");
			System.out.print(day);
			
			//mark current day with *
			if (day ==today)
				System.out.print("* ");
			else
				System.out.print("  ");
			//start new line after every Saturday
			if(weekday== Calendar.SATURDAY)
				System.out.println();
			//advance d to the next day
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
			}
		while (d.get(Calendar.MONTH)==month);
		//print final end of line if necessary 
		if (weekday !=Calendar.SUNDAY)
			System.out.println();
	}

}
