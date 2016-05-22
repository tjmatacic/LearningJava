package AdditionalPractice;

public class commonStringMethods {
	
	public static void main(String[] args)
	{
		String[] words = {"funk", "chunk", "furry", "baconator"};
		
		//statsWith
		
		for(String w : words)
		{
			if(w.startsWith("c"))
				System.out.println(w+ " starts with c");
		}
		
		for(String w : words)
		{
			if(w.endsWith("r"))
				System.out.println(w+ " ends with r");
		}
	}

}
