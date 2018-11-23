package hijack;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class SwingDemo
	{

		JFrame framelogin;
		
		JTextField txt;
		
		JLabel lbl;
		
		JButton btn;
		
		JPasswordField pwd;

		SwingDemo(){

		framelogin = new JFrame("HixJack Log In");
		
		txt = new JTextField();
		
		txt.setBounds(100,50,200,30);
		
		pwd = new JPasswordField();
		
		pwd.setBounds(100,100,200,30);
		
		lbl = new JLabel();
		
		lbl.setBounds(150,150,150,30);
		
		btn = new JButton("Login");
		
		btn.setBounds(150,200,100,30);

		btn.addActionListener(new ActionListener(){  

public void actionPerformed(ActionEvent e){

		if(txt.getText().equals(""))

			JOptionPane.showMessageDialog(null, "Please Fill TextField");

		else if(pwd.getPassword().length == 0)

			JOptionPane.showMessageDialog(null, "Please Fill Password");

		else{

			String pass=String.valueOf(pwd.getPassword());

			if(txt.getText().equals("admin") && (pass.equals("password"))||
					txt.getText().equals("corey")&& (pass.equals("12345"))){
				
				//lbl.setText("Login Successful");
				
				number_three get = new number_three();
				framelogin.dispose();//this is to remove the login window frame
			
			}
			else{
				
				lbl.setText("Invalid credentials");
			}

				//lbl.setText("Invalid credentials");

					}
			}  
		});
		
		

		framelogin.add(txt);

		framelogin.add(pwd);
		framelogin.add(lbl);
		framelogin.add(btn);
		framelogin.setSize(400,300);  
		framelogin.setLayout(null);  
		framelogin.setVisible(true);
		framelogin.setLocationRelativeTo(null);
		framelogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

}

/*public static void main(String args[])

{

new SwingDemo();

}*/

}