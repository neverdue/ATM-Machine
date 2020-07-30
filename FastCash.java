import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FastCash {

	boolean EnterPressedOnce;
	JFrame frame;
	JFrame frame1;
	JTextArea textarea;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonEnter;
	JButton buttonClear;
	JButton buttonCancel;
	JButton buttonCancel1;
	JButton buttonCancel2;
	JButton buttonOther;
	JButton button20;
	JButton button40;
	JButton button60;
	JButton button80;
	JButton button100;
	JButton button200;
	JButton buttonFastCash;
	JButton buttonWithdrawal;
	JButton buttonDeposit;
	JButton buttonBalanceInquiry;
	JButton buttonTranfers_Payments;
	JButton buttonMore;
	JLabel label;
	JLabel label1;
	JLabel label2;
	JPanel panel;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	JPanel panel6;
	JPanel panel7;
	JPanel panel8;
	JPanel panel9;
	JPanel panel10;
	JPanel panel11;
	String EnteredDigits = "";
	int output;

	/**
	 * Method name: rightPIN()
	 * Description: works after valid pin is entered 
	 * 
	 *
	 * @param JFrame frame, frame1 - holds the panels
	 * JPanel panel,panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8,panel9,panel10,panel11 - holds buttons
	 * JLabel label,label1,label2 - displays messages
	 * JTextArea textarea - displays entered digits
	 * String EnteredDigits - to store the entered digits
	 * boolean EnterPressedOnce - whether enter has been pressed once or not
	 * bunch of buttons - for designated purposes
	 */

	public void rightPIN() {
		frame = new JFrame();
		frame1 = new JFrame();
		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();

		label1 = new JLabel();

		label = new JLabel("Please select a fast cash amount or other transactions:");
		panel.add(label);


		button20 = new JButton("20");
		button20.addActionListener(new ButtonActionListener20());
		panel1.add(button20);

		button40 = new JButton("40");
		button40.addActionListener(new ButtonActionListener40());
		panel1.add(button40);

		button60 = new JButton("60");
		button60.addActionListener(new ButtonActionListener60());
		panel1.add(button60);

		button80 = new JButton("80");
		button80.addActionListener(new ButtonActionListener80());
		panel2.add(button80);

		button100 = new JButton("100");
		button100.addActionListener(new ButtonActionListener100());
		panel2.add(button100);

		button200 = new JButton("200");
		button200.addActionListener(new ButtonActionListener200());
		panel2.add(button200);

		buttonCancel1 = new JButton("CANCEL");
		buttonCancel1.addActionListener(new ButtonActionListenerCancel1());
		panel3.add(buttonCancel1);

		panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);

		buttonOther = new JButton("Other Transactions");
		buttonOther.addActionListener(new ButtonActionListenerOther());
		panel5.add(buttonOther);

		label2 = new JLabel();

		frame.getContentPane().add(panel, BorderLayout.NORTH);
		frame.getContentPane().add(panel4, BorderLayout.WEST);
		frame.getContentPane().add(panel5, BorderLayout.EAST);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(510,180);
		frame.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);
		frame1.setSize(350,100);
	}

	/**
	 * Class name: ButtonActionListener20 
	 * Method name: actionPerformed()
	 * Description: withdraws specified amount if checking account has sufficient balance.
	 * 
	 *
	 * @param int output - it's value tells us if the account has sufficient balance.
	 * int result - the amount of money to be withdrawn.
	 */
	class ButtonActionListener20 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Money.result = 20;
			output = CardServices.withdraw();
			if(output==1) {
				label2.setText("$"+button20.getText()+" dispensed, thank you!");
				frame.dispose();
				frame1.getContentPane().add(label2);
				frame1.setVisible(true);
			}
			else if (output==3) {
				label2.setText("Insufficient Balance - cannot complete transaction");
				frame.dispose();
				frame1.getContentPane().add(label2);
				frame1.setVisible(true);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener40 
	 * Method name: actionPerformed()
	 * Description: withdraws specified amount if checking account has sufficient balance.
	 * 
	 *
	 * @param int output - it's value tells us if the account has sufficient balance.
	 * int result - the amount of money to be withdrawn.
	 */
	class ButtonActionListener40 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Money.result = 40;
			output = CardServices.withdraw();
			if(output==1) {
				label2.setText("$"+button40.getText()+" dispensed, thank you!");
				frame.dispose();
				frame1.getContentPane().add(label2);
				frame1.setVisible(true);
			}
			else if (output==3) {
				label2.setText("Insufficient Balance - cannot complete transaction");
				frame.dispose();
				frame1.getContentPane().add(label2);
				frame1.setVisible(true);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener60 
	 * Method name: actionPerformed()
	 * Description: withdraws specified amount if checking account has sufficient balance.
	 * 
	 *
	 * @param int output - it's value tells us if the account has sufficient balance.
	 * int result - the amount of money to be withdrawn.
	 */
	class ButtonActionListener60 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Money.result = 60;
			output = CardServices.withdraw();
			if(output==1) {
				label2.setText("$"+button60.getText()+" dispensed, thank you!");
				frame.dispose();
				frame1.getContentPane().add(label2);
				frame1.setVisible(true);
			}
			else if (output==3) {
				label2.setText("Insufficient Balance - cannot complete transaction");
				frame.dispose();
				frame1.getContentPane().add(label2);
				frame1.setVisible(true);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener80 
	 * Method name: actionPerformed()
	 * Description: withdraws specified amount if checking account has sufficient balance.
	 * 
	 *
	 * @param int output - it's value tells us if the account has sufficient balance.
	 * int result - the amount of money to be withdrawn.
	 */
	class ButtonActionListener80 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Money.result = 80;
			output = CardServices.withdraw();
			if(output==1) {
				label2.setText("$"+button80.getText()+" dispensed, thank you!");
				frame.dispose();
				frame1.getContentPane().add(label2);
				frame1.setVisible(true);
			}
			else if (output==3) {
				label2.setText("Insufficient Balance - cannot complete transaction");
				frame.dispose();
				frame1.getContentPane().add(label2);
				frame1.setVisible(true);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener100 
	 * Method name: actionPerformed()
	 * Description: withdraws specified amount if checking account has sufficient balance.
	 * 
	 *
	 * @param int output - it's value tells us if the account has sufficient balance.
	 * int result - the amount of money to be withdrawn.
	 */
	class ButtonActionListener100 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Money.result = 100;
			output = CardServices.withdraw();
			if(output==1) {
				label2.setText("$"+button100.getText()+" dispensed, thank you!");
				frame.dispose();
				frame1.getContentPane().add(label2);
				frame1.setVisible(true);
			}
			else if (output==3) {
				label2.setText("Insufficient Balance - cannot complete transaction");
				frame.dispose();
				frame1.getContentPane().add(label2);
				frame1.setVisible(true);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener200 
	 * Method name: actionPerformed()
	 * Description: withdraws specified amount if checking account has sufficient balance.
	 * 
	 *
	 * @param int output - it's value tells us if the account has sufficient balance.
	 * int result - the amount of money to be withdrawn.
	 */
	class ButtonActionListener200 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Money.result = 200;
			output = CardServices.withdraw();
			if(output==1) {
				label2.setText("$"+button200.getText()+" dispensed, thank you!");
				frame.dispose();
				frame1.getContentPane().add(label2);
				frame1.setVisible(true);
			}
			else if (output==3) {
				label2.setText("Insufficient Balance - cannot complete transaction");
				frame.dispose();
				frame1.getContentPane().add(label2);
				frame1.setVisible(true);
			}
		}
	}

	/**
	 * Class name: ButtonActionListenerOther
	 * Method name: actionPerformed()
	 * Description: calls other transactions to display those options.
	 * 
	 *
	 * @param 
	 */
	class ButtonActionListenerOther implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.dispose();
			otherTransactions();
		}
	}

	/**
	 * Class name: ButtonActionListenerCancel1
	 * Method name: actionPerformed()
	 * Description: cancels the transaction.
	 * 
	 *
	 * @param
	 */
	class ButtonActionListenerCancel1 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("Transaction Cancelled");
			frame.dispose();
			frame1.getContentPane().add(label);
			frame1.setVisible(true);
		}
	}

	public void otherTransactions() {
		frame = new JFrame();
		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

		label = new JLabel("Select your transaction");
		panel.add(label);

		buttonFastCash = new JButton("Fast Cash");
		buttonFastCash.addActionListener(new ButtonActionListenerFastCash());
		panel1.add(buttonFastCash);

		buttonWithdrawal = new JButton("Withdrawal");
		buttonWithdrawal.addActionListener(new ButtonActionListenerWithdrawal());
		panel1.add(buttonWithdrawal);

		buttonDeposit = new JButton("Depsoit");
		buttonDeposit.addActionListener(new ButtonActionListenerDeposit());
		panel1.add(buttonDeposit);

		buttonBalanceInquiry = new JButton("Balance and Inquiry");
		buttonBalanceInquiry.addActionListener(new ButtonActionListenerBalanceInquiry());
		panel1.add(buttonBalanceInquiry);

		buttonTranfers_Payments = new JButton("Transfers and Payments");
		buttonTranfers_Payments.addActionListener(new ButtonActionListenerTransfers_Payments());
		panel1.add(buttonTranfers_Payments);

		buttonMore = new JButton("More Options >");
		buttonMore.addActionListener(new ButtonActionListenerMore());
		panel2.add(buttonMore);

		buttonCancel2 = new JButton("CANCEL");
		buttonCancel2.addActionListener(new ButtonActionListenerCancel2());
		panel2.add(buttonCancel2);

		frame.getContentPane().add(panel, BorderLayout.NORTH);
		frame.getContentPane().add(panel1, BorderLayout.EAST);
		frame.getContentPane().add(panel2, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(400,255);
		frame.setVisible(true);
	}

	class ButtonActionListenerFastCash implements ActionListener {
		public void actionPerformed(ActionEvent event) {

		}
	}

	class ButtonActionListenerWithdrawal implements ActionListener {
		public void actionPerformed(ActionEvent event) {

		}
	}

	class ButtonActionListenerDeposit implements ActionListener {
		public void actionPerformed(ActionEvent event) {

		}
	}

	class ButtonActionListenerBalanceInquiry implements ActionListener {
		public void actionPerformed(ActionEvent event) {

		}
	}

	class ButtonActionListenerTransfers_Payments implements ActionListener {
		public void actionPerformed(ActionEvent event) {

		}
	}

	class ButtonActionListenerMore implements ActionListener {
		public void actionPerformed(ActionEvent event) {

		}
	}

	/**
	 * Class name: ButtonActionListenerCancel2
	 * Method name: actionPerformed()
	 * Description: cancels the transaction.
	 * 
	 *
	 * @param 
	 */
	class ButtonActionListenerCancel2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.dispose();
			rightPIN();
		}
	}
}

