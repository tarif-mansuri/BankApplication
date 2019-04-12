package bankaccountapp;

public class Savings extends Account{
	//List the properties specific to checking accounts
	private int safetyDepositBoxID;
	private int safetyDepositBoxKEY;
	
	//Constructor to initialize checking account properties
	public Savings(String name, String sSN, int initDeposit) {
		super(name,sSN,initDeposit);
		setSafetyDepositBox();
	}
	
	//List Checking account specific methods
	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your savings account features"+
				"\n Safety deposit box ID: "+safetyDepositBoxID+
				"\n Safety deposit box Key: "+safetyDepositBoxKEY
				);
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxKEY = (int)(Math.random()*Math.pow(10, 4));
	}

}
