package AdditionalPractice;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.event.*;

public class TextText 
{
	public static void main(String[] args)
	{
		TextTestFrame frame = new TextTestFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}

}

//frame with 2 text fields to set clock

class TextTestFrame extends JFrame
{
	public TextTestFrame()
	{
		setTitle("TextTest");
		setSize(WIDTH, HEIGHT);
		
		Container contentPane = getContentPane();
		
		DocumentListener listener = new ClockFieldListener();
		
		//add panel with text fields
		
		JPanel panel = new JPanel();
		
		hourField = new JTextField("12", 3);
		panel.add(minuteField);
		minuteField.getDocument().addDocumentListener(listener);
		
		contentPane.add(panel,  BorderLayout.SOUTH);
		
		//add clock
		
		clock = new ClockPanel();
		contentPane.add(clock, BorderLayout.CENTER);
	}
	
	//set clock to the values stored in the text fields
	
	public void setClock()
	{
		try
		{
			int hours = Integer.parseInt(hourField.getText().trim());
			int minutes = Integer.parseInt(minuteField.getText().trim());
			clock.setTime(hours, minutes);
		}
		catch (NumberFormatException e) {}
		//don't set the clock if the input can't be parsed
	}
	
	public static final int WIDTH = 300;
	public static final int HEIGHT = 300;
	
	private JTextField hourField;
	private JTextField minuteField;
	private ClockPanel clock;
	
	private class ClockFieldListener implements DocumentListener
	{
		public void insertUpdate(DocumentEvent e) {setClock(); }
		public void removeUpdate(DocumentEvent e) {setClock(); }
		public void changedUpdate(DocumentEvent e) {}
	}
}

//panel that draws a clock

class ClockPanel extends JPanel
{
	public void paintComponent (Graphics g)
	{
		//draw circular boundary
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D circle = new Ellipse2D.Double(0, 0, 2 * RADIUS, 2 * RADIUS);
		g2.draw(circle);
		
		//draw hour hand
		
		double hourAngle = Math.toRadians(90 - 360 * minutes / (12 * 60));
		drawHand(g2, hourAngle, HOUR_HAND_LENGTH);
		
		//draw minute hand
		
		double minuteAngle = Math.toRadians(90 - 360 * minutes / 60);
		drawHand(g2, minuteAngle, MINUTE_HAND_LENGTH);
	}
	
	public void drawHand(Graphics2D g2, double angle, double handLength)
	{
		Point2D end = new Point2D.Double(RADIUS+ handLength * Math.cos(angle),
				RADIUS - handLength * Math.sin(angle));
		Point2D center = new Point2D.Double(RADIUS, RADIUS);
		g2.draw(new Line2D.Double(center, end));
	}
	
	/*set the time to be displayed on the clock
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
