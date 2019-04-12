package bankaccountapp;

import java.io.ObjectInputStream.GetField;

public abstract class Account implements IBaseRate {
	// List common properties for saving and checking accounts
	private String name;
	private String accountNumber;
	private double balance;
	public double rate;
	private String sSN; // Social Security number

	private static int index = 10000;

	// Constructor to set base properties and initialize the account
	public Account(String name, String sSN, int initDeposit) {
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;
		
		//set account number
		index++;
		accountNumber = setAccountNumber();
		setRate();
	}

	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	// List of common methods transactions
	public void showInfo() {
		System.out.println("NAME: "+name+"\nACCOUNT NUMBER: "+accountNumber+"\nBALANCE: "+balance+
				"\nRate: "+rate+"%");
	}
	public abstract void setRate();
	
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("depositing $"+amount);
		printBalence();
	}
	public void withdraw(double amount) {
		balance = balance-amount;
		System.out.println("withdrawing $"+amount);
		printBalence();
	}
	public void transfer(String toWhere, double amount) {
		System.out.println("Transfering $"+amount+" to "+toWhere);
		printBalence();
	}
	public void printBalence() {
		System.out.println("Your balence now: $"+balance);
	}
}
