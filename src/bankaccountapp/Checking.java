package bankaccountapp;

public class Checking extends Account {
	//List the properties specific to checking accounts
	private int debitCardNumber;
	private int debitCardPIN;
	//Constructor to initialize checking account properties
	public Checking(String name, String sSN, int initDeposit) {
		super(name,sSN,initDeposit);
		System.out.print("New Checking Account");
	}
	//List Checking account specific methods
}
