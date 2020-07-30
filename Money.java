
import java.util.Scanner;
public class Money {
	/**
	 * Method name: enterAmount()
	 * Description: Asks the user to enter their withdrawal amount.
	 * 
	 *
	 * @param String result1 stores the withdrawal amount.
	 * int result stores the value from result in integer type.
	 */
	static int result;
	public static void enterAmount() {
		System.out.println("Enter the amount: ");
		Scanner sc = new Scanner (System.in);
		String result1 = sc.next();
		result = Integer.parseInt(result1);	
	}
}
