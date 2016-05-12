package AdditionalPractice;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import javax.swing.undo.*;

public class ValidationTest 
{
	public static void main(String[] args)
	{
		ValidationTestFrame frame = new ValidationTestFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE;
		frame.show();
	}
}

//A frame with a clock and text fields to set time

class ValidationTestFrame extends JFrame
{
	public ValidationTestFrame()
	{
		setTitle("ValidationTest");
		setSize(WIDTH, HEIGHT);
		
		Container contentPane = getContentPane();
		
		JPanel panel = new JPanel();
		
		//add text field
		
		hourField = new IntTextField(12, 3);
		panel.add(hourField);
		
		//add set button
		
		JButton setButton = new JButton("Set");
		panel.add(setButton);
		setButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						if (hourField.isValid() && minuteField.isValid())
							clock.setTime(
									hourField.getValue(), minuteField.getValue());
					}
				});
			contentPane.add(panel,  BorderLayout.SOUTH;
			
			//add clock
			
			clock = new ClockPanel();
			contentPane.add(clock, BorderLayout.CENTER;
	}
	
	public static final int WIDTH = 300;
	public static final int HEIGHT = 300;
	
	private IntTextField hourField;
	private IntTextField minuteField;
	private ClockPanel clock;
}
