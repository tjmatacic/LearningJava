package chapter12;
import java.io.*;
import java.util.*;

public class DataFileTest 
{
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		try
		{
			//save all employee records to the file employee.dat
			PrintWriter out = new PrintWriter(new FileWriter("employee.dat"));
			writeData(staff, out);
			out.close();
			
			//retrieve all rescords into a new array
			BufferedReader in = new BufferedReader(new FileReader("employee.dat"));
			Employee[] newStaff = readData(in);
			in.close();
			
			//print the newly read employee records
			for (int i =0; i < newStaff.length; i++)
				System.out.println(newStaff[i]);
		}
		catch(IOException exception)
		{
			exception.printStackTrace();
		}
	}
	/*Writes all employees in an array to a print writer
	 * @pram e an array of employees
	 * @param out a print writer
	 */
	static void writeData(Employee[] e, PrintWriter out)
	throws IOException
	{
		//write number of employees
		out.println(e.length);
		for(int i = 0; i <e.length; i++)
			e[i].writeData(out);
	}
	/*reads an array of employees from a buffered reader
	 * @param in the buffered reader
	 * @return the array of employees
	 */
	static Employee[] readData(BufferedReader in)
	throws IOException
	{
		//retrieve the array size
		int n = Integer.parseInt(in.readLine());
		Employee[] e = new Employee[n];
		for (int i = 0; i < n; i++)
		{
			e[i] = new Employee();
			e[i].readData(in);
		}
		return e;
	}
}

class Employee
{
	public Employee() {}
	
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month -1, day);
		hireDay = calendar.getTime();
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
		double raise = salary * byPercent /100;
		salary += raise;
	}
	
	public String toString()
	{
		return getClass().getName()
			+ "[name=" +name+ ",salary=" +salary+ ",hireDay=" +hireDay+ "]";
	}
	
	/*writes employee data to a print writer
	 * @param out the print writer
	 */
	
	public void writeData(PrintWriter out) throws IOException
	{
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(hireDay);
		out.println(name+ "|" +salary+ "|" +calendar.get(Calendar.YEAR)+ "|"
		+(calendar.get(Calendar.MONTH) +1)+ "|" +calendar.get(Calendar.DAY_OF_MONTH));
	}
	/*Reads employee data from a buffered reader
	 * @param in the buffered reader
	 */
	
	public void readData(BufferedReader in) throws IOException
	{
		String s = in.readLine();
		StringTokenizer t = new StringTokenizer(s, "|");
		name = t.nextToken();
		salary = Double.parseDouble(t.nextToken());
		int y = Integer.parseInt(t.nextToken());
		int m = Integer.parseInt(t.nextToken());
		int d = Integer.parseInt(t.nextToken());
		GregorianCalendar calendar = new GregorianCalendar(y, m-1, d);
		hireDay = calendar.getTime();
	}
	private String name;
	private double salary;
	private Date hireDay;
}
