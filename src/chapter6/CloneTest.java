package chapter6;
import java.util.*;

public class CloneTest 
	{
		public static void main(String[] args)
		{
			Employee original = new Employee("John Q. Public", 50000);
			original.setPayDay(2000, 1, 1);
			Employee copy = (Employee)original.clone();
			copy.raiseSalary(10);
			copy.addPayDay(14);
			System.out.println("original=" +original);
			System.out.println("copy=" +copy);
		}
	}
/** 
 * an Employee class with a mutable payDay field
 */

class Employee implements Cloneable
{
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	public Object clone()
	{
		try
		{
			// call Object.clone
			Employee cloned = (Employee)super.clone();
			
			// clone mutable fields
			cloned.payDay = (GregorianCalendar)payDay.clone();
			
			return cloned;
		}
		catch (CloneNotSupportedException e) { return null; }
	}
	
	/**
	 * set the payday to a given date
	 * @param year the year of the payday
	 * @param month the month of the payday
	 * @param day the day of the payday
	 */
	public void setPayDay(int year, int month, int day)
	{
		payDay = new GregorianCalendar(year, month -1, day);
	}
	
	/** Add a number of days to the pay day
	 * @param days the number of days to add
	 */
	
	public void addPayDay(int days)
	{
		payDay.add(Calendar.DAY_OF_MONTH, days);
	}
	
	public Date getPayDay()
	{
		return payDay.getTime();
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public String toString()
	{
		return "Employee[name=" +name+
				",salary=" +salary+
				",payday=" +getPayDay()+ "]";
	}
	
	private String name;
	private double salary;
	private GregorianCalendar payDay;
}
	


