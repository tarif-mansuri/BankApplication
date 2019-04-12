package bankaccountapp;

public class Checking extends Account {
	//List the properties specific to checking accounts
	private long debitCardNumber;
	private long debitCardPIN;
	//Constructor to initialize checking account properties
	public Checking(String name, String sSN, int initDeposit) {
		super(name,sSN,initDeposit);
		setDebitCard();
	}
	private void setDebitCard() {
		debitCardNumber = (long)(Math.random()*Math.pow(10, 12));
		debitCardPIN = (long)(Math.random()*Math.pow(10, 4));
		//System.out.println("CARD: "+this.debitCardNumber+"\nPIN: "+this.debitCardPIN);
		
	}
	//List Checking account specific methods
	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your Checking account features"+
				"\n Debit Card Number: "+debitCardNumber+
				"\n Debit Card PIN: "+debitCardPIN
				);
	}
}
