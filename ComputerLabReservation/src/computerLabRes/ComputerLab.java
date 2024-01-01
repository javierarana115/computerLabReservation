package computerLabRes;

import java.util.Scanner;

public class ComputerLab {
  

	// Main method
	public static void main(String[] args) {
		Computers computers = new Computers();
		Scanner input = new Scanner(System.in);
		// 1. Create an array to store integer values that represents the lab setting
		// and seat status.
		int[] lab = new int[40];

		// 2. Set random values to simulate the current lab status: 0 for available, 1
		// for in-use, 2 for need-repair
		for (int i = 0; i < lab.length; i++) {
			lab[i] = (int) (Math.random() * 3);
		}

		// Welcome message
		System.out.println("Welcome to the campus lab. We are open 8 am - 10pm on Mon. through Fri.");

		// Loop for service choice and performance
		boolean flag = true;
		while (flag) {
			// Print service menu
			System.out.println();
			System.out.println("1. Display the seat status table.");
			System.out.println("2. How many seats are available now?");
			System.out.println("3. Reserve a seat.");
			System.out.println("4. Report a non-working computer.");
			System.out.println("5. Exit.");
			System.out.println();
			System.out.print("Select a service to continue: ");
			int choice = 0;
			choice = computers.validateInputCL(choice);

			switch (choice) {
			case 1:
				computers.seatTable(lab);
				break;
			case 2:
				System.out.printf("There are %d computers available in the lab right now.\n", computers.checkAvailability(lab));
				break;
			case 3:
				computers.reserveSeat(lab);
				break;
			case 4:
				computers.reportComputer(lab);
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Invalid service number. Please try again.");
			}
		}

		System.out.println("Thank you for using our lab! See you next time.");
		input.close();
	} 

}
