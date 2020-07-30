import java.util.Scanner;
public class CardServices {
	static ATMCard[] DB = new ATMCard[5];
	static int result;
	static int index_value;
	static int atmbal = 1000;
	static int outputProcessCard;
	static String resultGUI = "";
	/**
	 * Method name: initializeCardDB()
	 * Description: initializes the card database.
	 * 
	 *
	 * @param DB[] stores the card related information.
	 * int index_value stores the index at which the card matched. 
	 * int atmbal stores the amount of money available in the atm machine.
	 */
	public static void initializeCardDB() {

		DB[0] = new ATMCard();
		DB[1] = new ATMCard();
		DB[2] = new ATMCard();
		DB[3] = new ATMCard();
		DB[4] = new ATMCard();

		DB[0].setcardNum("123456789");
		DB[0].setcardPin("1111");
		DB[0].setcheckingbalance(500);
		DB[0].setsavingsbalance(200);
		DB[0].setnumoftransactions(2);

		DB[1].setcardNum("135792468");
		DB[1].setcardPin("2097");
		DB[1].setcheckingbalance(100);
		DB[1].setsavingsbalance(700);
		DB[1].setnumoftransactions(3);

		DB[2].setcardNum("019283746");
		DB[2].setcardPin("6194");
		DB[2].setcheckingbalance(1500);
		DB[2].setsavingsbalance(2500);
		DB[2].setnumoftransactions(5);

		DB[3].setcardNum("675849302");
		DB[3].setcardPin("0071");
		DB[3].setcheckingbalance(50);
		DB[3].setsavingsbalance(-1);
		DB[3].setnumoftransactions(0);

		DB[4].setcardNum("347821904");
		DB[4].setcardPin("9871");
		DB[4].setcheckingbalance(150);
		DB[4].setsavingsbalance(250);
		DB[4].setnumoftransactions(1);


	}
	/**
	 * Method name: insertCard()
	 * Description: takes card input and checks by comparing it with the value in the database if it is valid or not. 
	 * If not valid it returns a value that eventually prints "Unrecognized Card".
	 * 
	 *
	 * @param String value takes the card input from the user.
	 * int insertCardResult - stores the result whether it's a recognized card or not
	 * int index_value stores the index of the loop variable where the value matched.
	 */
	public static int insertCard() {
		String value = resultGUI;
		for(int i = 0; i < 5; i++) {
			if (value.equals(DB[i].getcardNum())) {
				ATMCard.insertCardResult = 1;
				index_value=i;
				break;
			}
		}
		if (DB[index_value].getcardNum().equals("0")) {
			System.out.println("THIS CARD HAS BEEN EATEN");
			ATMCard.insertCardResult=2;
		}
		return ATMCard.insertCardResult;
	}
	/**
	 * Method name: processCard()
	 * Description: initializes the cards database and displays the required messages by calling other classes.
	 * 
	 *
	 * @param String response takes the response for yes or no from the user.
	 * int outputProcessCard stores the value for the function which is then returned.
	 */
	public static int processCard() {
		outputProcessCard = 0;
		System.out.println("What would you like to do today?");
		System.out.println("1: Withdraw");
		System.out.println("2: Deposit");
		System.out.println("3: Transfer Funds");
		System.out.println("4: Check Balance");
		Scanner sc = new Scanner (System.in);
		String response = sc.next();
		outputProcessCard = Integer.parseInt(response);
		return outputProcessCard;
	}
	/**
	 * Method name: checktransactions()
	 * Description: checks if the number of transactions is greater than 5 and if it is then asks the user if they want to continue with the transaction.
	 * It also returns a value to indicate the same.
	 * 
	 *
	 * @param String result: It stores the response of the user.
	 */
	public static int checktransactions() {
		Scanner sc = new Scanner(System.in);
		if (DB[index_value].numoftransactions>=5 && Security.val == 2) {
			System.out.println("You have exceeded 5 transactions for this month, an additional fee of $1 will be charged");
			System.out.println("Do you want to proceed?");
			System.out.println("Enter yes or no");
			String result = sc.next();
			if(result.equals("yes"))
				return 1;
			else 
				return -1;
		}
		else
			return 0;
	}
	/**
	 * Method name: withdraw()
	 * Description: calls the appropriate methods to get an account selection and withdrawal amount.
	 * Then it calls methods from the Dispense class to give the money.
	 * It increases the number of transactions if the account selection is savings account.
	 * Also updates the account balance.
	 * Otherwise displays some message.
	 * 
	 *
	 * @param int output: Stores the result of Security.verifyMachineBalance()
	 * int result1 = Stores the result of checktransactions() and performs some actions according to this value.
	 */
	public static int withdraw() {
		int output = Security.verifyMachineBalance();
		int result1=0;
		if(output==1) {
			result1 = checktransactions();
			if(result1!=-1) {
				System.out.println("Total amount withdrawn: "+Money.result);
				System.out.println("Number of 20's: "+Dispense.twentys());
				System.out.println("Number of 10's: "+Dispense.tens());
				System.out.println("Number of 5's: "+Dispense.fives());
				System.out.println("Number of 1's: "+Dispense.ones());
				if(Security.val == 1) {
					DB[index_value].checking_balance-=Money.result;
					System.out.println("The current checking balance is "+DB[index_value].checking_balance);
				}
				else {
					if (result1 == 1) 
						DB[index_value].savings_balance-=(Money.result+1);
					else
						DB[index_value].savings_balance-=Money.result;
					System.out.println("The current savings balance is "+DB[index_value].savings_balance);
				}
				DB[index_value].numoftransactions += 1;
			}
		}
		else if (output==0)
			System.out.println("Out of Balance - cannot complete transaction");
		else if (output==-1)
			System.out.println("Savings account doesn't exist");
		else if (output==3)
			System.out.println("Insufficient Balance - cannot complete transaction");
		System.out.println("Thank you for using our services");
		System.out.println("You may withdraw you card now.");
		System.out.println("Have a great day!");
		return output;
	}
	/**
	 * Method name: deposit()
	 * Description: Allows the user to deposit some money into either their checkings or savings account based on their choice.
	 * 
	 *
	 * @param int output: Stores the result of Account.select() which returns the chosen account.
	 * int moneyinserted: Stores the amount entered by the user to be deposited into their account.
	 */
	public static void deposit() {
		Scanner sc = new Scanner (System.in);
		int output = Account.select();
		System.out.println("Enter the envelope with the funds");
		System.out.println("Enter the value inserted");
		int moneyinserted = sc.nextInt();
		if(output==1) {
			DB[index_value].checking_balance+=moneyinserted;
			System.out.println("The current checking balance is "+DB[index_value].checking_balance);
		}
		else {
			DB[index_value].savings_balance+=moneyinserted;
			System.out.println("The current savings balance is "+DB[index_value].savings_balance);
		}
	}
	/**
	 * Method name: checkbalance()
	 * Description: Displays the account balance for either the savings account or the checking account based on user input.
	 * 
	 *
	 * @param int output: Stores the result of Account.Select() that returns the chosen account.
	 */
	public static void checkbalance() {
		int output = Account.select();
		if(output==1)
			System.out.println("The current checking balance is "+DB[index_value].checking_balance);
		else
			System.out.println("The current savings balance is "+DB[index_value].savings_balance);
	}
	/**
	 * Method name: transfer()
	 * Description: Allows the user to transfer funds in between their checking and savings account.
	 * If the number of transactions for the month exceeds 5 for the savings account then the user is notified about the additional $1 charge and requests their authorization.
	 * Updates number of transactions
	 * 
	 * 
	 *
	 * @param int result1: Stores the result of checktransactions() 
	 * int output: Stores the value of Security.verifyMachineBalance() that ends up calling the Account.select() and Money.enterAmount() methods
	 * 
	 */
	public static void transfer() {
		int result1 = checktransactions();
		int output=0;
		if(result1==-1) {
			output = 5;
		}
		else
			output=Security.verifyMachineBalance();
		if(output==1) {
			if(Security.val==1) {
				if(result1==1) {
					DB[index_value].savings_balance+=(Money.result-1);
					DB[index_value].checking_balance-=Money.result;
					System.out.println("The current savings balance is "+DB[index_value].savings_balance);
				}
				else if (result1==0) {
					DB[index_value].savings_balance+=Money.result;
					DB[index_value].checking_balance-=Money.result;
					System.out.println("The current savings balance is "+DB[index_value].savings_balance);
				}
			}
			else {
				if(result1==1) {
					DB[index_value].checking_balance+=Money.result;
					DB[index_value].savings_balance-=(Money.result+1);
					System.out.println("The current checking balance is "+DB[index_value].checking_balance);
				}
				else if (result1==0) {
					DB[index_value].checking_balance+=Money.result;
					DB[index_value].savings_balance-=Money.result;
					System.out.println("The current checking balance is "+DB[index_value].checking_balance);
				}
			}
			DB[index_value].numoftransactions += 1;
		}
		else if (output==0)
			System.out.println("Out of Balance - cannot complete transaction");
		else if (output==-1)
			System.out.println("Savings account doesn't exist");
		else if (output==3)
			System.out.println("Insufficient Balance - cannot complete transaction");
	}
	/**
	 * Method name: returnCard()
	 * Description: calls appropriate methods to conduct the proper statements.
	 * first calls insertCard() to take input based on which it continues otherwise gives a message
	 * then it runs PIN.eatCard() to check if pin is valid and continues otherwise gives a message
	 * then it runs processCard() to operate the transaction if conditions are met otherwise gives a message
	 * 
	 * 
	 * 
	 *
	 * @param int output stores result of insertCard()
	 * int output_2 stores result of PIN.eatCard()
	 * int output_3 stores result of processCard()
	 */
	public static void returnCard() {
		Scanner sc = new Scanner (System.in);
		while(atmbal>0) {
			System.out.println("Hello there!");
			int output_3 = 0;
			int output = insertCard();
			if(output==0) {
				System.out.println("Unrecognized card");}
			else if (output!=2) {
				int output_2 = PIN.eatCard();
				if(output_2==0) {
					System.out.println("TOO MANY FAILED ATTEMPTS");
					System.out.println("WELP GOTTA EAT THIS CARD NOW!");
					DB[index_value].cardNum="0";
				}
				else {
					String finaleanswer = "yes";
					while(finaleanswer.equals("yes")) {
						output_3 = processCard();
						if (output_3 == 1) {	
							withdraw();
						}
						if(output_3==2) {
							deposit();
						}
						if(output_3==3) {
							transfer();
						}
						if(output_3==4) {
							checkbalance();
						}
						System.out.println("Do you want to complete another transaction?");
						finaleanswer = sc.next();
					}
				}
			}
		}

		System.out.println("Out of Balance - cannot complete any more transactions");
	}
}




