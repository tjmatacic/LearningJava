package chapter3;

public class constant
{
	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args)
	{
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println ("Paper size in centemeter: "
		+ paperWidth * CM_PER_INCH + " by "
		+ paperHeight * CM_PER_INCH);
	}
}