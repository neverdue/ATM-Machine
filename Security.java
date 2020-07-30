
public class Security {
	static int val;
	/**
	 * Method name: verifyBalance()
	 * Description: verifies if the user has enough balance in their requested account.
	 * 
	 *
	 * @param int val stores the choice of account accessible to all classes
	 * int answer stores the user choice for checkings/savings
	 * int output stores result of verifyBalance()
	 */
	public static int verifyBalance() {
		//int answer = Account.select();
		val = 1;
		int output = 0;
		if (val==2 && CardServices.DB[CardServices.index_value].getsavingsbalance()==-1) {
			output = -1;
			return output;
		}
		//Money.enterAmount();
		if(val==1) {
			if(Money.result  <= CardServices.DB[CardServices.index_value].getcheckingbalance()) {
				output= 1;}
		}

		else if (val==2) {
			if(Money.result <= CardServices.DB[CardServices.index_value].getsavingsbalance()) {
				output=1;}
		}
		return output;	
	}
	/**
	 * Method name: verifyMachineBalance()
	 * Description: verifies if the machine has enough balance to dispense out the money.
	 * 
	 *
	 * @param int answer stores the result of verifyBalance() and uses it to run the appropriate statements.
	 * int output stores the result of verifyMachineBalance()
	 */
	public static int verifyMachineBalance() {
		int answer = verifyBalance();
		int output = 0;
		if(Money.result<=CardServices.atmbal) {
			if(answer==1) {
				output=1;}
			else if (answer==-1) {
				output=-1;}
			else if (answer==0) {
				output=3;
			}
		}
		else {
			if(answer==-1) {
				output=-1;}
		}
		return output;	
	}
}

