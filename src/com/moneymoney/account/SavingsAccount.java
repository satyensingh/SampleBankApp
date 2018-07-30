package com.moneymoney.account;

public class SavingsAccount {
	
	private static final String BANK_NAME="Money Money Bank";
	private final int accountNumber;
	private double accountBalance;
	private String accountHolder;
	private static double interestRate;
	
	public SavingsAccount(int accountNumber, double accountBalance, String accountHolder) {
		this(accountNumber, accountHolder);
		this.accountBalance = accountBalance;
	}

	public SavingsAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	void deposit(double amount) {
		accountBalance += amount;
	}
	void withdraw(double amount) {
		accountBalance -= amount;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		SavingsAccount.interestRate = interestRate;
	}
	public static String getBankName() {
		return BANK_NAME;
	}
	public int getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ ", accountHolder=" + accountHolder + "]";
	}
}
