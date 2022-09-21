package adressbook.constructday9;


import java.util.Scanner;


public class addANewContact {
	static Scanner scanner = new Scanner(System.in);

	public addANewContact(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber,String phoneNumber2) {
		
	}

	public addANewContact(String phoneNumber2) {
		
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
			
			System.out.println("Enter phone number1: ");
			String phoneNumber = scanner.next();
			
			System.out.println("Enter phone number2: ");
			String phoneNumber2 = scanner.next();
			
			addAPerson person = new addAPerson(firstName, lastName, address, city, state, zip, phoneNumber);
			addANewContact addANewContact = new addANewContact(phoneNumber2);
			
	
	
	
	}
}

