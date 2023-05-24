package com.assignment.inheritance;

import java.util.Scanner;

import com.assignment.abstrct.Account;
import com.assignment.abstrct.Current;
import com.assignment.abstrct.Savings;

public class AtmMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("ATM machine");
int withdraw,getbalance=100000,deposite;
String type= null;
Account account=new Account(getbalance);
Current current=new Current(getbalance);
Savings savings =new Savings(getbalance);

while(true)
{
	
System.out.println("enter the option");
System.out.println("1 withdraw");
System.out.println("2  deposite");
System.out.println("3 getbalance");
System.out.println("4 exit");

int choice=sc.nextInt();
double x;
switch(choice)
{
case 1:

System.out.println("enter the account type");
type=sc.next();
System.out.println("enter the money to withdraw");
withdraw=sc.nextInt();
if(type.equals("current"))
	current.withdraw(withdraw);
	else if(type.equals("savings"))
		savings.withdraw(withdraw);
	break;
	
	case 2:
		System.out.println("enter the account type");
		type=sc.next();
		System.out.println("enter the money to deposie");
		deposite=sc.nextInt();
		if(type.equals("current"))
			current.deposite(deposite);
			else if(type.equals("savings"))
				savings.deposite(deposite);
			break;
			
	case 3:
		System.out.println("enter the account type");
		type=sc.next();
		if(type.equals("current"))
			getbalance=(int)current.getbalance();
		System.out.println("your account balance is :"+getbalance);
		
		if(type.equals("savings"))
			getbalance=(int)savings.getbalance();
		System.out.println("your account balance is :"+getbalance);
			
			break;
default:
	System.out.println("you have entered the wrong option");
	
}
System.out.println();
System.out.println();
}
}
	}



		


