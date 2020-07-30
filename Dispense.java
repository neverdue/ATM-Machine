
public class Dispense {
	static int amount;
	static int num_of_twenty = 25;
	static int num_of_tens = 25;
	static int num_of_fives = 40;
	static int num_of_ones = 50;
	/**
	 * Global variable num_of_twenty stores the number of bills present.
	 * Method name: twentys()
	 * Description: gives out the money in $20 bills until amount left is greater than or equal to 20.
	 * Updates the number of bills left with the help of a counter variable.  
	 * 
	 *
	 * @param int counter counts the number of bills given for the respective denomination.
	 * int amount stores the requested withdrawal amount from the user .
	 */
	public static int twentys() {
		amount = Money.result;
		CardServices.atmbal = CardServices.atmbal - amount;
		int counter = 0;
		for(int i = 0; i<num_of_twenty; i++) {

			if((amount-20) >= 0) {
				counter++;
				amount = amount-20;
			}
			else
				break;
		}
		num_of_twenty=num_of_twenty-counter;
		return counter;
	}
	/**
	 * Global variable num_of_tens stores the number of bills present.
	 * Method name: tens()
	 * Description: gives out the money in $10 bills until amount left is greater than or equal to 10.  
	 * Updates the number of bills left with the help of a counter variable. 
	 *
	 * @param int counter counts the number of bills given for the respective denomination.
	 * int amount stores the requested withdrawal amount from the user .
	 */
	public static int tens() {
		int counter = 0;
		for(int i = 0; i<num_of_tens; i++) {
			if((amount-10) >= 0) {
				counter++;
				amount = amount-10;
			}
			else
				break;
		}
		num_of_tens=num_of_tens-counter;
		return counter;
	}
	/**
	 * Global variable num_of_fives stores the number of bills present.
	 * Method name: fives()
	 * Description: gives out the money in $5 bills until amount left is greater than or equal to 5.  
	 * Updates the number of bills left with the help of a counter variable. 
	 *
	 * @param int counter counts the number of bills given for the respective denomination.
	 * int amount stores the requested withdrawal amount from the user .
	 */
	public static int fives() {
		int counter = 0;
		for(int i = 0; i<num_of_fives; i++) {
			if((amount-5) >= 0) {
				counter++;
				amount = amount-5;
			}
			else
				break;
		}
		num_of_fives=num_of_fives-counter;
		return counter;
	}
	/**
	 * Global variable num_of_ones stores the number of bills present.
	 * Method name: ones()
	 * Description: gives out the money in $1 bills until amount left is greater than or equal to 1.  
	 * Updates the number of bills left with the help of a counter variable. 
	 *
	 * @param int counter counts the number of bills given for the respective denomination.
	 * int amount stores the requested withdrawal amount from the user .
	 */
	public static int ones() {
		int counter = 0;
		for(int i = 0; i<num_of_ones; i++) {
			if((amount-1) >= 0) {
				counter++;
				amount = amount-1;
			}
			else
				break;
		}
		num_of_ones=num_of_ones-counter;
		return counter;
	}
}
