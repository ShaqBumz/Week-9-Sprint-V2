import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Tax {

	private JFrame frame;
	private JTextField tfIncome;

	/**
	 * Launch the application.
	 */
	public static void Taxy() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tax window = new Tax();
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
	public Tax() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 639, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox cmbStatus = new JComboBox();
		cmbStatus.setBackground(Color.WHITE);
		cmbStatus.setModel(new DefaultComboBoxModel(new String[] {"Select Status", "Student", "Employed"}));
		cmbStatus.setSelectedIndex(0);
		cmbStatus.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		cmbStatus.setBounds(162, 197, 140, 22);
		frame.getContentPane().add(cmbStatus);
		
		JLabel lblTax = new JLabel("R 0.00");
		lblTax.setForeground(Color.WHITE);
		
		JButton btnCalc = new JButton("");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double rate1=0.04;
				double rate2= 0.08;
				double studLimit= 32000;
				double employLimit=64000;
				
				double tax1=0;
				double tax2=0;
				
				double Income = Double.parseDouble(tfIncome.getText());
				int Option = cmbStatus.getSelectedIndex();

				if (Option == 1) {
					
					if (Income<=studLimit) {
						tax1 = rate1 * Income;
						
						}else{
						tax1 = rate1 * studLimit;
						tax2 = rate2 * (Income-studLimit);
						}
					
					Double totalTax = tax1 + tax2;
					lblTax.setText("R " + Double.toString(totalTax));
					
					}

					
				
				
				if (Option == 2) {
					
					if (Income<=employLimit){
						  tax1=rate1*Income;
						}else{
						tax1=rate1*employLimit;
						tax2=rate2*(Income-employLimit );
						}
					Double totalTax = tax1 + tax2;
					lblTax.setText("R " + Double.toString(totalTax));
				
				}
				
			}
		});
		btnCalc.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 9 Sprint\\Images\\window_enter.png"));
		btnCalc.setBounds(393, 122, 128, 128);
		frame.getContentPane().add(btnCalc);
		
		btnCalc.setOpaque(false);
		btnCalc.setContentAreaFilled(false);
		btnCalc.setBorderPainted(false);
		
		tfIncome = new JTextField();
		tfIncome.setBounds(162, 166, 140, 20);
		frame.getContentPane().add(tfIncome);
		tfIncome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Monthly Income:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(162, 148, 140, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tax Forecaster");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(228, 45, 169, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Total Tax:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(238, 305, 154, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		lblTax.setHorizontalAlignment(SwingConstants.CENTER);
		lblTax.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblTax.setBounds(228, 343, 180, 22);
		frame.getContentPane().add(lblTax);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Bank Change = new Bank();
				Change.Banky();
				frame.setVisible(false);
			}
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 9 Sprint\\Images\\Logo.png"));
		btnBack.setBounds(28, 155, 64, 64);
		frame.getContentPane().add(btnBack);
		
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 9 Sprint\\Images\\geometric-background-red-frame-with-metal-grille-vector-20461754.jpg"));
		lblNewLabel_3.setBounds(0, 0, 626, 379);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
