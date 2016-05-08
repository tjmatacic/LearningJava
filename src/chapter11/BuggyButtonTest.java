//program displaying built in debugging

package chapter11;
import javax.swing.*;
import java.awt.*;

public class BuggyButtonTest 
{
	public static void main(String[] args)
	{
		BuggyButtonFrame frame = new BuggyButtonFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}

}

public class BuggyButtonFrame extends JFrame
{
	public BuggyButtonFrame()
	{
		setTitle("BuggyButtonTest");
		setSize(WIDTH, HEIGHT);
		
		//add panel to frame
		
		BuggyButtonPanel panel = new BuggyButtonPanel();
		Container contentPane = getContentPane();
		contentPane.add(panel);
	}
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
}