package chapter11;
import java.io.*;
import java.util.*;

/*A program for counting the count of lines, words,
 * and sentences in System.in
 */

public class WordCount 
{
	public static void main(String[] args)
	{
		String input = "";
		int lines = 0;
		try
		{
			BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
			String line;
			//read input lines until the end of file is reached
			while((line = reader.readLine()) != null)
			{
				line += "\n";
				input += line; //add line to input string
				lines++; // increment line count
			}
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
		
		//Split the input into tokens to count all words
		StringTokenizer tokenizer = new StringTokenizer(input);
		int words = tokenizer.countTokens();
		
		//print count of lines, words, and characters in input
		System.out.println(lines + " " + words+ " " +input.length());
	}

}
