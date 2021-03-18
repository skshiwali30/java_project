package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Checking chAccount = new Checking("checking", "87654398", 1500);
//		Savings svAccount = new Savings("saving", "9853425", 2300);
//		chAccount.showInfo();
//		System.out.println("****************************");
//		svAccount.showInfo();
//		svAccount.deposit(50000);
//		svAccount.withdraw(5000);
//		svAccount.compound();
//		
		
		String file = "C:\\Document\\Files\\NewBankAccounts.csv";
		List<Account> accounts = new LinkedList<Account>();
		
		//read a csv file and creste new csv account
		List<String[]> newAccountHolder = new utilities.CSV().read(file);
		
		for (String[] accountHolder : newAccountHolder) {
			String name = accountHolder[0];
			String ssn = accountHolder[1]; 
			String accountType = accountHolder[2];
			double deposite = Double.parseDouble(accountHolder[3]);
			System.out.println("New Account Holder");
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, ssn, deposite));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, ssn, deposite));
			}
			else {
				System.out.println("Error reading account..");
			}
		}
		
		for (Account acc : accounts) {
			System.out.println("************************");
			acc.showInfo();
		}
	}

}
