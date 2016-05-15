package AdditionalPractice;

public class clubMembershipTest 
{
	public static void main(String[] args)
	{
		clubMembership member1 = new clubMembership("Meagan", "Fox");
		clubMembership member2 = new clubMembership("Brandon", "Matacic");
		clubMembership member3 = new clubMembership("Nolan", "Sowa)");
		
		System.out.println();
		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers());
		
		System.out.println();
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
	}
	
}
