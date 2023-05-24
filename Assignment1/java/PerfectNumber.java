package com.assignment.java;

public class PerfectNumber {

	public static void main(String[] args)
	{
		int num=28,sum=0,temp=num;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
				
			}
			if(sum==temp)
				System.out.println(temp+ "is perfect number");
			else
				System.out.println(temp+ "is not perfect number");
		}
	}

}
