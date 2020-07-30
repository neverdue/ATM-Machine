
import java.util.Scanner;
public class Account {
	/**
	 * Method name: select()
	 * Description: presents the user with a choice for choosing the checkings account or the savings account.
	 * 
	 *
	 * @param String action stores the result of the user input.
	 * int answer converts the value in action to integer type which is then returned.
	 * String answerDependent: If the user selects to transfer then this variable changes the displayed message accounting for the text "Source Account".
	 */
	public static int select() {
		Scanner sc = new Scanner (System.in);
		String answerDependent = " ";
		if(CardServices.outputProcessCard==3)
			answerDependent = " source ";
		System.out.println("Please select the"+answerDependent+"account: ");
		System.out.println("1. Checkings Account");
		System.out.println("2. Savings Account");
		System.out.println("Enter 1 or 2");
		String action = sc.next();
		int answer = Integer.parseInt(action);
		return answer;
	}
}
