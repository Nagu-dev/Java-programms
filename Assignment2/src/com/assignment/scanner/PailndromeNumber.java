package com.assignment.scanner;

import java.util.Scanner;

public class PailndromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0,temp=num,rem=0;
		
			
			while(num>0)
			{
				rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
	}
			System.out.println("the reverse of the given number is "+sum);
			if(temp==sum)
			{
				System.out.println("the entered number is palindrome");
			}
			else
			{
				System.out.println("the entered number is not a palindrome");
			}
	}
		
	}


