package AdditionalPractice;

public class polyTest {
	public static void main(String[] args)
	{
		food object[] = new food[2];
		
		object[0] = new pizza();
		object[1] = new tuna();
		
		//loop through array
		
		for (int i=0; i<2; ++i)
		{
			object[i].eat();
		}
		
				
	}
}
