package com.assignment.java;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=25;
		boolean count=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
			count=false;
			break;
			}
		}
		if(count)
			System.out.println(n+ " is prime number ");
		else
			System.out.println(n+ " is not prime number ");
			}
		}

	



