package chapter12;
import java.io.*;
import java.util.*;

public class RandomFileTest 
{
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("CArl Cracker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		try
		{
			//save all employee records to the file employee.dat
			DataOutputStream out = new DataOutputStream(new FileOutputStream("employee.dat"));
			for(int i = 0; i <staff.length; i++)
				staff[i].writeData(out);
			out.close();
			
			//retrieve all records into a new array
			RandomAccessFile in = new RandomAccessFile("employee.dat", "r");
			//compute the array size
			int n = (int)(in.length() /Employee.RECORD_SIZE);
			Employee[] newStaff = new Employee[n];
			
			//read employees in reverse order
			for (int i =n - 1; i >= 0; i--)
			{
				newStaff[i] = new Employee();
				in.seek(i* Employee.RECORD_SIZE);
				newStaff[i].readData(in);
			}
		}
	}

}
