package org.sample;

public class EncapsuProg2 {
	private int accountUserId;
	private int accountPassword;
	private int balance;
	public int getAccountUserId() {
		return accountUserId;
	}
	public void setAccountUserId(String userName) {
		if (userName.equals("Ezhil")) {
			this.accountUserId = 1;
		}
		else if (userName.equals("Peter")) {
			this.accountUserId = 1;
		}
		else if (userName.equals("David")) {
			this.accountUserId = 1;
		}
		else {
			this.accountUserId = 0;
			System.out.println("Invalid Username");
		}
	}
	public int getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String pass) {
		if (accountUserId==1&&pass.equals("Ezhil@123")) {
			System.out.println("Account login successfully");
			this.balance = 50000;
		}
		else if (accountUserId==1&&pass.equals("Peter#226")) {
			System.out.println("Account login successfully");
			this.balance = 40000;
		}
		else if (accountUserId==1&&pass.equals("David@321")) {
			System.out.println("Account login successfully");
			this.balance = 60000;
		}
		else {
			System.out.println("Invalid password");
		}
	}
	public int getBalance() {
		return balance;
	}
	
	

}
