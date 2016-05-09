package chapter12;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.zip.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

public class ZipTest 
{
	public static void main(String[] args)
	{
		ZipTestFrame frame = new ZipTestFrame();
		frame.setTile("ZipTest");
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE;
		frame.show();	
	}

}

/* A frame with a text area to show the contnets of a file inside a zip archive
a combo box to select different files in the archive
and a menu to load a new archive
*/

class ZipTestFrame extends JFrame
{
	public ZipTestFrame()
	{
		//add the menu and the Open and Exit menu items
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		
		JMenuItem openItem = new JMenuItem("Open");
		menu.add(openItem);
		openItem.addActionListener(new OpenAction());
		
		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		exitItem.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						System.exit(0);
					}
				});
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		//add the text area and combo box
		fileText = new JTextArea();
		fileCombo = new JComboBox();
		fileCombo.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						loadZipFile((String)fileCOmbo.getSelectedItem());
					}
				});
		Container contentPane = getContentPane();
		contentPane.add(fileCombo,  BorderLayout.SOUTH);
		contentPane.add(fileText, BorderLayout.CENTER;
	}
	
	//This is the listener for the File->Open menu item.
	
	private class OpenAction implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			//prompt user for zip file
			JFileChooser chooser = new JFileChooser();
			chooser.setCurrentDirectory(new File("."));
			Extension
		}
	}
}




















































































