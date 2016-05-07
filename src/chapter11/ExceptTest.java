package chapter11;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class ExceptTest 
{
	public static void main(String[] args)
	{
		ExceptTestFrame frame = new ExceptTestFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE;
		frame.show();
	}

}

/* a frame with a panel for testing various exceptions*/

class ExceptTestFrame extends JFrame
{
	public ExceptTestFrame()
	{
		setTitle("ExceptTest");
		Container contentPane = getContentPane();
		ExceptionTestPanel panel = new ExceptTestPanel();
		contentPane.add(panel);
		pack();
	}
}