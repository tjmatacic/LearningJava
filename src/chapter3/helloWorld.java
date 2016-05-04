package chapter3;


public class helloWorld 
{
 public static void main (String[] args)
 {
 String [] greeting = new String[4];
 greeting [0] = "welcome to core java";
 greeting [1] = "by Cay";
 greeting [2] = "and Gary";
 greeting [3] = "and hellow world";
 
		 for (int i=0; i<greeting.length; i++)
			 System.out.println(greeting[i]);
 }
}
