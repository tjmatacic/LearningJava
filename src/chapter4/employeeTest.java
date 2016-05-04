package chapter4;

import java.util.Date;
import java.util.GregorianCalendar;
public class employeeTest {
	public static void main(String[] args)
	{
		//fill staff array with 3 employee objects
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		//raise everyone's salary 15%
		for(int i=0; i<staff.length; i++)
			staff[i].raiseSalary(5);
		//print out info about all employee objects
		for (int i=0; i<staff.length; i++)
		{
			Employee e =staff[i];
			System.out.println("name=" +e.getName()+",salary=" +e.getSalary()+",hireDay="+e.getHireDay());
		}

	}

}

class Employee
{
	private int id;
	private static int nextId=1;
	public Employee(String n, double s, int year, int month, int day)
	{
		
		name=n;
		salary=s;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		
		hireDay=calendar.getTime();
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	private String name;
	private double salary;
	private Date hireDay;
}