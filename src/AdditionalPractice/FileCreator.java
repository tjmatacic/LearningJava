package AdditionalPractice;

import java.util.*;
import java.io.*;
import java.lang.*;

public class FileCreator 
{
	
		private Formatter x;
		
		public void openFile()
		{
			try
			{
				x = new Formatter("writerTest2.txt");
			}
			catch (Exception e)
			{
				System.out.println("Error");
			}
						
		}
		
		public void addRecords()
		{
			x.format("%s%s%s", "20", "Tyler", "Matacic");
		}
		
		public void closeFile()
		{
			x.close();
		}
	}