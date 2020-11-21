package com.heraizen.cj.exception.bank;

public class CurrentAccount extends BankAccount {
	private double minBalance = 1000;

	public CurrentAccount(String custName, String accountType, double balance) {
		super(custName, accountType, balance);
	}

	@Override
	public void withDraw(double amount) throws InsufficientfundException {
		if (amount > this.balance + minBalance) {
			throw new InsufficientfundException("Sorry you dont have sufficient balance" + amount);

		} else {
			this.balance -= amount;
			System.out.println("Balance is" + balance);
		}

	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CurrentAccount [minBalance=").append(minBalance).append(", accNo=").append(accNo)
				.append(", custName=").append(custName).append(", accountType=").append(accountType)
				.append(", balance=").append(balance).append("]");
		return builder.toString();
	}
}
