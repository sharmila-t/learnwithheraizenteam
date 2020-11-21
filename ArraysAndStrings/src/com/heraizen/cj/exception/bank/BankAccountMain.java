package com.heraizen.cj.exception.bank;

public class BankAccountMain {

	public static void main(String[] args) throws InsufficientfundException {
		BankAccount bankAccount=new BankAccount("Sharmila", "Savings", 45000);
		bankAccount.deposit(45000);
		SavingsAccount sav=new SavingsAccount("shalini", "Savings", 300);
		sav.withDraw(300);
		System.out.println(sav.toString());
		
	}

}
