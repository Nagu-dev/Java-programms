package com.assignment.scanner;

import java.util.Scanner;

public class GreatestOfThreeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		String res=(a>b && a>b)?a+"is greatest":(b>c)?b+"is greatest":c+"is greatest";
		
System.out.println(res);
	}

}
