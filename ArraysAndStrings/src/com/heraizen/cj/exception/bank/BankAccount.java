package com.heraizen.cj.exception.bank;

public class BankAccount {
	int accNo;
	String custName;
	String accountType;
	double balance;

	public BankAccount(String custName, String accountType, double balance) {
		this.accNo = IdGenerator.newId();
		this.custName = custName;
		this.accountType = accountType;
		this.balance = balance;
	}

	public void withDraw(double amount) throws InsufficientfundException   {
		if (amount > this.balance) {
			throw new InsufficientfundException("Sorry you dont have sufficient balance" + amount);

		} else {
			this.balance -= amount;
			System.out.println("Balance is"+balance);
		}
		
	}
	public double deposit(double amount) {
		this.balance += amount;
		return amount;

	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankAccount [accNo=").append(accNo).append(", custName=").append(custName)
				.append(", accountType=").append(accountType).append(", balance=").append(balance).append("]");
		return builder.toString();
	}

	

}
