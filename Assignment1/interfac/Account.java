package com.assignment.interfac;

public class Account {
double balance;
	
	public Account(double balance)
	{
		super();
		this.balance=balance;
	}
	
void withdraw(double amount)
{
System.out.println("account withdraw");	
}
void deposite(double amount)
{
	
System.out.println("account deposite");
}
public double getbalance()
{
	return balance;
	}
}

