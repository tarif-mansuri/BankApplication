package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for saving and checking accounts
	private String name;
	private String accountNumber;
	private double balance;
	private double rate;
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
	}

	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	// List of common methods
	
	public void showInfo() {
		System.out.println("NAME: "+name+"\nACCOUNT NUMBER: "+accountNumber+"\nBALANCE: "+balance);
	}
}
