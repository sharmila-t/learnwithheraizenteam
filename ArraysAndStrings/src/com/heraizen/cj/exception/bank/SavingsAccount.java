package com.heraizen.cj.exception.bank;

public class SavingsAccount extends BankAccount {
	private double minBalance = 1000;

	public SavingsAccount(String custName, String accountType, double balance) {
		super(custName, accountType, balance);
	}

	@Override
	public void withDraw(double amount) throws InsufficientfundException {
		if (amount > this.balance - minBalance) {
			throw new InsufficientfundException("Sorry you dont  have sufficient balance to withdraw" + amount);

		} else {
			this.balance -= amount;
			System.out.println("Balance is" + balance);
		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SavingsAccount [minBalance=").append(minBalance).append("]");
		return builder.toString();
	}
}
