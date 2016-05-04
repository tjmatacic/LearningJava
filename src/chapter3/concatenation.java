package chapter3;

public class concatenation {
	public static void main (String[] args)
	{
		String firstName ="Tyler ";//note the space after my first name so my first and last aren't squished together when outputted
		String lastName ="Matacic";
		String fullName = firstName+lastName;
		int n =fullName.length();
		firstName.equals(lastName);
		System.out.println(fullName);
		System.out.println("my name has " +n+ " letters");
	}

}
