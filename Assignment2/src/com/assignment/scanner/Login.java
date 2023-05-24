package com.assignment.scanner;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]= {"appu","Nayana","Rani","rani"};
	
	System.out.println("enter the user name to login");
	String username=sc.next();
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i].equals(username))
		{
			System.out.println("you are logged in successfully");
			continue;
		}
		else
			System.out.println("invalid username");
		
		continue;
	}
	}

}
