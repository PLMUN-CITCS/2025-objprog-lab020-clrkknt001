package OOB;
import java.util.Scanner;
public class MenuDrivenProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int choice;

        while (true) {
            displayMenu();
            choice = s.nextInt();
            handleMenuChoice(choice);
 
        }
	}
	
	static void displayMenu() {
		System.out.print("Menu:\n" + "1. Greet User\n" + "2. Check Even/Odd\n" + "3. Exit\n" );
		System.out.print("Enter your choice: ");
	}
	static void handleMenuChoice(int choice) {
		 if (choice == 1) {
	            greetUser();
	        } else if (choice == 2) {
	            checkEvenOrOdd();
	        } else if (choice == 3) {
	            System.out.println("Exiting program...");
	            System.exit(0);
	        } else {
	            System.out.println("Invalid choice. Please try again.");
	        }
	    }
	
	public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }
	
	public static void checkEvenOrOdd() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
            int number = s.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
	
        }
	}

