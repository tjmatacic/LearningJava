package chapter4;

public class staticTest {
	public static void main(String[] args)
	{
		//fill staff array with 3 employee objects
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee ("Tom", 40000);
		staff[1] = new Employee("Dick", 60000);
		staff[2] = new Employee("Harry", 65000);
		
		//print out info about all Employee objects
		
		for(int i=0; i<staff.length; i++)
		{
			Employee e =staff[i];
			e.setId();
			System.out.println("name=" +e.getName()+ ",id=" +e.getId()+ ",salary=" +e.getSalary());
		}
		int n = Employee.getNextId(); // calls static method
		System.out.println("Next available id=" + n);
	}
}

class Employee
{
	public Employee(String n, double s)
	{
		name =n;
		salary =s;
		id = 0;
	}
	
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getId()
	{
		return id;
	}
	public void setId()
	{
		id = nextId; //set id to next available id
		nextId++;
	}
	
	public static int getNextId()
	{
		return nextId; //returns static field
	}
	public static void main (String[] args) //unit test
	{
		Employee e = new Employee("Harry", 50000);
		System.out.println(e.getName()+ " " +e.getSalary());
	}
	private String name;
	private double salary;
	private int id;
	private static int nextId = 1;
}