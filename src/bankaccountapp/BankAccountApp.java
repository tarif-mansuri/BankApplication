package bankaccountapp;

import java.util.List;

import utilities.CSV;

public class BankAccountApp {
	public static void main(String[] args) {
		List<String[]> csvData = CSV.read("/home/local/ZOHOCORP/tarif-5329/Documents/workspace-spring-tool-suite-4-4.2.0.RELEASE/BankApplication/lib/NewBankAccounts.csv");
		for(String[] accountHolder : csvData) {
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
		}
	}
}
