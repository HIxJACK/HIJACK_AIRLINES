package hijack;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Properties;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Build1 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Build1 window = new Build1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Build1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(0, 0, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//MENU ITEMS BEGIN HERE
				JMenuBar menubar = new JMenuBar();
				frame.setJMenuBar(menubar);
				
				JMenu options = new JMenu("Options");
				menubar.add(options);
				JMenuItem faq = new JMenuItem("FAQ");
				options.add(faq);
				JMenuItem terms = new JMenuItem("Terms of Use");
				options.add(terms);
				JMenuItem privacy = new JMenuItem("Privacy Policy");
				options.add(privacy);
				JMenuItem contact = new JMenuItem("Contact Us");
				options.add(contact);
				JMenuItem exit = new JMenuItem("Exit");
				options.add(exit);
				
				JMenu sky_member = new JMenu("Sky Member");
				menubar.add(sky_member);
				JMenuItem military = new JMenuItem("Militery Airfare");
				sky_member.add(military);
				JMenuItem dimondplus = new JMenuItem("Diamond Plus");
				sky_member.add(dimondplus);
				JMenuItem skypriority = new JMenuItem("Sky Priority");
				sky_member.add(skypriority);
				JMenuItem join = new JMenuItem("Sign Up");
				sky_member.add(join);
				
				JMenu locator = new JMenu("Flight Locator");
				menubar.add(locator);
				JMenuItem search = new JMenuItem("Flight Locator");
				locator.add(search);
				
				JMenu Employee_login = new JMenu("Employee Login");
				menubar.add(Employee_login);
				JMenuItem login = new JMenuItem("Employee Login");
				Employee_login.add(login);//MENU ITEMS ENDS HERE
				
				//login sign = new login();
				search.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{
						Searching okay = new Searching();
						
						
					}
				});
				
				login.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{
						SwingDemo sign = new SwingDemo();
						
						
					}
				});
		
		/*
		Employee_login.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				login flight = new login();
				flight.setVisible(true);
					
				
			}
			
		});
		*/
		menubar.add(Employee_login); //MENU ITEMS ENDS HERE
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 5, 760, 30);
		frame.getContentPane().add(panel);
		
		JLabel lblLogo = new JLabel("HIJACK AIRLINES");
		lblLogo.setFont(new Font("Algerian", Font.PLAIN, 15));
		panel.add(lblLogo);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(390, 80, 1, 15);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 450, 760, 1);
		frame.getContentPane().add(separator_2);
		
		JRadioButton rdbtnOneWay = new JRadioButton("One way");
		JRadioButton rdbtnRoundTrip = new JRadioButton("Round-Trip");
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrom.setFont(new Font("Dialog", Font.BOLD, 15));
		lblFrom.setBounds(100, 75, 65, 20);
		frame.getContentPane().add(lblFrom);
		
		JComboBox drpFrom = new JComboBox();
		drpFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		drpFrom.setModel(new DefaultComboBoxModel(new String[] {new Atlanta().getName(), new Dallas().getName(), new LosAngeles().getName(), new Miami().getName(), new NewYork().getName()}));
		drpFrom.setBounds(175, 70, 140, 30);
		frame.getContentPane().add(drpFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTo.setBounds(475, 75, 65, 20);
		frame.getContentPane().add(lblTo);
		
		JComboBox drpTo = new JComboBox();
		drpTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		drpTo.setModel(new DefaultComboBoxModel(new String[] {Atlanta.getName(), Dallas.getName(), LosAngeles.getName(), Miami.getName(), NewYork.getName()}));
		drpTo.setBounds(550, 70, 140, 30);
		frame.getContentPane().add(drpTo);
		
		JLabel lblDeparture = new JLabel("Departure:");
		lblDeparture.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeparture.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblDeparture.setBounds(110, 250, 100, 20);
		frame.getContentPane().add(lblDeparture);
		
		UtilDateModel udmDeparture = new UtilDateModel();
		LocalDate now = LocalDate.now();
		udmDeparture.setDate(now.getYear(), now.getMonthValue()-1, now.getDayOfMonth());
		udmDeparture.setSelected(true);
		JDatePanelImpl datePanel = new JDatePanelImpl(udmDeparture);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		datePicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date.setDeparture(datePicker.getJFormattedTextField().getText());
			}
		});
		datePicker.setBounds(230, 245, 125, 25);
		frame.getContentPane().add(datePicker);
		
		
		JLabel lblReturn = new JLabel("Return:");
		lblReturn.setHorizontalAlignment(SwingConstants.CENTER);
		lblReturn.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblReturn.setBounds(460, 250, 100, 20);
		frame.getContentPane().add(lblReturn);
		
		UtilDateModel udmReturn = new UtilDateModel();
		udmReturn.setDate(now.getYear(), now.getMonthValue()-1, now.getDayOfMonth());
		udmReturn.setSelected(true);
		JDatePanelImpl datePanel2 = new JDatePanelImpl(udmReturn);
		JDatePickerImpl datePicker2 = new JDatePickerImpl(datePanel2);
		datePicker2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date.setReturn(datePicker2.getJFormattedTextField().getText());
			}
		});
		datePicker2.setBounds(570, 245, 125, 25);
		frame.getContentPane().add(datePicker2);
		
		JComboBox txtAdult = new JComboBox();
		txtAdult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nAdult = (int) txtAdult.getSelectedItem();
				PassengerCount.setAdult(nAdult);
				if (rdbtnOneWay.isSelected()){
				Price.setValue(Miami.getPrice()* nAdult);
				} else {
					Price.setValue(Miami.getPrice()* nAdult + Atlanta.getPrice()* nAdult);
				}
			}
		});
		txtAdult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAdult.setModel(new DefaultComboBoxModel(new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
		txtAdult.setBounds(230, 360, 100, 30);
		frame.getContentPane().add(txtAdult);
		
		JLabel lblAdult = new JLabel("Adults");
		lblAdult.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdult.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblAdult.setBounds(240, 330, 80, 20);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Children");
		lblChild.setHorizontalAlignment(SwingConstants.CENTER);
		lblChild.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblChild.setBounds(482, 330, 80, 20);
		frame.getContentPane().add(lblChild);
		
		JComboBox txtChild = new JComboBox();
		txtChild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nChild = (int) txtChild.getSelectedItem();
				PassengerCount.setChild(nChild);
				if (rdbtnOneWay.isSelected()){
				Price.setValue(Price.getValue() + (Miami.getPriceKids() * nChild));
				} else {
					Price.setValue(Price.getValue() + (Miami.getPriceKids() * nChild + Atlanta.getPrice()* nChild));
				}
			}
		});
		txtChild.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtChild.setModel(new DefaultComboBoxModel(new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
		txtChild.setBounds(475, 360, 100, 30);
		frame.getContentPane().add(txtChild);
		
		
		rdbtnOneWay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				udmReturn.setSelected(false);
				datePicker2.getComponent(1).setEnabled(false);
			}
		});
		
		rdbtnOneWay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnOneWay.setBounds(270, 150, 100, 25);
		frame.getContentPane().add(rdbtnOneWay);
		
		
		rdbtnRoundTrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				udmReturn.setSelected(true);
				datePicker2.getComponent(1).setEnabled(true);
			}
		});
		rdbtnRoundTrip.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnRoundTrip.setBounds(430, 150, 112, 25);
		frame.getContentPane().add(rdbtnRoundTrip);
		rdbtnRoundTrip.setSelected(true);
		
		ButtonGroup rdbtn = new ButtonGroup();
		rdbtn.add(rdbtnOneWay);
		rdbtn.add(rdbtnRoundTrip);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setToolTipText("Reset Button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnRoundTrip.setSelected(true);
				udmDeparture.setDate(now.getYear(), now.getMonthValue()-1, now.getDayOfMonth());
				udmReturn.setDate(now.getYear(), now.getMonthValue()-1, now.getDayOfMonth());
			}
		});
		btnNewButton.setBounds(20, 460, 120, 58);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNext.setToolTipText("Exit Button");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			Flight_Times flight = new Flight_Times();
			flight.setVisible(true);
				
				
			}
		});
		
		
		btnNext.setBounds(640, 460, 120, 58);
		frame.getContentPane().add(btnNext);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setToolTipText("Exit Button");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?\nYour unsaved information will be lost.", "HIJACK AIRLINES",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
		}
				
			}
		});
		btnExit.setBounds(340, 460, 120, 58);
		frame.getContentPane().add(btnExit);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	

	
}