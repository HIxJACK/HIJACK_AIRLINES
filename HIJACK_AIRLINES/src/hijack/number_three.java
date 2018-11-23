package hijack;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;

import javax.swing.*;

public class number_three {
	
	/*public static void main(String args[]){
		number_three de = new number_three();
		de.window();
	}*/
	
	public number_three(){
		//number_three de = new number_three();
		//de.window();
		window();
	}
	public void window(){
		JFrame frame = new JFrame ();
		frame.setTitle("HixJack Air Lines");
		frame.setSize(1000, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		windowstart(frame);
	}
	
	public void windowstart(JFrame frame){
		
		
		
		
		/*JPanel panel = new JPanel (new GridBagLayout());
		frame.getContentPane().add(panel, BorderLayout.CENTER);//gets grid layout to be full screen
		GridBagConstraints c = new GridBagConstraints();*/
		
		frame.setLayout(new BorderLayout());
		JTabbedPane tabbedPane = new JTabbedPane();
		JPanel one = new JPanel();
		tabbedPane.addTab("Customer Service & Ticketing", one);
		JPanel two = new JPanel();
		tabbedPane.addTab("Flight Time Edits", two);
		JPanel third = new JPanel();
		tabbedPane.addTab("Air Craft Maintenance", third);
		JPanel four = new JPanel();
		tabbedPane.addTab("Business Forcast & Sales", four);
		JPanel five = new JPanel();
		tabbedPane.addTab("Valued Customer Signup ", five);
		frame.add(tabbedPane, BorderLayout.CENTER);
		
		JLabel page = new JLabel();
		page.setIcon(new ImageIcon("C:\\Users\\Karees\\Desktop\\Hixjack.jpg"));
		frame.add(page, BorderLayout.NORTH);
		
		JPanel side = new JPanel(new GridBagLayout());
		frame.getContentPane().add(side, BorderLayout.WEST);
		JButton btn1 = new JButton("Kilimanjaro");
		side.add(btn1);
		//frame.add(btn1,BorderLayout.WEST);
		
		/*JButton btn2 = new JButton("EAST");
		JButton btn3 = new JButton("WEST");
		JButton btn4 = new JButton("SOUTH");
		JButton btn5 = new JButton("CENTER");
		
		frame.add(btn1,BorderLayout.NORTH);
		frame.add(btn3,BorderLayout.WEST);
		frame.add(btn2,BorderLayout.CENTER);
		frame.add(btn5,BorderLayout.NORTH);*/
		
		
		
	}
	
	

}
