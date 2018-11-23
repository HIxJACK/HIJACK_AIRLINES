package hijack;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
//import net.proteanit.sql.DbUtils;


public class Flight_Times extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flight_Times frame = new Flight_Times();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
Connection connection = null;
private final JTable table = new JTable();
private final JLabel lblTime = new JLabel("Time");
private final JLabel lblPrice = new JLabel("Price");
private final JLabel lblNumber = new JLabel("Number");
private final JLabel lblDate = new JLabel("Date");
private final JLabel lblMain = new JLabel("Main");
private final JLabel lblComfort = new JLabel("Comfort");
private final JLabel lblFirstClass = new JLabel("First Class");
private JTable table_1;
private final JLabel label_1 = new JLabel("("+PassengerCount.getAdult()+" adults and "+PassengerCount.getChild()+" children)");

	/**
	 * Create the frame.
	 */
	public Flight_Times()  {
		initGUI();
	}
	private void initGUI() {
		//connection = SQLiteJDBC.SQLite();
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 764, 30);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel);
		
		JLabel label = new JLabel("HIJACK AIRLINES");
		label.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel.add(label);
		
		JButton btnNewButton = new JButton("Summary");
		btnNewButton.setBounds(340, 490, 117, 53);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TicketAndSeatPriceSummary summary = new TicketAndSeatPriceSummary();
				summary.setVisible(true);
				dispose();
				//=== Summary ===//
				
				
				
				
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			PassengerInfo PInfo = new PassengerInfo();
			PInfo.frame.setVisible(true);
			dispose();
				
			}
		});
		btnNext.setBounds(650, 490, 117, 53);
		contentPane.add(btnNext);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Build1 window = new Build1();
				window.frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(15, 490, 117, 53);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Flight Times and Seat Prices");
		lblNewLabel.setBounds(259, 78, 276, 31);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
//		JRadioButton rdbtnNewRadioButton = new JRadioButton("Main Cabin");
//		rdbtnNewRadioButton.setBounds(89, 345, 117, 23);
//		contentPane.add(rdbtnNewRadioButton);
//		
//		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Comfort");
//		rdbtnNewRadioButton_1.setBounds(369, 345, 92, 23);
//		contentPane.add(rdbtnNewRadioButton_1);
//		
//		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("FirstClass");
//		rdbtnNewRadioButton_2.setBounds(598, 345, 106, 23);
//		contentPane.add(rdbtnNewRadioButton_2);
//		
//		JLabel lblNewLabel_1 = new JLabel("$100.00");
//		lblNewLabel_1.setBounds(126, 380, 61, 16);
//		contentPane.add(lblNewLabel_1);
//		
//		JLabel label_1 = new JLabel("$500.00");
//		label_1.setBounds(389, 380, 61, 16);
//		contentPane.add(label_1);
//		
//		JLabel label_2 = new JLabel("$1000.00");
//		label_2.setBounds(629, 380, 61, 16);
//		contentPane.add(label_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 468, 764, 12);
		contentPane.add(separator);
		table.setRowHeight(30);
		
		// JButton btnLoadFlights = new JButton("Load Flight Times");
		//		btnLoadFlights.addActionListener(new ActionListener() {
		//			public void actionPerformed(ActionEvent e) {
		//				
		//				try {
		//					String query = "select * from COMPANY";
		//					PreparedStatement pst = connection.prepareStatement(query);
		//					ResultSet rs = pst.executeQuery();
		//					
		//					table.setModel(DbUtils.resultSetToTableModel(rs));
		//					
		//					
		//				}catch (Exception e1){
		//					e1.printStackTrace();
		//				}
		//				
		//			}
		//			
		//		});
				
//				btnLoadFlights.setBounds(343, 304, 152, 29);
//		contentPane.add(btnLoadFlights);
		
		JLabel lblTrip = new JLabel("Trip");
		lblTrip.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrip.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblTrip.setBounds(70, 145, 107, 30);
		contentPane.add(lblTrip);
		
		table.setRowSelectionAllowed(false);
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{Atlanta.getName()+" - "+Miami.getName(), Date.getDeparture(), Atlanta.getName().substring(0,1)+Miami.getName().substring(0,1)+ (100 + (int) (Math.random() * 900)), Miami.getTime()+" (Duration: 1h"+(45 + (int) (Math.random() * 15))+"m)", Miami.getPrice()},
				{Miami.getName()+" - "+Atlanta.getName(), Date.getReturn(), Miami.getName().substring(0,1)+Atlanta.getName().substring(0,1)+ (100 + (int) (Math.random() * 900)), Atlanta.getTime()+" (Duration: 1h"+(45 + (int) (Math.random() * 15))+"m)", Atlanta.getPrice()},
			},
			new String[] {
				"Flight", "Date", "Flight number", "Time", "Price"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(1).setMinWidth(75);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setMinWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setMinWidth(150);
		table.getColumnModel().getColumn(4).setMinWidth(75);
		table.setCellSelectionEnabled(true);
		table.setBounds(70, 175, 635, 60);
		
		contentPane.add(table);
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTime.setBounds(415, 145, 183, 30);
		
		contentPane.add(lblTime);
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPrice.setBounds(598, 145, 107, 30);
		
		contentPane.add(lblPrice);
		lblNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumber.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNumber.setBounds(283, 145, 133, 30);
		
		contentPane.add(lblNumber);
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Dialog", Font.BOLD, 15));
		lblDate.setBounds(176, 145, 107, 30);
		
		contentPane.add(lblDate);
		lblMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblMain.setFont(new Font("Dialog", Font.BOLD, 15));
		lblMain.setBounds(308, 311, 133, 30);
		
		contentPane.add(lblMain);
		lblComfort.setHorizontalAlignment(SwingConstants.CENTER);
		lblComfort.setFont(new Font("Dialog", Font.BOLD, 15));
		lblComfort.setBounds(440, 311, 133, 30);
		
		contentPane.add(lblComfort);
		lblFirstClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstClass.setFont(new Font("Dialog", Font.BOLD, 15));
		lblFirstClass.setBounds(572, 311, 133, 30);
		
		contentPane.add(lblFirstClass);
		
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		table_1 = new JTable();
		table_1.setRowHeight(30);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{numberFormat.format(Price.getValue()), numberFormat.format(Price.getValue()*2), numberFormat.format(Price.getValue()*6)},
			},
			new String[] {
				"Main", "Comfort", "First Class"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(0).setMinWidth(100);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(1).setMinWidth(100);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(2).setMinWidth(100);
		table_1.setBounds(308, 343, 397, 30);
		contentPane.add(table_1);
		
		JLabel lblTotal = new JLabel("Subtotal:");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTotal.setBounds(171, 337, 75, 25);
		contentPane.add(lblTotal);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Dialog", Font.BOLD, 15));
		label_1.setBounds(125, 363, 175, 25);
		
		contentPane.add(label_1);
	}
}
