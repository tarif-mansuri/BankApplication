package bankaccountapp;

public abstract class Account implements IBaseRate {
	//List common properties for saving and checking accounts
	private String name;
	private String accountNumber;
	private double balance;
	private double rate;
	private String sSN; // Social Security number
	
	//Constructor to set base properties and initialize the account
	public Account(String name, String sSN, int initDeposit) {
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;
	}
	//List of common methods
}
