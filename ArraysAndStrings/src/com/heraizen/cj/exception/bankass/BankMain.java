package com.heraizen.cj.exception.bankass;

public class BankMain {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(100, "Kavya", "Saving", 500);
		bankAccount.deposit(2000);
		bankAccount.display();
		bankAccount.withdraw(500);
		bankAccount.display();
		bankAccount.withdraw(2000);
		bankAccount.getBalance();
		bankAccount.display();
	}

}
