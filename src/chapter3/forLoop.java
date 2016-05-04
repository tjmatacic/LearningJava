package chapter3;

import javax.swing.JOptionPane;
public class forLoop 
{
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog ("How many numbers do you need to draw ?");
		int k = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog ("What is the highest number you can draw?");
		int n = Integer.parseInt(input);
		
		int lotteryOdds = 1;
		for (int i =1; i <=k; i++)
			lotteryOdds = lotteryOdds * (n - i +1) / i;
		System.out.println("Your odds are 1 in " +lotteryOdds+ " Good luck");
		System.exit(0);
	}
}
