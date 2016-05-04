package chapter3;

import javax.swing.JOptionPane;
public class whileLoop 
{
	public static void main(String[] args)
	{
		// read inputs
		String input = JOptionPane.showInputDialog("How much money do you need to retire?");
		double goal = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("How much money will you contribute every year?");
		double payment = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("intrest rate in %:");
		double intrestRate = Double.parseDouble(input);
		
		double balance = 0;
		int years = 0;
		
		//update account balance while goal isn't reached
		
		while(balance < goal)
		{
			balance += payment;
			double interest = balance * intrestRate /100;
			balance += interest;
			years ++;
		}
	  System.out.println("You can retire in " +years+ " years.");
	  System.exit(0);
	}

}
