package chapter3;

import java.util.Scanner;
public class inputTest 
{
	public static void main(String[] args)
	{
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your name" );
		String firstName;
		firstName = userInput.next();
		
		System.out.println("Please enter your last name");
		String lastName;
		lastName = userInput.next();
		
		System.out.println("How old are you?");
		
		String age;
		age = userInput.next();
		System.out.println("your full name is: " +firstName+ " " +lastName+ " your age is " +age);
		
	}

}