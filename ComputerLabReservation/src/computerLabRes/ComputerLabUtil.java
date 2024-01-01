package computerLabRes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputerLabUtil {
	public Scanner input = new Scanner(System.in);

	public int validateInputCL(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 5 && userInput >= 1) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter a menu choice");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a menu choice");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}
	
	public int validateInputSeat(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 8 && userInput >= 1) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter an integer (1-8)");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter an integer (1-8)");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}
	
	public int validateInputRow(int userInput) {

		boolean validInput = false;

		while (!validInput) {
			try {
				userInput = input.nextInt();
				if (userInput <= 5 && userInput >= 1) {
					validInput = true;
				} else {
					input.nextLine();
					System.out.println("Please enter an integer (1-5)");
					validInput = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter an integer (1-5)");
				input.nextLine();
				validInput = false;
			}
		}
		return userInput;

	}
}
