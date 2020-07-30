import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Keyboard extends FastCash {

	/**
	 * Method name: main()
	 * Description: initializes the cards database and displays the required output by calling other methods for the GUI
	 * 
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Keyboard obj = new Keyboard();
		CardServices.initializeCardDB();
		obj.go();
	}

	/**
	 * Method name: go()
	 * Description: inherits from FastCash to get panels and frames for constructing the keyboard for taking input.
	 * 
	 *
	 * @param inherits from FastCash
	 */
	public void go() {
		EnteredDigits = "";
		frame = new JFrame();
		panel = new JPanel();
		Font big = new Font("serif", Font.BOLD, 20);
		Font bigfont = new Font("sans-serif", Font.BOLD, 10);
		Font bigfont1 = new Font("sans-serif", Font.BOLD, 9);

		if(EnterPressedOnce == false)
			label = new JLabel("Please enter your card number: ");
		else
			label = new JLabel("Please enter your pin: ");
		panel.add(label);

		textarea = new JTextArea(EnteredDigits);
		textarea.setFont(big);
		panel.add(textarea);

		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		panel7 = new JPanel();
		panel8 = new JPanel();
		panel9 = new JPanel();
		panel10 = new JPanel();
		panel11 = new JPanel();

		button1 = new JButton("1");
		button1.addActionListener(new ButtonActionListener1());
		panel1.add(button1);

		button2 = new JButton("2");
		button2.addActionListener(new ButtonActionListener2());
		panel1.add(button2);

		button3 = new JButton("3");
		button3.addActionListener(new ButtonActionListener3());
		panel1.add(button3);

		button4 = new JButton("4");
		button4.addActionListener(new ButtonActionListener4());
		panel2.add(button4);

		button5 = new JButton("5");
		button5.addActionListener(new ButtonActionListener5());
		panel2.add(button5);

		button6 = new JButton("6");
		button6.addActionListener(new ButtonActionListener6());
		panel2.add(button6);

		button7 = new JButton("7");
		button7.addActionListener(new ButtonActionListener7());
		panel3.add(button7);

		button8 = new JButton("8");
		button8.addActionListener(new ButtonActionListener8());
		panel3.add(button8);

		button9 = new JButton("9");
		button9.addActionListener(new ButtonActionListener9());
		panel3.add(button9);

		button0 = new JButton("0");
		button0.addActionListener(new ButtonActionListener0());
		panel4.add(button0);

		buttonEnter = new JButton("ENTER");
		buttonEnter.setFont(bigfont);
		buttonEnter.addActionListener(new ButtonActionListenerEnter());
		panel5.add(buttonEnter);

		buttonClear = new JButton("CLEAR");
		buttonClear.setFont(bigfont);
		buttonClear.addActionListener(new ButtonActionListenerClear());
		panel6.add(buttonClear);

		buttonCancel = new JButton("CANCEL");
		buttonCancel.setFont(bigfont1);
		buttonCancel.addActionListener(new ButtonActionListenerCancel());
		panel7.add(buttonCancel);


		panel8.setLayout(new BoxLayout(panel8, BoxLayout.Y_AXIS));
		panel8.add(panel1);
		panel8.add(panel2);
		panel8.add(panel3);
		panel8.add(panel4);

		panel9.setLayout(new BoxLayout(panel9, BoxLayout.Y_AXIS));
		panel9.add(panel5);
		panel9.add(panel6);
		panel9.add(panel7);
		panel9.add(Box.createRigidArea(new Dimension(0, 40)));

		panel10.add(panel8);
		panel10.add(panel9);

		label1 = new JLabel();
		panel11.add(label1);

		frame.getContentPane().add(panel, BorderLayout.NORTH);
		frame.getContentPane().add(panel10, BorderLayout.CENTER);
		frame.getContentPane().add(panel11, BorderLayout.SOUTH);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350,230);
		frame.setVisible(true);

	}

	/**
	 * Class name: ButtonActionListener0
	 * Method name: actionPerformed()
	 * Description: enters the digit pressed
	 * 
	 *
	 * @param String EnteredDigits - stores the digits entered
	 * String resultGUI - stores the card number or pin number entered finally.
	 */
	class ButtonActionListener0 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(CardServices.resultGUI.length() < 9) {
				CardServices.resultGUI += button0.getText();
				if(EnterPressedOnce == true) 
					EnteredDigits=EnteredDigits+"*";
				else
					EnteredDigits=EnteredDigits+"0";
				textarea.setText(EnteredDigits);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener1
	 * Method name: actionPerformed()
	 * Description: enters the digit pressed
	 * 
	 *
	 * @param String EnteredDigits - stores the digits entered
	 * String resultGUI - stores the card number or pin number entered finally.
	 */
	class ButtonActionListener1 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(CardServices.resultGUI.length() < 9) {
				CardServices.resultGUI += button1.getText();
				if(EnterPressedOnce == true)
					EnteredDigits=EnteredDigits+"*";
				else
					EnteredDigits=EnteredDigits+"1";
				textarea.setText(EnteredDigits);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener2
	 * Method name: actionPerformed()
	 * Description: enters the digit pressed
	 * 
	 *
	 * @param String EnteredDigits - stores the digits entered
	 * String resultGUI - stores the card number or pin number entered finally.
	 */
	class ButtonActionListener2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(CardServices.resultGUI.length() < 9) {
				CardServices.resultGUI += button2.getText();
				if(EnterPressedOnce == true)
					EnteredDigits=EnteredDigits+"*";
				else
					EnteredDigits=EnteredDigits+"2";
				textarea.setText(EnteredDigits);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener3
	 * Method name: actionPerformed()
	 * Description: enters the digit pressed
	 * 
	 *
	 * @param String EnteredDigits - stores the digits entered
	 * String resultGUI - stores the card number or pin number entered finally.
	 */
	class ButtonActionListener3 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(CardServices.resultGUI.length() < 9) {
				CardServices.resultGUI += button3.getText();
				if(EnterPressedOnce == true)
					EnteredDigits=EnteredDigits+"*";
				else
					EnteredDigits=EnteredDigits+"3";
				textarea.setText(EnteredDigits);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener4
	 * Method name: actionPerformed()
	 * Description: enters the digit pressed
	 * 
	 *
	 * @param String EnteredDigits - stores the digits entered
	 * String resultGUI - stores the card number or pin number entered finally.
	 */
	class ButtonActionListener4 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(CardServices.resultGUI.length() < 9) {
				CardServices.resultGUI += button4.getText();
				if(EnterPressedOnce == true)
					EnteredDigits=EnteredDigits+"*";
				else
					EnteredDigits=EnteredDigits+"4";
				textarea.setText(EnteredDigits);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener5
	 * Method name: actionPerformed()
	 * Description: enters the digit pressed
	 * 
	 *
	 * @param String EnteredDigits - stores the digits entered
	 * String resultGUI - stores the card number or pin number entered finally.
	 */
	class ButtonActionListener5 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(CardServices.resultGUI.length() < 9) {
				CardServices.resultGUI += button5.getText();
				if(EnterPressedOnce == true)
					EnteredDigits=EnteredDigits+"*";
				else
					EnteredDigits=EnteredDigits+"5";
				textarea.setText(EnteredDigits);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener6
	 * Method name: actionPerformed()
	 * Description: enters the digit pressed
	 * 
	 *
	 * @param String EnteredDigits - stores the digits entered
	 * String resultGUI - stores the card number or pin number entered finally.
	 */
	class ButtonActionListener6 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(CardServices.resultGUI.length() < 9) {
				CardServices.resultGUI += button6.getText();
				if(EnterPressedOnce == true)
					EnteredDigits=EnteredDigits+"*";
				else
					EnteredDigits=EnteredDigits+"6";
				textarea.setText(EnteredDigits);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener7
	 * Method name: actionPerformed()
	 * Description: enters the digit pressed
	 * 
	 *
	 * @param String EnteredDigits - stores the digits entered
	 * String resultGUI - stores the card number or pin number entered finally.
	 */
	class ButtonActionListener7 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(CardServices.resultGUI.length() < 9) {
				CardServices.resultGUI += button7.getText();
				if(EnterPressedOnce == true)
					EnteredDigits=EnteredDigits+"*";
				else
					EnteredDigits=EnteredDigits+"7";
				textarea.setText(EnteredDigits);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener8
	 * Method name: actionPerformed()
	 * Description: enters the digit pressed
	 * 
	 *
	 * @param String EnteredDigits - stores the digits entered
	 * String resultGUI - stores the card number or pin number entered finally.
	 */
	class ButtonActionListener8 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(CardServices.resultGUI.length() < 9) {
				CardServices.resultGUI += button8.getText();
				if(EnterPressedOnce == true)
					EnteredDigits=EnteredDigits+"*";
				else
					EnteredDigits=EnteredDigits+"8";
				textarea.setText(EnteredDigits);
			}
		}
	}

	/**
	 * Class name: ButtonActionListener9
	 * Method name: actionPerformed()
	 * Description: enters the digit pressed
	 * 
	 *
	 * @param String EnteredDigits - stores the digits entered
	 * String resultGUI - stores the card number or pin number entered finally.
	 */
	class ButtonActionListener9 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(CardServices.resultGUI.length() < 9) {
				CardServices.resultGUI += button9.getText();
				if(EnterPressedOnce == true)
					EnteredDigits=EnteredDigits+"*";
				else
					EnteredDigits=EnteredDigits+"9";
				textarea.setText(EnteredDigits);
			}
		}
	}

	/**
	 * Class name: ButtonActionListenerEnter
	 * Method name: actionPerformed()
	 * Description: accounts for enter being pressed by calling appropriate methods.
	 * 
	 *
	 * @param boolean EnterPressedOnce - whether enter has been pressed once or not
	 * int insertCardResult - stores the result whether it's a recognized card or not
	 */
	class ButtonActionListenerEnter implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(EnterPressedOnce == true) {
				if(PIN.processPIN()==1) {
					frame.dispose();
					rightPIN();
				}
				else {
					label1.setText("INVALID PIN");
					EnteredDigits="";
					textarea.setText(EnteredDigits);
					CardServices.resultGUI="";
				}
			}
			else {
				CardServices.insertCard();
				if (ATMCard.insertCardResult == 1) {
					frame.dispose();
					EnterPressedOnce = true;
					CardServices.resultGUI="";
					go();
				}
				else {
					label1.setText("Unrecognized Card");
					EnteredDigits="";
					textarea.setText(EnteredDigits);
					CardServices.resultGUI="";
				}
			}
		}
	}

	/**
	 * Class name: ButtonActionListenerClear
	 * Method name: actionPerformed()
	 * Description: clears the text field of entered digits.
	 * 
	 *
	 * @param String EnteredDigits, String resultGUI
	 */
	class ButtonActionListenerClear implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			EnteredDigits="";
			textarea.setText(EnteredDigits);
			CardServices.resultGUI="";

		}

	}

	/**
	 * Class name: ButtonActionListenerCancel
	 * Method name: actionPerformed()
	 * Description: cancels the transaction.
	 * 
	 *
	 * @param
	 */
	class ButtonActionListenerCancel implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label1.setText("Transaction Cancelled");
			frame.getContentPane().add(label1, BorderLayout.CENTER);
			frame.setSize(200,70);
			panel10.setVisible(false);
			panel.setVisible(false);
			panel11.setVisible(false);
		}

	}

}


