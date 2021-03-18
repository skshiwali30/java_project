package bankaccountapp;

public class Checking extends Account{
	// properties related to checking 
	private int debitCardNumber;
	private int debitCardPin;
	
	//constructor
	public Checking(String name, String ssn, double deposite) {
		super(name, ssn, deposite);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
	
	// list method related to checking account	
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPin = (int)(Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Checking Account Feature- \nDebit card Number: " + debitCardNumber +
				"\nDebit Card PIN: " + debitCardPin);
	}
}
