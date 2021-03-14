package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String companySuffix = "anshcompany.com";
	
	//Constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// method calling for asking the department
		this.department = setDepartment();	
		
		//method that return a random password
		this.password = randomPassword(defaultPasswordLength);	
		
		//combine name to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix; 
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.println("Department Codes:\n1 for Sales \n2 for Accounting \n3 for Development \n4 for None\nEnter the department- ");
		Scanner sc = new Scanner(System.in);
		int deptChoice = sc.nextInt();
		if(deptChoice == 1)
			return "sales";
		else if(deptChoice == 2)
			return "account";
		else if(deptChoice == 3)
			return "dev";
		else
			return "none";
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ)!@#$%^&*(0123456789";
		char[] password = new char[length];
		for(int i = 0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//get the info
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	//get the alternate email
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName + 
				"\nCompany Email: " + email +
				"\nPassword: " + password +
				"\nMailBox Capacity: " + mailBoxCapacity;
	}
}
