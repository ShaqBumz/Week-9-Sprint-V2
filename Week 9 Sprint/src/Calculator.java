import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField tfItem;
	private JTextField tfAmount;
	private JTextField tfTime;
	private JTextField tfRate;

	/**
	 * Launch the application.
	 */
	public static void Calc() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 643, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Payment Item:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(60, 140, 126, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfItem = new JTextField();
		tfItem.setBounds(60, 162, 126, 20);
		frame.getContentPane().add(tfItem);
		tfItem.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Loan Amount:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(60, 204, 126, 21);
		frame.getContentPane().add(lblNewLabel);
		
		
		tfAmount = new JTextField();
		tfAmount.setBounds(60, 225, 126, 20);
		frame.getContentPane().add(tfAmount);
		tfAmount.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Duration:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(247, 140, 126, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfTime = new JTextField();
		tfTime.setBounds(247, 162, 126, 20);
		frame.getContentPane().add(tfTime);
		tfTime.setColumns(10);
		
		tfRate = new JTextField();
		tfRate.setBounds(247, 225, 126, 20);
		frame.getContentPane().add(tfRate);
		tfRate.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Interest Rate");
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(247, 205, 126, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total Loan Amount:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(240, 329, 155, 21);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setForeground(Color.WHITE);
		lblAmount.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setBounds(240, 359, 155, 21);
		frame.getContentPane().add(lblAmount);
		lblAmount.setText("R 0.00");
		
		JButton btnCalc = new JButton("");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Item = tfItem.getText();
				
				int TotalAmount = 0;
				
				int Duration = Integer.parseInt(tfTime.getText());
				int LoanAmount = Integer.parseInt(tfAmount.getText());
				int InterestRate = Integer.parseInt(tfRate.getText());
				
				TotalAmount = LoanAmount * InterestRate/100 * Duration + LoanAmount;
				
				lblAmount.setText("R " + Integer.toString(TotalAmount) + ".00");
				
				
				
				
			}
		});
		btnCalc.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 9 Sprint\\Images\\window_enter.png"));
		btnCalc.setBounds(439, 130, 128, 128);
		frame.getContentPane().add(btnCalc);
		
		JLabel lblNewLabel_7 = new JLabel("Financial");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(272, 27, 155, 21);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("Calculator");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(272, 51, 155, 21);
		frame.getContentPane().add(lblNewLabel_6);
		
		btnCalc.setOpaque(false);
		btnCalc.setContentAreaFilled(false);
		btnCalc.setBorderPainted(false);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 9 Sprint\\Images\\Logo.png"));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Bank Change = new Bank();
				Change.Banky();
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(216, 11, 64, 64);
		frame.getContentPane().add(btnBack);
		
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\shaqu\\eclipse-workspace\\Week 9 Sprint\\Images\\newblue.jpg"));
		lblNewLabel_5.setBounds(0, 0, 626, 393);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
