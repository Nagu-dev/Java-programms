package com.assignment.inheritance;

public class Cuurent extends Account
{

	public Cuurent(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
public	void withdraw(double amount) {
		balance =balance-amount;
		System.out.println("your amount has been debited from your account");
		System.out.println("please collect your money");
		System.out.println("thank you !!!");
	}

	@Override
	public void deposite(double amount) {
		balance =balance+amount;
		System.out.println("your amount has been credited to your account");
		System.out.println("thank you!!");
	}

}



