package com.heraizen.cj.exception.bankass;


public class BankAccount {
	private int account_number;
	private String name;
	private String account_type;
	private double balance;

	public BankAccount(int account_number, String name, String account_type, int balance) {
		this.account_number = account_number;
		this.name = name;
		this.account_type = account_type;
		this.balance = balance;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccount_number() {
		return account_number;
	}

	public String getName() {
		return name;
	}

	public String getAccount_type() {
		return account_type;
	}

	public double getBalance() {
		if (balance < 1000) {
			try {
				throw new NumberFormatException();
			} catch (NumberFormatException nw) {
				System.out.println("Balance is low: " + balance);
			}
		}

		return balance;

	}

	
	//depsit or credit amount
	public void deposit(double amt) {
		if (amt < 0) {
			try {
				throw new NegativeAmount("Negaive Amount not able to deposit");
			} catch (NegativeAmount e) {
				System.out.println(e);
			}
		} else {
			balance = getBalance() + amt;
			System.out.println("After deposit, the balance is =" + balance);

		}

	}

	public void withdraw(double amt) {
		if (amt > 1000) {
			try {
				throw new InsufficientfundException("Withdraw is not possible because insufficient balance ");
			} catch (InsufficientfundException e) {
				System.out.println(e);
			}
		} else {
			balance = getBalance() - amt;
			System.out.println("After Withdraw, the balance is =" + balance);

		}

	}

	public void display() {
		System.out.println("Balance is =" + getBalance());
	}
}

