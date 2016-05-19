package AdditionalPractice;


public class FileCreatorTest 
{
	public static void main(String[] args)
	{
		FileCreator g = new FileCreator();
		g.openFile();
		g.addRecords();
		g.closeFile();
		
	}
}