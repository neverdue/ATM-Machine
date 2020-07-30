import java.util.Scanner;
public class PIN {
	/**
	 * Method name: processPIN()
	 * Description: checks if the entered pin is valid or invalid and returns a value to indicate the same.
	 * 
	 *
	 * @param int output stores the result of processPIN()
	 * String value takes the input from the user and then it is compared with the correct pin for that account.
	 */
	public static int processPIN () {
		int output = 0;
		String value = CardServices.resultGUI;
		if(value.equals(CardServices.DB[CardServices.index_value].getcardPin()))
			output=1;
		return output;
	}
	/**
	 * Method name: eatCard
	 * Description: eats the card if the user enters the wrong pin 4 times.
	 * 
	 *
	 * @param int output stores the result of processPIN() to check if the user entered 4 wrong pins and then executes the proper statements.
	 */
	public static int eatCard() {
		int output = 0;
		for (int i = 0; i < 4; i++) {
			if(output==1)
				break;
			else
				output = processPIN();
		}
		return output;
	}
}

