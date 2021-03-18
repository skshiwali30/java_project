package bankaccountapp;

public abstract class Account implements IBaseRate {

	//list common properties for savings and checking accounts
	private String name;
	private String ssn;
	private double balance;
	protected String accountNumber;
	protected double rate;
	private static int index = 10000;
	
	//constructor for base properties
	public Account(String name, String ssn, double deposite) {
		this.name = name;
		this.ssn = ssn;
		balance = deposite + 100;
				
		//set account no
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposite Amount: $" + balance);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawal Amount: $" + balance);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transferring $" + amount + " to " + toWhere);
		printBalance();
	}
	
	//common methods
	private String setAccountNumber() {
		String lastTwoOfSsn = ssn.substring(ssn.length()-2, ssn.length());
		int uniqueId = index;
		int randomNumber = (int)(Math.random() * Math.pow(10, 3));
		return lastTwoOfSsn + uniqueId + randomNumber;
	}
	
	public void compound() {
		double accountInterest = balance * (rate/100);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("You balance is now: $" + balance);
	}
	
	public void showInfo() {
		System.out.println("Name: " + name +
				"\nAccount Number: " + accountNumber +
				"\nBalance: " + balance +
				"\nRate: " + rate);
	}
}
