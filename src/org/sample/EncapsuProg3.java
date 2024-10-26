package org.sample;

public class EncapsuProg3 extends EncapsuProg2{

	public static void main(String[] args) {
		EncapsuProg3 e = new EncapsuProg3();
		e.setAccountUserId("Ezh");
		e.setAccountPassword("Ezhil@123");
		int bal = e.getBalance();
		System.out.println("Account balance: "+bal);
	}

}
