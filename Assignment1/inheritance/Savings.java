package com.assignment.inheritance;

public class Savings extends Account
{

	public Savings(double balance) {
		super(balance);
		
		
	}

	@Override
public	void withdraw(double amount) {
		balance =balance-amount;
		System.out.println("your amount has been debited from your account");
		System.out.println("please collect your money");
		System.out.println("than you !!!");
	}

	@Override
	public void deposite(double amount) {
		balance =balance+amount;
		System.out.println("your amount has been credited to your account");
		System.out.println("thank you!!");	
		
	}

}
