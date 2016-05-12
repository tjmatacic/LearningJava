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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
			contentPane.add(panel,  BorderLayout.SOUTH);
			
			//add clock
			
			clock = new ClockPanel();
			contentPane.add(clock, BorderLayout.CENTER);
	}
	
	public static final int WIDTH = 300;
	public static final int HEIGHT = 300;
	
	private IntTextField hourField;
	private IntTextField minuteField;
	private ClockPanel clock;
}
//a document that can only hold valid integers or their substrings

class IntTextDocument extends PlainDocument
{
	public void insertString(int offs, String str, AttributeSet a)
		throws BadLocationException
	{
		if (str == null) return;
		
		String oldString = getText(0, getLength());
		String newString = oldString.substring(0,  offs)
				+str+ oldString.substring(offs);
		
		if (canBecomeValid(newString))
			super.insertString(offs,  str,  a);
	}
	
	/* a helper function that tests whether a string is a valid integer
	 * @param s a string
	 * @return true if s is a valid integer
	 */
	
	public static boolean isValid(String s)
	{
		try
		{
			Integer.parseInt(s);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}
	
	/*A helper function that tests whether a string is a substring
	 * of a valid integer
	 * @param s a string
	 * return true if s can be extended to a valid integer
	 */
	
	public static boolean canBecomeValid(String s)
	{
		return s.equals("") || s.equals("-") || isValid(s);
	}
}

//A text field for editing integer values

class IntTextField extends JTextField
{
	/*constructs an IntTextField
	 * @param defval the default value
	 * @param size the field size
	 */
	
	public IntTextField(int defval, int size)
	{
		super("" +defval, size);
		setInputVerifier(new IntTextFieldVerifier());
		//		Document doc = getDocument();
		//		doc.addUndoableEditListener(new UndoListener());
	}
	
	protected Document createDefaultModel()
	{
		return new IntTextDocument();
	}
	
	/*Checks if the contents of this field is a valid integer
	 * @return true of the field contents is valid
	 */
	
	public boolean isValid()
	{
		return IntTextDocument.isValid(getText());
	}
	
	/*Gets the numeric value of the field contents.
	 * @param the number that the user typed into the field, or
	 * 0 if the field contents are not valid
	 */
	
	public int getValue()
	{
		try
		{
			return Integer.parseInt(getText());
		}
		
		catch(NumberFormatException e)
		{
			return 0;
		}
	}
}

/*A verifier that checks if the contents of a text component
 * is a valid integer
 */

class IntTextFieldVerifier extends InputVerifier
{
	public boolean verify(JComponent component)
	{
		String text = ((JTextComponent)component).getText();
		return IntTextDocument.isValid(text);
	}
}

//A panel that draws a clock (Unchanged from TextTest.)

class ClockPAnel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		//draw the circular boundary
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D circle = new Ellipse2D.Double(0, 0, 2 * RADIUS, 2 * RADIUS);
		g2.draw(circle);;
		
		//draw hour hand
		
		double hourAngle = Math.toRadians(90 - 360 * minutes / (12 * 60));
		drawHand(g2, hourAngle, HOUR_HAND_LENGTH);
		
		//draw the minute hand
		
		double minuteAngle = Math.toRadians(90 - 360 * minutes / 60);
		drawHand(g2, hourAngle, MINUTE_HAND_LENGTH);
	}
	
	public void drawHand(Graphics2D g2, double angle, double handLength)
	{
		Point2D end = new Point2D.Double(
			RADIUS + handLength * Math.cos(angle),
			RADIUS - handLength * Math.sin(angle));
		Point2D center = new Point2D.Double(RADIUS, RADIUS);
		g2.draw(new Line2D.Double(center, end));
	}
	
	/*Set the time to be displayed on the clock
	 * @param h hours
	 * @param m minutes
	 */
	
	public void setTime(int h, int m)
	{
		minutes = h * 60 + m;
		repaint();
	}
	
	private double minutes = 0;
	private double RADIUS = 100;
	private double MINUTE_HAND_LENGTH = 0.8 * RADIUS;
	private double HOUR_HAND_LENGTH = 0.6 * RADIUS;
}
