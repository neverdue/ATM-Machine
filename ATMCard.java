import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//
//COP2510–Spring Semester, 2020
//
//Homework #3: The ATM Machine's GUI
//
//Mayank Pandey
//

public class ATMCard{
	/**
	 * 
	 * Description: global values for taking user input for card numbers and pins
	 * 
	 *
	 * @param String cardNum, String cardPIN, int checking_balance, int savings_balance, int numoftransactions
	 */
	String cardNum;
	String cardPIN;
	int checking_balance;
	int savings_balance;
	int numoftransactions;
	static int insertCardResult;

	/**
	 * Method name: getcardNum()
	 * Description: returns cardNum
	 * 
	 *
	 * @param args
	 */
	String getcardNum() {
		return cardNum;
	}

	/**
	 * Method name: setcardNum()
	 * Description: assigns value of card to cardNum
	 * 
	 *
	 * @param String card is a string value given to the function
	 */
	void setcardNum(String card) {
		cardNum = card;
	}

	/**
	 * Method name: getcardPin()
	 * Description: returns cardPIN
	 * 
	 *
	 * @param args
	 */
	String getcardPin() {
		return cardPIN;
	}

	/**
	 * Method name: setcardPin()
	 * Description: assigns value of PIN to cardPIN
	 * 
	 *
	 * @param String PIN stores the String value given
	 */
	void setcardPin(String PIN) {
		cardPIN = PIN;
	}

	/**
	 * Method name: getcheckingbalance()
	 * Description: returns checking_balance
	 * 
	 *
	 * @param args
	 */
	int getcheckingbalance() {
		return checking_balance;
	}

	/**
	 * Method name: setcheckingbalance()
	 * Description: assigns value of checkbal to checking_balance
	 * 
	 *
	 * @param int checkbal stores the integer value given
	 */
	void setcheckingbalance(int checkbal) {
		checking_balance = checkbal;
	}

	/**
	 * Method name: getsavingsbalance()
	 * Description: returns savings_balance
	 * 
	 *
	 * @param args
	 */
	int getsavingsbalance() {
		return savings_balance;
	}

	/**
	 * Method name: setsavingsbalance()
	 * Description: assigns the value of savingbal to savings_balance
	 * 
	 *
	 * @param int savingbal stores the integer value given
	 */
	void setsavingsbalance(int savingbal) {
		savings_balance = savingbal;
	}

	/**
	 * Method name: getnumoftransactions()
	 * Description: returns numoftransactions
	 * 
	 *
	 * @param args
	 */
	int getnumoftransactions() {
		return numoftransactions;
	}

	/**
	 * Method name: setnumoftransactions()
	 * Description: assigns the value of numberoftransactions to numoftransactions
	 * 
	 *
	 * @param args
	 */
	void setnumoftransactions(int numberoftransactions) {
		numoftransactions = numberoftransactions;
	}

}


