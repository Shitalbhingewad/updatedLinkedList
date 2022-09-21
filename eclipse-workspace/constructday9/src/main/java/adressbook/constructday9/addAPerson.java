package adressbook.constructday9;



import java.util.Scanner;




public class addAPerson {
	static Scanner scanner = new Scanner(System.in);

	public addAPerson(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber) {
		
	}

	public static void main(String[] args) {
		 System.out.println("Enter first and last name: ");
			String firstName = scanner.next();
			String lastName = scanner.next();
			
			System.out.print("Enter complete address: ");
			scanner.nextLine();
			String address = new String();
			
			System.out.print("Enter city, state and zip: ");
			String city = scanner.next();
			String state = scanner.next();
			String zip = scanner.next();
			
			System.out.println("Enter phone number: ");
			String phoneNumber = scanner.next();
			
			addAPerson person = new addAPerson(firstName, lastName, address, city, state, zip, phoneNumber);
	}
}
