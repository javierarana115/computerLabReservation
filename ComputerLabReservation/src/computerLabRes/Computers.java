package computerLabRes;
import java.util.Scanner;

public class Computers extends ComputerLabUtil{
	Scanner input = new Scanner(System.in);

	// A method to print the seat table
	   public void seatTable(int [] lab){
	      // Display the seat table
	      // Table head - seat number
	      System.out.println("Seat #: 1 2 3 4     5 6 7 8");
	      System.out.println("---------------------------");
	     
	      // 5 rows
	      for (int r = 0; r < 5; r++) {
	         //Row number
	         System.out.print("Row #" + (r + 1) + ": ");
	         
	         // 4 seats at left
	         for (int s = 0; s < 4; s++) {
	            System.out.print(lab[8 * r + s] + " ");
	         }
	         
	         // spacing
	         System.out.print("    ");
	         
	         // 4 seats at right
	         for (int s = 4; s < 8; s++){
	            System.out.print(lab[8 * r + s] + " ");
	         }
	         
	         // Turn to the next row
	         System.out.println();
	      }
	   }
	   
	   // 3a. Count the current available seats
	   public int checkAvailability(int [] lab){
	      int count = 0;
	      for(int i = 0; i < lab.length; i ++){
	         if (lab[i] == 0) {
	            count++;
	         }
	      }
	      return count;
	   }
	   
	   // 4a. Request / reserve a seat
	   public void reserveSeat(int [] lab) {
	      System.out.print("To reserve a seat, provide a row number:\n");
	      int choice = 0;
	      int r = validateInputRow(choice) - 1;
	      System.out.print("Provide a seat number: ");
	      int s = validateInputSeat(choice) - 1;
	     
	      if (lab[8 * r + s] == 1) {
	         System.out.printf("The computer at Row %d and Seat %d is currently in use.\n", r + 1, s + 1);
	      } else if (lab[8 * r + s] == 2) {
	         System.out.printf("The computer at Row %d and Seat %d is currently in repair.\n", r + 1, s + 1);
	      }  else {
	         System.out.printf("You have successfully reserved the computer at Row %d, and Seat %d.\n", r + 1, s + 1);
	         lab[8 * r + s] = 1;
	      }
	     
	   }
	   
	   // 5a. Report a non-working computer
	   public void reportComputer(int [] lab) {
	      System.out.print("To report a non working computer, provide a row number:\n");
	      int choice = 0;
	      int r = validateInputRow(choice) - 1;	      
	      System.out.print("Provide seat number: ");
	      int s = validateInputSeat(choice) - 1;
	     
	      if (lab[8 * r + s] == 2) {
	         System.out.printf("The computer at Row %d and Seat %d is already being repaired.\n", r + 1, s + 1);
	      } else if (lab[8 * r + s] == 2) {
	         System.out.printf("The computer at Row %d and Seat %d is currently in use.\n", r + 1, s + 1);
	      } else {
	         System.out.printf("You have successfully reported the computer at Row %d, and Seat %d.\n", r + 1, s + 1);
	         lab[8 * r + s] = 2;
	      }
	   }
}
