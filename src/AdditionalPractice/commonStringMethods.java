package AdditionalPractice;

public class commonStringMethods 
{
	
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
		
		String s = "tylermatacictylermatacic";
		System.out.println(s.indexOf('t'));//searched for the first index of 't'
		System.out.println(s.indexOf("ty"));
		
		String a ="Bacon ";
		String b ="monster";
		
		System.out.println(a.concat(b));
		System.out.println(a.replace('B', 'F'));
		System.out.println(b.toUpperCase());//useful in a database when you want everything to be uniform case
		
	}

}
