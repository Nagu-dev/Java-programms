package com.assignment.scanner;

import java.util.Scanner;

public class SmallestThreNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three values");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
	
	c=sc.nextInt();
	
	if(a<b && a<c)
	{
		System.out.println("a is smaller");
		
	}
	else if(b<c)
		System.out.println("b is smaller");
	else
		System.out.println("c is smaller");
	}
		
}
