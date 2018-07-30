package com.moneymoney.test;

import com.moneymoney.account.*;

public class Test {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount(101, 1000, "Satyen");
		System.out.println(account);
		
		SavingsAccount zeroBalanceAccount = new SavingsAccount(101, "Satyen");
		System.out.println(zeroBalanceAccount);
		
	}
}
