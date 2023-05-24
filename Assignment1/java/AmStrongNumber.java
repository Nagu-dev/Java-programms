package com.assignment.java;
import java.util.Scanner;
public class AmStrongNumber {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int temp=n;
int num=temp;
int count=0;
int sum=0;
while(n>0)
{
	count++;
	n=n/10;
	}
	while(temp>0)
	{
		int rem=temp%10;
		int prd=1;
		for(int i=1;i<=count;i++)// 153=1^3+5^3+3^3
			                       //    =1+125+27=>153
		{
			prd=prd*rem;
			
		}
		sum=sum+prd;
		temp=temp/10;
	}
	if(sum==num)
	{
		System.out.println("amstrong number");
	}
	else
	{
		System.out.println("not amstrong number");
	}
	}

}
