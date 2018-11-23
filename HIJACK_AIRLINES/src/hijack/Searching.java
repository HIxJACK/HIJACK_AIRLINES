package hijack;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.util.*;

import javax.swing.*;
import java.awt.*;



public class Searching {
	
	//ObservableList<String> entries = FXCollections.observableArrayList();
	ArrayList<String> entries = new ArrayList<String>();
    
	/*public static void main (String args[]){
		Searching go = new Searching();
		go.window();
	}*/
	
	
	Searching(){
		JFrame frame = new JFrame ();
		frame.setTitle("HixJack Air Lines search Flights");
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel (new GridBagLayout());
		frame.getContentPane().add(panel, BorderLayout.CENTER);//gets grid layout to be full screen
		GridBagConstraints c = new GridBagConstraints();
		
		 JTextField txt = new JTextField(25);
	        txt.setText("Search");
	        c.gridx = 0;
			c.gridy = 0;
			c.insets = new Insets(10, 10, 10, 10);
			panel.add(txt);
		 JButton btn = new JButton();
	        btn.setText("Search");
	        c.gridx = 0;
			c.gridy = 1;
			c.insets = new Insets(10, 10, 10, 10);
		panel.add(btn, c);
		JLabel lbl = new JLabel();
		lbl.setBounds(150,150,150,30);
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(10, 10, 10, 10);
		panel.add(lbl, c);

		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(txt.getText().equals("")){
					
					JOptionPane.showMessageDialog(null, "Please Fill TextField");
				}
				else if(txt.getText().equals("steve")||txt.getText().equals("HixJack")||txt.getText().equals("DR.BHOLA")){
					JTableRow go = new JTableRow();
					frame.dispose();
				}
				else{
					lbl.setText("Flight Not Found, Please Check Your Confimation Number");
				}
			}
		});
		
		
		// Set up the ListView
        //list.setMaxHeight(180);
        // Populate the list's entries
        for ( int i = 0; i < 100; i++ ) {
            entries.add("Item " + i);
        }
        entries.add("Eric J. Bruno");
        entries.add("Joseph Bruno");
        entries.add("Ashley Bruno");
        entries.add("Brandon Bruno");
       // list.setItems(entries);//(entries);

}

	/*public String confirmation(){
		
		AlphaNumericExample example = new AlphaNumericExample();
		example.getAlphaNumeric(12);
		
		return;
	}*/
}
