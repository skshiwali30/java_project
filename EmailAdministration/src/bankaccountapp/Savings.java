package bankaccountapp;

public class Savings extends Account {
	
	private int safteyDepositeBoxID;
	private int safteyDepositeBoxKey;
	
	//constructor
	public Savings(String name, String ssn, double deposite) {
		super(name, ssn, deposite);
		accountNumber = "1" + accountNumber;
		
		setSafetyDepositeBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	
	private void setSafetyDepositeBox() {
		safteyDepositeBoxID = (int)(Math.random() * Math.pow(10, 3));
		safteyDepositeBoxKey = (int)(Math.random() * Math.pow(10, 4));
	}
	
	//method specific to savings
	public void showInfo() {
		super.showInfo();
		System.out.println("Savings Account Feature- \nSafety Deposite Box ID: " + safteyDepositeBoxID +
				"\nSafety Deposite Box Key: " + safteyDepositeBoxKey);
	}
}
